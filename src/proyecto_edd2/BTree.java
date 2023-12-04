package proyecto_edd2;

import java.io.Serializable;
import java.util.ArrayList;

public class BTree implements Serializable {

    private Node root;
    private ArrayList<Node> nodes = new ArrayList();
    private int N; //defino por numero de sectores

    public BTree() {
    }

    public BTree(int node_slots) {
        //this.root = root;
        root = new Node();
        this.N = node_slots;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public int getNode_slots() {
        return N;
    }

    public void setNode_slots(int N) {
        this.N = N;
    }

    public Node getLeftNeighbor(int pos, Node node) {
        if (pos > 0) {
            return node.getParent().getChildren().get((pos - 1));
        }
        return null;
    }

    public Node getRightNeighbor(int pos, Node node) {
        if (pos < node.getParent().getChildren().size() - 1) {
            return node.getParent().getChildren().get((pos + 1));
        }
        return null;
    }

    public void insert(String key) {
        //int key_Int = Integer.parseInt(key);
        Node parent = root;
        if (parent.getKeys().size() == (N - 1)) {
            Node temp = new Node();
            root = temp;
            temp.setLeaf(false);
            temp.setN(0);
            //temp.getChildren().get(0).setNode(parent);
            temp.getChildren().set(0, parent);
            Split(temp, 0, parent);
            nonfullInsertCase(temp, key);
        } else {
            nonfullInsertCase(parent, key);
        }
    }

    private void nonfullInsertCase(Node node, String key) {
        int key_Int = Integer.parseInt(key);
        int keys_cant = node.getKeys().size() - 1;

        if (node.isLeaf()) {
            for (int i = 0; i < keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int < key_i) {
                    i--;
                    node.getKeys().add(i, key);
                    break;
                }
            }
        } else {
            for (int i = 0; i < keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int < key_i) {
                    i--;
                    if (node.getChildren().get(i).getKeys().size() == N - 1) {
                        Split(node, i, node.getChildren().get(i));
                        if (key_Int > key_i) {
                            i++;
                        }
                    }
                    nonfullInsertCase(node.getChildren().get(i), key);
                    break;
                }
            }

        }
    }

    private void Split(Node root, int pos, Node node) {
        Node temp = new Node();
        temp.setLeaf(node.isLeaf());
        int right = (N - 1) / 2;
        temp.setN(right);
        for (int i = 0; i < right; i++) {
            //temp.getKeys().add(node.getKeys().get(i+right+1));
            temp.getKeys().set(i, node.getKeys().get(i + right + 1));
        }
        if (!node.isLeaf()) {
            for (int i = 0; i < right + 1; i++) {
                //temp.getChildren().get(i).setNode(node.getChildren().get(i+right+1));
                temp.getChildren().set(i, node.getChildren().get(i + right + 1));
            }
        }
        node.setN(right);
        for (int i = root.getN(); i > pos; i--) {
            root.getChildren().set(i + 1, root.getChildren().get(i));
        }
        root.getChildren().set(pos + 1, temp);
        for (int i = root.getN(); i > pos; i--) {
            root.getKeys().set(i + 1, root.getKeys().get(i));
        }
        root.getKeys().set(pos, node.getKeys().get(right));
        root.setN(root.getN() + 1);
    }

