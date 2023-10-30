package proyecto_edd2;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

class File {

    // Files Necesarios para guardar Archivos y Indices
    private java.io.File file;
    private java.io.File index;

    // Contadores, Tamaños & All that stuff
    private int countRegis;
    private int tamRecord;
    private int primKeyIndex;
    private int secondaryKeyIndex;
    private int firstDisponible;

    // BRs, ArrayLists & LinkedLists used 
    private BufferedReader br;
    private ArrayList<Campo> fields = new ArrayList();
    private ArrayList<Registro> records = new ArrayList();
    private LinkedList<Integer> disponible = new LinkedList<>();

    // Constructors (Empty & Overloaded)
    public File() {

    }

    public File(java.io.File files, int l) {
        this.file = files;
        tamRecord = l;
        firstDisponible = -1;
    }

    public File(java.io.File file, java.io.File index, int countRegis, int tamRecord) {
        this.file = file;
        this.index = index;
        this.countRegis = countRegis;
        this.tamRecord = tamRecord;
    }

    // Getters & Setters
    public java.io.File getFile() {
        return file;
    }

    public void setFile(java.io.File file) {
        this.file = file;
    }

    public java.io.File getIndex() {
        return index;
    }

    public void setIndex(java.io.File index) {
        this.index = index;
    }

    public int getCountRegis() {
        return countRegis;
    }

    public void setCountRegis(int countRegis) {
        this.countRegis = countRegis;
    }

    public int getTamRecord() {
        return tamRecord;
    }

    public void setTamRecord(int tamRecord) {
        this.tamRecord = tamRecord;
    }

    public int getPrimKeyIndex() {
        return primKeyIndex;
    }

    public void setPrimKeyIndex(int primKeyIndex) {
        this.primKeyIndex = primKeyIndex;
    }

    public int getSecondaryKeyIndex() {
        return secondaryKeyIndex;
    }

    public void setSecondaryKeyIndex(int secondaryKeyIndex) {
        this.secondaryKeyIndex = secondaryKeyIndex;
    }

    public int getFirstDisponible() {
        return firstDisponible;
    }

    public void setFirstDisponible(int firstDisponible) {
        this.firstDisponible = firstDisponible;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public ArrayList<Campo> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Campo> fields) {
        this.fields = fields;
    }

    public ArrayList<Registro> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Registro> records) {
        this.records = records;
    }

    public LinkedList<Integer> getDisponible() {
        return disponible;
    }

    public void setDisponible(LinkedList<Integer> disponible) {
        this.disponible = disponible;
    }

    // Metodo para salvar el Archivo a Binary
    
    
/*  public void saveFile() {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(name + ".atv"))) {
            //FUN FACT... El archivo se llama asi por las iniciales de nuestros nombres (Andrea, Tatiana & Víctor)
            OOS.writeObject(fields);
            OOS.writeObject(records);
            JOptionPane.showMessageDialog(null, "File saved successfully.", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR 404!\n File ERROR Occured: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        cambiosPendientes = false;
    }

    // Metodo para cerrar el Archivo
    public void cerrarArchivo() {
        if (cambiosPendientes) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas guardar los cambios antes de cerrar?", "Guardar Cambios", JOptionPane.YES_NO_CANCEL_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                saveFile(); // Guardar Cambios 
                JOptionPane.showMessageDialog(null, "Cambios GUARDADOS Correctamente.\n "
                        + "Cerrando Archivo", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cambios DESCARTADOS...\n"
                        + "Cerrando Archivo", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo CERRADO Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

}
