
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
            Split();
            Insert(node, key);
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
                if (key_int>key_i) {
                    i--;
                    node.getKeys().add(i, key);
                    break;
                }
            }
        }else{
            
        }
    }
    private void Split(){
        
    }
}