//    public void insertElement(String key){
//        Node node = root; 
//        if (node.getKeys().size()==(N-1)) {
//            Split();
//            InsertHere(node, key);
//        }else{
//            InsertHere(node, key);
//        }
//    }
//    private void InsertHere(Node node, String key){
//        int keys_limit = node.getKeys().size()-1;
//        int key_int = Integer.parseInt(key); 
//        if (node.isLeaf()) {
//            for (int i = 0; i < keys_limit; i++) {
//                int key_i = Integer.parseInt(node.getKeys().get(i));
//                if (key_int<key_i) {
//                    i--;
//                    node.getKeys().add(i, key);
//                    break;
//                }
//            }
//        }else{
//            
//        }
//    }
    private Node Split(ArrayList<String> keys, String key) {
        Node root_temp = new Node();
        int key_int = Integer.parseInt(key);
        boolean valid = false;

        int left_limit = ((N - 1) / 2) - 1;
        int center_pos = (left_limit + 1);

        ArrayList<String> keys_temp = new ArrayList();
        for (int i = 0; i < keys.size(); i++) {
            int key_i = Integer.parseInt(keys.get(i));
            if (key_int < key_i && !valid) {
                keys_temp.add(key);
                valid = true;
            }
            keys_temp.add(keys.get(i));
            if (!valid && i == keys.size() - 1) {
                keys_temp.add(key);
            }
        }

        root_temp.getKeys().add(keys_temp.get(center_pos));
        ArrayList<String> left = new ArrayList();
        ArrayList<String> right = new ArrayList();
        for (int i = 0; i < keys_temp.size(); i++) {
            if (i < center_pos) {
                left.add(keys_temp.get(i));
            }
            if (i > center_pos) {
                right.add(keys_temp.get(i));
            }
        }

        Node left_child = new Node();
        left_child.setKeys(left);
        Node right_child = new Node();
        right_child.setKeys(right);

        if (root.getChildren() == null) {
            root_temp.getChildren().add(left_child);
            root_temp.getChildren().add(right_child);
        } else {
            root.getKeys().add(keys_temp.get(center_pos));
            root.getChildren().get(N - 1).setParent(left_child);
            root.getChildren().add(right_child);

        }

        return root_temp;
    }

    public Node search(Node temp, int key) {
        ArrayList<String> keys = temp.getKeys();
        int indice = 0;

        while (indice < keys.size() && key > Integer.parseInt(keys.get(indice))) {
            indice++;
        }

        if (indice < keys.size() && key == Integer.parseInt(keys.get(indice))) {
            return temp;
        }

        if (temp.isLeaf()) {
            return null;
        } else {
            return search(temp.getChildren().get(indice), key);
        }
    }

    public void delete(Node temp, int key) {
        if (temp.isLeaf()) {
            temp.getKeys().remove(key);

            if (temp.getKeys().size() < (N - 1) / 2) {//si el nodo hoja tiene menos que la cantidad de llaves permitidas
                Node neighbor;
                int pos, node_pos = temp.getParent().getChildren().indexOf(temp);

                //buscamos el vecino mas populoso y la pos de la key de la root entre ellos
                if (getLeftNeighbor(node_pos, temp).getKeys().size() > getRightNeighbor(node_pos, temp).getKeys().size() || getLeftNeighbor(node_pos, temp).getKeys().size() == getRightNeighbor(node_pos, temp).getKeys().size()) {
                    neighbor = getLeftNeighbor(node_pos, temp);
                    pos = neighbor.getParent().getChildren().indexOf(neighbor);
                } else {
                    neighbor = getRightNeighbor(node_pos, temp);
                    pos = temp.getParent().getChildren().indexOf(temp);
                }

                merge(neighbor, temp, pos);
                if (neighbor.getKeys().size() > N - 1) {//caso overflowed
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent().getKeys().size() > neighbor.getParent().getChildren().size()) { //caso que hayan mas hijos que llaves
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent().getKeys().isEmpty()) {//si el nodo parent queda vacio
                    neighbor.setLeaf(false);
                    neighbor.setParent(null);
                }

            }
        } else {//si no es hoja
            int node_pos = temp.getParent().getChildren().indexOf(temp), pos_lastkey = temp.getChildren().get(node_pos).getKeys().size()-1;
            if (getLeftNeighbor(node_pos, temp).getKeys().size() > (N - 1) / 2) {
                String predecessorkey = temp.getChildren().get(node_pos).getKeys().get(pos_lastkey);
                temp.getKeys().set(key, predecessorkey);
                temp.getChildren().get(node_pos).getKeys().set(pos_lastkey, String.valueOf(key));
                delete(temp.getChildren().get(node_pos),pos_lastkey);
            }
        }
    }

    public void merge(Node neighbor, Node dyingnode, int pos_key_parent) {
        ArrayList<String> newkeys = new ArrayList();
        int keyparent = Integer.parseInt(dyingnode.getParent().getKeys().get(pos_key_parent));

        if (!dyingnode.getKeys().isEmpty()) {
            if (Integer.parseInt(neighbor.getKeys().get(0)) < Integer.parseInt(dyingnode.getKeys().get(0))) {
                neighbor.getKeys().add(neighbor.getParent().getKeys().get(pos_key_parent));

                for (int i = 0; i < neighbor.getKeys().size(); i++) {
                    newkeys.add(neighbor.getKeys().get(i));
                }
                for (int i = 0; i < dyingnode.getKeys().size(); i++) {
                    newkeys.add(dyingnode.getKeys().get(i));
                }
            } else {
                dyingnode.getKeys().add(dyingnode.getParent().getKeys().get(pos_key_parent));

                for (int i = 0; i < dyingnode.getKeys().size(); i++) {
                    newkeys.add(dyingnode.getKeys().get(i));
                }
                for (int i = 0; i < neighbor.getKeys().size(); i++) {
                    newkeys.add(neighbor.getKeys().get(i));
                }
            }

            neighbor.setKeys(newkeys);
        } else {
            if (Integer.parseInt(neighbor.getKeys().get(0)) < keyparent) {
                neighbor.getKeys().add(neighbor.getParent().getKeys().get(pos_key_parent));
            } else {
                neighbor.getKeys().add(0, neighbor.getParent().getKeys().get(pos_key_parent));
            }
        }

        neighbor.getParent().removeKey(pos_key_parent);
        dyingnode.getParent().getChildren().remove(dyingnode.getParent().getChildren().indexOf(dyingnode));
    }
    
    public String PredecessorKey(Node x) {//devuelve el ultimo key del node anterior
        if (x.getParent().getChildren().indexOf(x) > 0) {
            int pos = x.getParent().getChildren().indexOf(x) - 1;

            return getLeftNeighbor(pos, x).getKeys().get(x.getParent().getChildren().get(pos).getKeys().size() - 1);
        } else {
            return null;
        }
    }

    public String SuccessorKey(Node x) {//devuelve el primer key del node siguiente
        if (x.getParent().getChildren().indexOf(x) < x.getParent().getChildren().size() - 1) {
            int pos = x.getParent().getChildren().indexOf(x) + 1;

            return getRightNeighbor(pos, x).getKeys().get(0);
        } else {
            return null;
        }
    }

}
