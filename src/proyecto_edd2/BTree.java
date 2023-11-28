
package proyecto_edd2;

import java.io.Serializable;
import java.util.ArrayList;

public class BTree implements Serializable {
    private Node root; 
    private ArrayList<Node>nodes = new ArrayList(); 
    private int N; //defino por numero de sectores

    public BTree() {
    }
    
    public BTree(Node root,int node_slots) {
        this.root = root;
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
    
    public void insertElement(String key){
        Node node = root; 
        if (node.getKeys().size()==(N-1)) {
            Split(node.getKeys(),key);
            //Insert(node, key);
        }else{
            Insert(node, key);
        }
    }
    private void Insert(Node node, String key){
        int keys_limit = node.getKeys().size()-1;
        int key_int = Integer.parseInt(key); 
        if (node.isLeaf()) {
            for (int i = 0; i < keys_limit; i++) {
                int key_i = Integer.parseInt(node.getKeys().get(i));
                if (key_int<key_i) {
                    i--;
                    node.getKeys().add(i, key);
                    break;
                }
            }
        }else{
            
        }
    }
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
