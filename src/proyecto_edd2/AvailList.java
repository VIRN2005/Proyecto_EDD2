
package proyecto_edd2;

public class AvailList {
    private Nodo inicio;
    private Nodo fin;
    private int n, size;

    public AvailList() {
        inicio = null;
        fin = null;
        n = 0;
        size = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

    public void anula() {
        inicio = null;
        fin = null;
        n = 0;
        size = 0; 
    }
    public int recupera(int pos) {
        int posCode = pos - 1;
        Nodo temp = inicio;
        int i = 0;
        if (posCode >= 0 && posCode < n && inicio != null) {
            while (i != posCode) {
                temp = temp.getNext();
                i++;
            }
            int item = temp.getItem();
            return item;
        } else {
            return -1;
        }
    }

    public boolean inserta(int item, int pos) {
        System.out.println("ENtra");
        int pos_code = pos - 1;
        if (pos_code >= 0 && pos_code <= n) {
            System.out.println("entra");
            Nodo newNode = new Nodo();
            newNode.setItem(item);
            if (pos_code == 0) {
                if (inicio == null) {
                    fin = newNode;
                } else {
                    Nodo temp_siguiente = inicio;
                    temp_siguiente.setBack(newNode);
                    newNode.setNext(temp_siguiente);
                }
                inicio = newNode;
            } else {
                if (pos_code == n) {
                    Nodo temp_anterior = fin;
                    newNode.setBack(temp_anterior);
                    temp_anterior.setNext(newNode);
                    fin = newNode;
                } else {
                    int i = 0;
                    Nodo temp = inicio;
                    while (i != pos_code) {
                        temp = temp.getNext();
                        i++;
                    }
                    Nodo anterior = temp.getBack();
                    Nodo siguiente = temp;
                    newNode.setBack(anterior);
                    newNode.setNext(siguiente);
                    anterior.setNext(newNode);
                    siguiente.setBack(newNode);
                }
            }
            n++;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int siguiente(int pos) {
        int posCode = pos - 1;
        Nodo temp = inicio;
        int i = 0;
        if (posCode >= 0 && posCode < n - 1 && inicio != null) {
            while (i != posCode) {
                temp = temp.getNext();
                i++;
            }
            Nodo siguiente = temp.getNext();
            return siguiente.getItem();
        } else {
            return -1;
        }
    }

    // Muestra el elemento anterior de la posicion ingresada
    public int anterior(int pos) {
        int posCode = pos - 1;
        Nodo temp = inicio;
        int i = 0;
        if (posCode > 0 && posCode < n && inicio != null) {
            while (i != posCode) {
                temp = temp.getNext();
                i++;
            }
            Nodo anterior = temp.getBack();
            return anterior.getItem();
        } else {
            return -1;
        }
    }

    /*Imprime elementos de la lista en su orden actual*/
    public void imprimirLista() {
        Nodo temp = inicio;
        if (n > 0) {
            System.out.println("Lista: ");
            while (temp != null) {
                System.out.println(" -> " + temp.getItem());
                temp = temp.getNext();
            }
        } else {
            System.out.println("$ Lista esta vacia");
        }
    }

    //Borra elementos de la lista acorde a la posicion
    public boolean suprime(int pos) {
        int posCode = pos - 1;
        Nodo temp = inicio;
        if (posCode >= 0 && posCode < n) {
            int i = 0;
            while (i != posCode) {
                temp = temp.getNext();
                i++;
            }
            if (pos == 0) {
                Nodo newInicio = temp.getNext();
                newInicio.setBack(null);
                temp.setNext(null);
                inicio = newInicio;
                temp = null;
            } else {
                if (pos == n) {
                    Nodo newFin = temp.getBack();
                    newFin.setNext(null);
                    temp.setBack(null);
                    fin = newFin;
                    temp = null;
                } else {
                    Nodo siguiente = temp.getNext();
                    Nodo anterior = temp.getBack();
                    anterior.setNext(siguiente);
                    siguiente.setBack(anterior);
                    temp.setBack(null);
                    temp.setNext(null);
                    temp = null;
                }
            }
            n--;
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int primero() { //el primer elemento de la lista
        return inicio.getItem();
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

}
