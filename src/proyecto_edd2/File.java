package proyecto_edd2;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    // Methods usados en Class File
    // Inicializa File y Valores en él
    public File(java.io.File archivo) throws FileNotFoundException {
        this.file = archivo;

        int part = firstDisponible;
        br = new BufferedReader(new FileReader(archivo));

        try {
            String FieldsStr = br.readLine();
            String[] F_Str = FieldsStr.substring(1, FieldsStr.length() - 1).split(", ");

            //Falta crear la clase Field
            for (String cp : F_Str) {
                fields.add(new Campo(cp));
            }

            tamRecord = Integer.parseInt(br.readLine());
            countRegis = Integer.parseInt(br.readLine());
            firstDisponible = Integer.parseInt(br.readLine());

            if (firstDisponible > -1) {
                disponible.add(firstDisponible);
            }

            while (part > 0) {
                String salida = (String) SearchLine(part + 3, this.file);
                String[] linea = salida.split("\\|");
                part = Integer.parseInt(linea[0].substring(1));
                if (part > 0) {
                    disponible.add(0, part);
                }
            }

            int c = 1;

            while ((FieldsStr = br.readLine()) != null) {
                if (FieldsStr.charAt(0) != '*') {
                    records.add(new Registro(FieldsStr, tamRecord, c));
                }
                c++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Busca si el File tiene la Searched Line
    public static String SearchLine(int line, java.io.File file) throws IOException {
        String found = null;
        List<String> lines = Files.readAllLines(Paths.get(file.getPath()));

        if (line >= 0 && line < lines.size()) {
            found = lines.get(line);
        }

        return found;
    }

    // Añade el campo al Arraylist -> fields
    public void addCampo(Campo camp) {
        this.fields.add(camp);
    }

    // Añade el registro al Arraylist -> records
    public void addRegistro(Registro regis) {
        regis.setRRN(Integer.toString(countRegis + 1));
        countRegis++;
        this.records.add(regis);
    }

    // Busca si el LinkedList -> disponible esta vació & si los Vals estan disponibles
    public int getValDisponible() {
        if (!this.disponible.isEmpty()) {
            int temp = this.disponible.getFirst();
            this.disponible.remove(0);
            return temp;
        } else {
            return -1;
        }
    }

    // Ve cual es el Tamaño del Registro
    public void calcRecordSize() {
        tamRecord = 0;
        for (int i = 0; i < fields.size(); i++) {
            tamRecord += fields.get(i).getSize() + 1;
        }
    }

    //Dejo esto por Aquí... Nos podría servir mas Adelante JAJAJAJA
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
