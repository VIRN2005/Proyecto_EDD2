package proyecto_edd2;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Node implements Serializable {

    //private ArrayList<Integer> RRNs= new ArrayList();
    private ArrayList<SearchEngine> keys = new ArrayList();
    private ArrayList<Node> children = new ArrayList();
    private boolean leaf;
    Node parent; //parent
    int key_pos,n; //cantidad de llaves en el nodo

    public Node() {
        n = 0;
        leaf = true;
    }

    public Node(Node parent, boolean leaf) {
        this.parent = parent;
        this.leaf = leaf;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getKey_pos() {
        return key_pos;
    }

    public void setKey_pos(int key_pos) {
        this.key_pos = key_pos;
    }

    public ArrayList<SearchEngine> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<SearchEngine> keys) {
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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void removeKey(int rrn) {
        if (!keys.isEmpty()) {
            if (rrn <= keys.size() - 1) {
                keys.remove(rrn);
            } else {
                JOptionPane.showMessageDialog(null, "RRN no valido", "Warning", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay llaves dentro de este nodo", "Warning", INFORMATION_MESSAGE);
        }
    }

    public void removeChild(int rrn) {
        if (!children.isEmpty()) {
            if (rrn <= children.size() - 1) {
                children.remove(rrn);
            } else {
                JOptionPane.showMessageDialog(null, "RRN no valido", "Warning", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este nodo no tiene hijos", "Warning", INFORMATION_MESSAGE);
        }
    }
    
    public void imprimir(){
        //System.out.println("-->"+n);
        System.out.print("[");
        
        for (int i = 0; i < keys.size(); i++) {
            //System.out.println("entro");
            if (i < keys.size() - 1) {
                System.out.print(keys.get(i) + " | ");
            } else {
                System.out.print(keys.get(i));
            }
        }
        System.out.print("]");
    }
}
