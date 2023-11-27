
package proyecto_edd2;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Node implements Serializable{
    //private ArrayList<Integer> RRNs= new ArrayList();
    private ArrayList<String> keys= new ArrayList();
    private ArrayList<Node>children= new ArrayList();
    private boolean leaf;
    Node node; 
    //int n; //orden del arbol 
    
    public Node(){
    }
    
    public Node(Node node, boolean leaf){
        this.node = node; 
        this.leaf = leaf;
    }

    public ArrayList<String> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<String> keys) {
        this.keys = keys;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    public void removeKey(int rrn){
        if (!keys.isEmpty()) {
            if (rrn<=keys.size()-1) {
                keys.remove(rrn);
            }else{
                JOptionPane.showMessageDialog(null, "RRN no valido", "Warning", WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay llaves dentro de este nodo", "Warning", INFORMATION_MESSAGE);
        }
    }
    public void removeChild(int rrn){
        if (!children.isEmpty()) {
            if (rrn<=children.size()-1) {
                children.remove(rrn);
            }else{
                JOptionPane.showMessageDialog(null, "RRN no valido", "Warning", WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este nodo no tiene hijos", "Warning", INFORMATION_MESSAGE);
        }
    }
}
