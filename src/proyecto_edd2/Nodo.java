/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd2;

/**
 *
 * @author tatig
 */
public class Nodo {
    private Nodo siguiente;
    private int item;
    private Nodo anterior;
    
    public Nodo() {
        siguiente = null;
        item = -1;
        anterior = null;
    }
    
    public void liberarMemoria() {
        if (siguiente != null) {
            siguiente = null;
        }
        if (item != -1) {
            item = -1;
        }
        anterior = null;
    }
    
    public Nodo getNext() {
        return siguiente;
    }
    
    public void setNext(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo getBack() {
        return anterior;
    }
    
    public void setBack(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public int getItem() {
        return item;
    }
    
    public void setItem(int item) {
        this.item = item;
    }
}
