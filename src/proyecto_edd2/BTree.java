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
            System.out.println("Entre 1");
            Node temp = new Node(null, false);
            root = temp;
            temp.setLeaf(false);
            temp.setN(0);
            //temp.getChildren().get(0).setNode(parent);
            temp.getChildren().add(parent);
            temp.setParent(root);
            Split(temp, 0, parent);
            //parent = root;
            nonfullInsertCase(temp, key);

        } else {
            nonfullInsertCase(parent, key);
            //System.out.println("Entro 2");
        }
    }

    private void nonfullInsertCase(Node node, String key) {
        int key_Int = Integer.parseInt(key);
        //System.out.println();
        int keys_cant = node.getKeys().size() - 1;

        if (node.isLeaf()) {

            int pos = 0;
            for (int i = 0; i <= keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int < key_i) {
                    pos = i;
                    break;
                }
                if (i == keys_cant) {
                    pos = keys_cant + 1;
                }
            }
            node.getKeys().add(pos, key);
            node.setN(node.getN() + 1);

        } else {
            int pos = 0;
            for (int i = 0; i <= keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int < key_i) {
                    pos = i;
                    break;
                }
                if (i == keys_cant) {
                    pos = keys_cant + 1;
                }
            }
            if (node.getChildren().get(pos).getKeys().size() == N - 1) {
                Split(node, pos, node.getChildren().get(pos));
                if (key_Int > Integer.parseInt(node.getKeys().get(pos))) {
                    pos++;
                }
            }
            nonfullInsertCase(node.getChildren().get(pos), key);

        }
    }

    public void Split(Node next_root, int pos, Node root) {
        Node temp = new Node(next_root, root.isLeaf());
        int cant_keys = root.getKeys().size() - 1;
        int min_keys = (N - 1) / 2;

        //right node
        for (int i = cant_keys; i >= min_keys; i--) {
            temp.getKeys().add(0, root.getKeys().get(i));
            root.getKeys().remove(i);
        }

        if (!root.isLeaf()) {
            for (int i = 0; i <= min_keys; i++) {
                temp.getChildren().add(root.getChildren().get(min_keys + 1));
                root.getChildren().remove(min_keys + 1);
            }
        }
        next_root.getChildren().add(pos + 1, temp);
        next_root.getKeys().add(pos, temp.getKeys().get(0));
        temp.removeKey(0);
    }

    public Node search(Node temp, String key) {
        ArrayList<String> keys = temp.getKeys();
        int indice = 0;

        while (indice < keys.size() && Integer.parseInt(key) > Integer.parseInt(keys.get(indice))) {
            indice++;
        }

        if (indice < keys.size() && Integer.parseInt(key) == Integer.parseInt(keys.get(indice))) {
            return temp;
        }

        if (temp.isLeaf()) {
            return null;
        } else {
            return search(temp.getChildren().get(indice), key);
        }
    }

    public void deleteVictor(Node temp, String key) {
        if (temp.isLeaf()) {
            System.out.println("\nLlave en nodo hoja: " + key);
            temp.getKeys().remove(key);

            if (temp.getKeys().size() < (N - 1) / 2) {
                Node neighbor;
                int pos, node_pos = temp.getParent().getChildren().indexOf(temp);

                // Buscamos el vecino más populoso y la posición de la clave de la raíz entre ellos
                Node leftNeighbor = getLeftNeighbor(node_pos, temp);
                Node rightNeighbor = getRightNeighbor(node_pos, temp);

                if (leftNeighbor.getKeys().size() > rightNeighbor.getKeys().size() || leftNeighbor.getKeys().size() == rightNeighbor.getKeys().size()) {
                    neighbor = leftNeighbor;
                    pos = neighbor.getParent().getChildren().indexOf(neighbor);
                } else {
                    neighbor = rightNeighbor;
                    pos = temp.getParent().getChildren().indexOf(temp);
                }

                merge(neighbor, temp, pos);

                if (neighbor.getKeys().size() > N - 1) { // Caso de desbordamiento
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent().getKeys().size() > neighbor.getParent().getChildren().size()) { // Caso con más hijos que llaves
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent().getKeys().isEmpty()) { // Si el nodo padre queda vacío
                    neighbor.setLeaf(false);
                    neighbor.setParent(null);
                }
            }
        } else { // Si no es hoja
            int node_pos = 0;
            int pos_lastkey;

            if (temp.getParent() != null) { // Si NO es nodo raíz
                node_pos = temp.getParent().getChildren().indexOf(temp);
            }

            pos_lastkey = temp.getChildren().get(node_pos).getKeys().size() - 1;
            String predecessorKey = temp.getChildren().get(node_pos).getKeys().get(pos_lastkey);
            temp.getChildren().get(node_pos).getKeys().remove(pos_lastkey); // Eliminar la clave del nodo hijo anterior

            temp.getChildren().get(node_pos + 1).getKeys().add(0, String.valueOf(key)); // Colocar la nueva clave en el siguiente nodo
            temp.getKeys().set(node_pos, predecessorKey);

            deleteVictor(temp.getChildren().get(node_pos + 1), key); // Llamar recursivamente al siguiente nodo
        }
    }

    public void delete(Node root, String key) {
        Node temp = search(root, key);
        if (temp.isLeaf()) {
            int node_pos = temp.getParent().getChildren().indexOf(temp);
//            int pos_key = temp.getParent().getChildren().get(node_pos).getKeys().indexOf(key);
            root.getKeys().remove(key);

            if (temp.getKeys().size() < (N - 1) / 2) {//si el nodo hoja tiene menos que la cantidad de llaves permitidas
                Node neighbor = new Node(), rightN = getRightNeighbor(node_pos, temp), leftN = getLeftNeighbor(node_pos, temp);
                int pos = 0;

                //buscamos el vecino mas populoso y la pos de la key de la root entre ellos
                if (leftN != null && (leftN.getKeys().size() > rightN.getKeys().size() || leftN.getKeys().size() == rightN.getKeys().size())) {
                    neighbor = leftN;
                    pos = neighbor.getParent().getChildren().indexOf(neighbor);
                } else if (rightN != null) {
                    neighbor = rightN;
                    pos = node_pos;
                }

                merge(neighbor, temp, pos);

                if (neighbor.getKeys().size() > N - 1) {//caso overflowed
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent().getKeys().size() > neighbor.getParent().getChildren().size()) { //caso que hayan mas hijos que llaves
                    Split(neighbor.getParent(), pos, neighbor);
                }
                if (neighbor.getParent() == null) {//si el nodo parent queda vacio
                    neighbor.setLeaf(false);
                    neighbor.setParent(null);
                }

            }
        } else {//si no es hoja
            int pos_lastkey, flag = 0;
            int pos_key = temp.getKeys().indexOf(key);

            if (temp.getParent() != null) {//si NO es nodo raiz
                flag = 1;
            }

            String predecessorkey = PredecessorKey(temp, flag, key);
            Node child = search(temp, predecessorkey);
            pos_lastkey = child.getKeys().size() - 1;

            child.getKeys().set(pos_lastkey, key);//colocar el nuevo key en el nodo hijo izquierdo
            temp.getKeys().set(pos_key, predecessorkey);

            delete(child, key);
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
            neighbor.getParent().removeKey(pos_key_parent);
            dyingnode.getParent().getChildren().remove(dyingnode.getParent().getChildren().indexOf(dyingnode));
        } else {
            String key = neighbor.getParent().getKeys().get(pos_key_parent);
            if (pos_key_parent > Integer.parseInt(neighbor.getKeys().get(0))) {
                neighbor.getKeys().add(key);
            } else {
                neighbor.getKeys().add(0, key);
            }
        }
    }

    public String PredecessorKey(Node x, int flag, String key) {//devuelve el key mas grande de la izquierda del node 
        switch (flag) {
            case 0://primer nodo es raiz
                if (x.getParent() == null) {//si es raiz
                    return PredecessorKey(x.getChildren().get(0), flag, key);
                } else if (!x.isLeaf()) {//si no es hoja
                    int pos = x.getChildren().size() - 1;

                    if (x.getChildren().get(0).isLeaf()) {
                        flag = 2;
                    }

                    return PredecessorKey(x.getChildren().get(pos), flag, key);
                }
            case 1://primer nodo es padre
                int pos = x.getKeys().indexOf(key);

                if (x.getChildren().get(0).isLeaf()) {
                    flag = 2;
                }

                return PredecessorKey(x.getChildren().get(pos), flag, key);
        }

        int posnode = x.getParent().getChildren().indexOf(x);
        ArrayList<String> keys = x.getParent().getChildren().get(posnode).getKeys();
        return keys.get(keys.size() - 1);
    }

}
