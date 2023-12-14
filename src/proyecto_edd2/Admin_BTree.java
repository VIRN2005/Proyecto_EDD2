package proyecto_edd2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Admin_BTree {

    private ArrayList<BTree> list = new ArrayList();
    private java.io.File file = null;
    private BTree arbolito_navidad;

    public Admin_BTree() {
    }

    public Admin_BTree(String path) {
        file = new java.io.File(path);
    }

    public ArrayList<BTree> getListaPersonas() {
        return list;
    }

    public void setLista(ArrayList<BTree> listaAlumnos) {
        this.list = listaAlumnos;
    }

    public java.io.File getArchivo() {
        return file;
    }

    public void setArchivo(java.io.File archivo) {
        this.file = archivo;
    }

    public void setBtree(BTree a) {
        list.add(a);
    }

    public BTree getTree() {
        return arbolito_navidad;
    }

    public void setTree(BTree tree) {
        this.arbolito_navidad = tree;
    }

    public void cargarArchivo() {
        try {
            list = new ArrayList();
            if (file.exists()) {
                FileInputStream entrada = new FileInputStream(file);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    this.arbolito_navidad = (BTree) objeto.readObject();
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            } else {

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);

            bw.writeObject(this.arbolito_navidad);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
