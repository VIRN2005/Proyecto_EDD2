
package proyecto_edd2;

import java.io.Serializable;
import java.util.ArrayList;

public class BTree implements Serializable {
    private Node root; 
    private ArrayList<Node>nodes = new ArrayList(); 
    private int N; //defino por numero de sectores

    public BTree() {
    }
    
    public BTree(int node_slots) {
        //this.root = root;
        root= new Node();
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
    //Realmente use rrn, pero creo que tuve que usar pos ahora que pienso, creo que el rrn es con otra cosa xD
    public Node getLeftNeighbor(int node_rrn, Node root){
        Node neighbor = null; 
        if (node_rrn>0) {
            return root.getChildren().get((node_rrn-1)); 
        }
        return neighbor;
    }
    public Node getRightNeighbor(int node_rrn, Node root){
        Node neighbor = null; 
        if (node_rrn<(N-1)) {
            neighbor = root.getChildren().get((node_rrn+1));
        }
        return neighbor; 
    }
    
    public void insert(String key){
        //int key_Int = Integer.parseInt(key);
        Node parent = root; 
        if (parent.getKeys().size()==(N-1)) {
            Node temp = new Node();
            root = temp;
            temp.setLeaf(false);
            temp.setN(0);
            //temp.getChildren().get(0).setNode(parent);
            temp.getChildren().set(0, parent);
            Split(temp,0,parent);
            nonfullInsertCase(temp, key);
        }else{
            nonfullInsertCase(parent, key);
        }
    }
    private void nonfullInsertCase(Node node, String key){
        int key_Int = Integer.parseInt(key);
        int keys_cant = node.getKeys().size()-1;
        
        if (node.isLeaf()) {
            for (int i = 0; i < keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int<key_i) {
                    i--;
                    node.getKeys().add(i, key);
                    break;
                }
            }
        }else{
            for (int i = 0; i < keys_cant; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_Int<key_i) {
                    i--;
                    if (node.getChildren().get(i).getKeys().size()==N-1) {
                        Split(node,i,node.getChildren().get(i));
                        if (key_Int>key_i) {
                            i++;
                        }
                    }
                    nonfullInsertCase(node.getChildren().get(i),key);
                    break;
                }
            }
            
        }
    }
    
    private void Split(Node root, int pos, Node node){
        Node temp = new Node();
        temp.setLeaf(node.isLeaf());
        int right = (N-1)/2;
        temp.setN(right);
        for (int i = 0; i <right; i++) {
            //temp.getKeys().add(node.getKeys().get(i+right+1));
            temp.getKeys().set(i, node.getKeys().get(i+right+1));
        }
        if (!node.isLeaf()) {
            for (int i = 0; i < right+1; i++) {
                //temp.getChildren().get(i).setNode(node.getChildren().get(i+right+1));
                temp.getChildren().set(i, node.getChildren().get(i+right+1));
            }
        }
        node.setN(right);
        for (int i = root.getN(); i > pos; i--) {
            root.getChildren().set(i+1, root.getChildren().get(i));
        }
        root.getChildren().set(pos+1, temp);
        for (int i = root.getN(); i > pos; i--) {
            root.getKeys().set(i+1, root.getKeys().get(i));
        }
        root.getKeys().set(pos, node.getKeys().get(right));
        root.setN(root.getN()+1);
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
    private Node Split(ArrayList<String>keys,String key){
        Node root_temp = new Node(); 
        int key_int = Integer.parseInt(key); 
        boolean valid=false; 
        
        int left_limit = ((N-1)/2)-1;
        int center_pos = (left_limit+1);
        
        ArrayList<String>keys_temp = new ArrayList();
        for (int i = 0; i < keys.size(); i++) {
            int key_i = Integer.parseInt(keys.get(i));
            if (key_int<key_i&&!valid) {
                keys_temp.add(key);
                valid = true; 
            }
            keys_temp.add(keys.get(i));
            if (!valid&&i==keys.size()-1) {
                keys_temp.add(key);
            }
        }
        
        root_temp.getKeys().add(keys_temp.get(center_pos));
        ArrayList<String>left = new ArrayList();
        ArrayList<String>right = new ArrayList();
        for (int i = 0; i < keys_temp.size(); i++) {
            if (i<center_pos) {
                left.add(keys_temp.get(i));
            }
            if (i>center_pos) {
                right.add(keys_temp.get(i));
            }
        }
        
        Node left_child = new Node();
        left_child.setKeys(left);
        Node right_child = new Node();
        right_child.setKeys(right);
        
        if (root.getChildren()==null) {
            root_temp.getChildren().add(left_child);
            root_temp.getChildren().add(right_child);
        }else{
            root.getKeys().add(keys_temp.get(center_pos));
            root.getChildren().get(N-1).setNode(left_child);
            root.getChildren().add(right_child);
            
        }
        
        return root_temp; 
    }
}
