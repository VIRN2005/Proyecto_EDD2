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

    public void delete(Node temp, int pos_key) {
        if (temp.isLeaf()) {
            System.out.println("\nkey hoja: " + pos_key);
            temp.getKeys().remove(pos_key);

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
            int node_pos = 0, pos_lastkey;

            if (temp.getParent() != null) {//si NO es nodo raiz
                node_pos = temp.getParent().getChildren().indexOf(temp);
            }

            pos_lastkey = temp.getChildren().get(node_pos).getKeys().size() - 1;
            String predecessorkey = temp.getChildren().get(node_pos).getKeys().get(pos_lastkey);
            temp.getChildren().get(node_pos).getKeys().remove(pos_lastkey);//eliminar el key del nodo hijo anterior

            temp.getChildren().get(node_pos + 1).getKeys().add(0, String.valueOf(temp.getKeys().get(pos_key)));//colocar el nuevo key en el siguiente nodo
            temp.getKeys().set(pos_key, predecessorkey);

            delete(temp.getChildren().get(node_pos + 1), 0);

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
