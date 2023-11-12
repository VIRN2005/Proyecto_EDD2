/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd2;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
class File extends java.io.File {

    // Files Necesarios para guardar Archivos y Indices
    private java.io.File file;
    private java.io.File index;

    // Contadores, Tamaños & All that stuff
    private int countRegis;
    private int tamRecord;
    private int primKeyIndex;
    private int secondaryKeyIndex;
    private int firstSlot;
    private String metadata;

    // BRs, ArrayLists & LinkedLists used 
    private BufferedReader br;
    private ArrayList<Campo> fields = new ArrayList();
    private ArrayList<Registro> records = new ArrayList();
    private LinkedList<Integer> slots = new LinkedList<>();

    // Constructors (Empty & Overloaded)
    public File(String pathname) {
        super(pathname);
        this.file = new java.io.File(pathname);
        tamRecord = 1;
        firstSlot = -1;
        metadata = "";
    }

    public File(String pathname, java.io.File index, int countRegis, int tamRecord) {
        super(pathname);
        this.file = new java.io.File(pathname);
        this.index = index;
        this.countRegis = countRegis;
        this.tamRecord = tamRecord;
    }
    public File(String pathname, java.io.File archivo){
        super(pathname);
        file = archivo; 
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

    public int getFirstSlot() {
        return firstSlot;
    }

    public void setFirstSlot(int firstDisponible) {
        this.firstSlot = firstDisponible;
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

    public LinkedList<Integer> getSlot() {
        return slots;
    }

    public void setSlot(LinkedList<Integer> slot) {
        this.slots = slot;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    // Methods usados en Class File
    // Inicializa File y Valores en él
    public void AddFile(java.io.File archivo) throws FileNotFoundException {
        this.file = archivo;

        int posS = firstSlot;
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
            posS = Integer.parseInt(br.readLine());

            if (posS > -1) {
                slots.add(posS);//añade al final
            }

            while (posS > 0) {
                String salida = (String) SearchLine(posS + 3, this.file);
                String[] linea = salida.split("\\|");
                posS = Integer.parseInt(linea[0].substring(1));
                if (posS > 0) {
                    slots.add(0, posS);//añade al inicio
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
        if (!this.slots.isEmpty()) {
            int temp = this.slots.getFirst();
            this.slots.remove(0);
            return temp;
        } else {
            return -1;
        }
    }

    // Ve cual es el Tamaño del Registro
    public void calcRecordSize() {
        for (int i = 0; i < fields.size(); i++) {
            tamRecord = 0;
            tamRecord += fields.get(i).getSize() + 1;
        }
    }

    public void createFile() {
        ObjectOutputStream OOS = null;
        try {
            OOS = new ObjectOutputStream(new FileOutputStream(file + ".tva"));
            //FUN FACT... El archivo se llama asi por las iniciales de nuestros nombres (Tatiana, Víctor & Andrea)
            OOS.flush();
        } catch (IOException e) {
        } finally {
            try {
                OOS.close();
            } catch (Exception ex) {
            }
        }
    }

    public void saveFile() {
        ObjectOutputStream OOS = null;
        try {
            OOS = new ObjectOutputStream(new FileOutputStream(file, false));
            //OOS.writeObject(fields);
            System.out.println("metadata: "+metadata);
            OOS.writeObject(metadata);
            OOS.writeObject(records);
            OOS.flush();
            JOptionPane.showMessageDialog(null, "¡Archivo guardado con éxito!", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR 404!\n File ERROR Occured: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                OOS.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void openFile() {
        try {            
            records = new ArrayList();
            Registro temp;
            if (file.exists()) {
                FileInputStream entrada = new FileInputStream(file);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    metadata = objeto.readLine();
                    while ((temp = (Registro) objeto.readObject()) != null) {
                        records.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //Faltaria que al pasar estos metodos, modifique la estructura de registros. 
    public void modifyFields(int pos, Campo campo){
        this.fields.get(pos).setName(campo.getName());
        this.fields.get(pos).setSize(campo.getSize());
        this.fields.get(pos).setIsCharacter(campo.isIsCharacter());
        this.fields.get(pos).setIsKeyT1(campo.isIsKeyT1());
        this.fields.get(pos).setIsKeyT2(campo.isIsKeyT2());
        this.fields.get(pos).setKey(campo.isKey());
        metadata = campo.toString(); 
    }
    
    public void deleteCampo(int pos){
        this.fields.remove(pos);
    }
    

        // Metodo para cerrar el Archivo
        /*public void cerrarArchivo() {
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
        }*/
    }

