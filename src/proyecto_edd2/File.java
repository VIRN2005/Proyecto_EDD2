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
import java.util.Scanner;
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
    private int countRegis;//cantidad de registros
    private int tamRecord;//tamano del registro (length)
    private int primKeyIndex;
    private int secondaryKeyIndex;
    private int firstSlot;
    private String metadata;
    private int tamMetadata;

    // ArrayLists & LinkedLists used 
    private ArrayList<Campo> fields = new ArrayList();
    //private ArrayList<Registro> records = new ArrayList();
    private LinkedList<Integer> slots = new LinkedList<>();
    //private AvailList avail = new AvailList();
    private RandomAccessFile rf = null;
    private int AvailistHead;

    // Constructors (Empty & Overloaded)
    public File(String pathname) {
        super(pathname);
        this.file = new java.io.File(pathname);
        this.tamRecord = 0;
        this.firstSlot = -1;
        this.metadata = "";
        this.countRegis = 0;
        this.AvailistHead = -1;
    }

    public File(String pathname, java.io.File index, int countRegis, int tamRecord) {
        super(pathname);
        this.file = new java.io.File(pathname);
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

    public int getTamMetadata() {
        return tamMetadata;
    }

    public void setTamMetadata(int tamMetadata) {
        this.tamMetadata = tamMetadata;
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

    public ArrayList<Campo> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Campo> fields) {
        this.fields = fields;
    }

//    public AvailList getAvail() {
//        return avail;
//    }
//
//    public void setAvail(AvailList avail) {
//        this.avail = avail;
//    }
    public RandomAccessFile getRf() {
        return rf;
    }

    public void setRf(RandomAccessFile rf) {
        this.rf = rf;
    }

    public int getAvailistHead() {
        return AvailistHead;
    }

    public void setAvailistHead(int AvailistHead) {
        this.AvailistHead = AvailistHead;
    }

//    public ArrayList<Registro> getRecords() {
//        return records;
//    }
//
//    public void setRecords(ArrayList<Registro> records) {
//        this.records = records;
//    }
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
//    public void addRegistro(Registro regis) {
//        regis.setRRN(Integer.toString(countRegis + 1));
//        countRegis++;
//        this.records.add(regis);
//    }
    // Busca si el LinkedList -> disponible esta vació & si los Vals estan disponibles
//    public int getValDisponible() {
//        if (!avail.vacia()) {
//            int temp = this.avail.primero();
//            this.avail.suprime(0);
//            return temp;
//        } else {
//            return -1;
//        }
//    }
    public int getValDisponible() {
        if (!slots.isEmpty()) {
            int temp = this.slots.getFirst();
            this.slots.remove(0);
            return temp;
        } else {
            return -1;
        }
    }

    // Ve cual es el Tamaño del Registro
//    public void calcRecordSize() {
//        for (int i = 0; i < fields.size(); i++) {
//            tamRecord = 0;
//            tamRecord += fields.get(i).getSize() + 1;
//        }
//    }
    public void createFile() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (Exception ex) {
        }
        try {
            fw.close();
        } catch (IOException ex) {
        }
    }

    public void saveFile(java.io.File archivo) {
        this.file = archivo;
        if (file.exists()) {
            RandomAccessFile rf = null;

            try {
                rf = new RandomAccessFile(file, "rw");
                rf.writeBytes(metadata + "\n");
                tamMetadata = metadata.length();
                tamRecord = CalTamRec();
                rf.seek(metadata.length() + 1);

                //tamano de bytes del registro
//                rf.writeBytes(String.valueOf(tamRecord + "\n"));
//                rf.seek(String.valueOf(tamRecord).length() + 1);
                //cantidad de registros
                String s = String.valueOf(countRegis);
                rf.writeBytes(s);
                rf.seek(String.valueOf(countRegis).length() + 1);
                String avail = String.valueOf(AvailistHead);
                rf.writeBytes(avail);
                ConstruirAvailist();

                //JOptionPane.showMessageDialog(null, "¡Archivo guardado con éxito!", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR 404!\n File ERROR Occured: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
//                    bw.close();
//                    fw.close();
                    rf.close();
                } catch (Exception ex) {
                }
            }
        }
    }

    public void openFile(java.io.File archivo) {
        RandomAccessFile rf = null;
        fields = new ArrayList();

        this.file = archivo;
        if (file.exists()) {
            try {
                rf = new RandomAccessFile(file, "r");

                //METADATA
                metadata = rf.readLine();
                tamMetadata = metadata.length();
                String[] meta_fields = metadata.split(",");

                for (String field : meta_fields) {
                    String size = "", name = "", type = "";
                    char key;
                    String[] description = field.split(": ");
                    name = description[0];
                    String data = description[1];
                    boolean flag_t = true, flag_s = false;//para saber si lee el size [23] dentro de los corchetes
                    for (int j = 0; j < data.length(); j++) {

                        if (flag_t && data.charAt(j) != '[') {
                            type += data.charAt(j);
                        } else {
                            flag_t = false;
                            flag_s = true;
                        }

                        if (flag_s && data.charAt(j) != '[' && j != data.length() - 1) {
                            if (data.charAt(j) == ']') {
                                flag_s = false;
                            } else {
                                size += data.charAt(j);
                            }
                        }
                    }
                    key = data.charAt(data.length() - 1);
                    fields.add(new Campo(Integer.parseInt(size), name, KeyValue(key), type, false, false));
                }

                //REGISTRO
                tamRecord = CalTamRec();

                rf.seek(metadata.length() + 1);
                String temp = rf.readLine();
                int i = Integer.parseInt(temp);
                countRegis = i;
                System.out.println("->" + countRegis);

                String rec = String.valueOf(countRegis);

                rf.seek(metadata.length() + 2 + rec.length());
                temp = rf.readLine();
                System.out.println("->" + temp);
                //i = Integer.parseInt(temp);
                AvailistHead = AvailHead(temp);
                System.out.println("A:" + AvailistHead + " C:" + countRegis);
                //Metodo para construirAvailist en APP
                ArmarAvailist();
                rf.close();
            } catch (Exception ex) {
            }

        }//FIN IF

    }
//    private boolean ReEscribirCabeza() {
//        try (RandomAccessFile rf = new RandomAccessFile(file, "rw")) {
//            rf.seek(this.longitudTotalCampos + 2);
//            String newCabeza = "*";
//            newCabeza += String.valueOf(this.availist.getCabeza().getSlot());
//            newCabeza = String.format("%-" + this.longitudTotalRegistro + "s", newCabeza);
//            rf.writeBytes(newCabeza);
//
//            if (this.availist.getCabeza().getSiguiente() == null) {
//                return true;
//            }
//
//            rf.seek((tamMetadata) + ((tamRecord) * (int) this.availist.getCabeza().getSlot()));
//            String newSlot = "*";
//            newSlot += String.valueOf(this.availist.getCabeza().getSiguiente().getSlot());
//            newSlot = String.format("%-" + this.longitudTotalRegistro + "s", newSlot);
//            rf.writeBytes(newSlot);
//        } catch (IOException e) {
//            System.err.println("Sucedio un error al reescribir la cabeza de la metadata: " + e.getMessage());
//            return false;
//        }
//        return true;
//    }

    public void ArmarAvailist() throws FileNotFoundException, IOException {
        rf = new RandomAccessFile(file, "r");
        String rec = String.valueOf(countRegis);
        String rec2 = String.valueOf(AvailistHead);
        int index = AvailistHead, x;
        String s;
        //avail.inserta(index, 1);
        slots.add(index);
        while (index != -1) {
            x = (tamMetadata + 1) + (rec.length() + 1) + (tamRecord + 1) + (tamRecord * index);
            rf.seek(x);
            s = rf.readLine();
            int in = Integer.parseInt(s);
            index = in;
            slots.set(0, index);
        }
    }

    public void ConstruirAvailist() throws FileNotFoundException, IOException {
        RandomAccessFile rf = null;
        rf = new RandomAccessFile(file, "rw");
        String rec = String.valueOf(countRegis);
        String rec2 = String.valueOf(AvailistHead);
        int header = (tamMetadata + 1) + (rec.length() +rec2.length() + 1);
        int i = 0, index = -1, x = 0, pos;
        String in = "", s;
//        System.out.println("->" + slots.get(i) + " :" + slots.size());
        while (slots.get(i) != -1 && i < slots.size() && !(slots.isEmpty())) {
            index = slots.get(i);
            in = String.valueOf(index);
            rf.seek(header);
            System.out.println("H:" + rf.readLine());
            if (i == 0) {
                rf.seek(header);
                s = parseAvail(in);
                rf.writeBytes(s);///////aqui ayuda
                AvailistHead = index;
                x = index;
            } else {
                rec2 = String.valueOf(AvailistHead);
                pos = header + tamRecord + 1 + (x * tamRecord);
                rf.seek(pos);
                System.out.println("->" + rf.readLine());
                rf.seek(pos);
                s = BorrarRegistro(in);
                rf.writeBytes(s);
                x = index;
            }
            i++;
        }
        if (!slots.isEmpty()) {
            index = slots.get(i + 1);
        }

        in = String.valueOf(index);
        pos = header + tamRecord + 1 + (x * tamRecord);
        rf.seek(pos);
        System.out.println("->" + rf.readLine());
        rf.seek(pos);
        s = BorrarRegistro(in);
        rf.writeBytes(s);

//        for (int i = 0; i <slots.size(); i++) {
//            int index = slots.get(i);
//            String in = String.valueOf(index);
//            String s;
//            if (i==0) {
//                rf.seek(header);
//                rf.writeBytes(in+"\n");
//                AvailistHead = index;
//                x = index;
//            }else{
//                rec2 = String.valueOf(AvailistHead);
//                int pos = header+rec2.length()+1+(x*tamRecord);
//                rf.seek(pos);
//                System.out.println("->"+rf.readLine());
//                rf.seek(pos);
//                s = BorrarRegistro(in);
//                rf.writeBytes(s);
//                x = index;
//                if (i==slots.size()-1) {
//                    pos = header+rec2.length()+1+(x*tamRecord);
//                    rf.seek(pos);
//                    System.out.println("->"+rf.readLine());
//                    rf.seek(pos);
//                    s = BorrarRegistro("-1");
//                    rf.writeBytes(s);
//                }
//            }
//            
//        }
    }

    public String parseAvail(String in) {
        String s = in + "~";
        int t = tamRecord - s.length() - 1;
        for (int i = 0; i < t; i++) {
            s += '$';
        }
        return s;
    }

    public int AvailHead(String s) {
        String[] split = s.split("~");
        return Integer.parseInt(split[0]);
    }

    public String BorrarRegistro(String in) {
        String s = in + "|";
        int t = tamRecord - s.length();
        for (int i = 0; i < t; i++) {
            s += '$';
        }
        return s;
    }

    public int CalTamRec() {
        int tam = 0;
        for (int i = 0; i < fields.size(); i++) {
            tam += fields.get(i).getSize() + 1;
        }
        return tam;
    }

    public Registro LeerDatos(int rrn) throws IOException {
        Registro r = new Registro();
        RandomAccessFile rf = null;
        rf = new RandomAccessFile(file, "r");

        String rec = String.valueOf(countRegis);
        System.out.println("rec:" + rec);
        String rec2 = String.valueOf(AvailistHead);
        System.out.println("rec2:" + rec2);

        int x = (tamMetadata + 1) + (rec.length() + 1) + (tamRecord + 1) + (tamRecord * rrn);
        rf.seek(x);
        String s = rf.readLine();

        r.Parseo(s);

        System.out.println("->" + s);
        rf.close();
        return r;
    }

    public void EscribirDatos(int rrn, Registro record) throws FileNotFoundException, IOException {
        RandomAccessFile rf = null;
        rf = new RandomAccessFile(file, "rws");

        String rec = String.valueOf(countRegis);
        System.out.println("rec:" + rec);
        String rec2 = String.valueOf(AvailistHead);
        System.out.println("rec2:" + rec2);

        int x = (tamMetadata + 1) + (tamRecord + 1) + (rec.length()) + (tamRecord * rrn);
        System.out.println("Valor del seek: " + x);
        rf.seek(x);
        String s = EscribirRegistro(record);
        rf.writeBytes(s);
        rf.close();
    }

    public void BorrarDatos(int rrn) throws FileNotFoundException, IOException {
        RandomAccessFile rf = null;
        rf = new RandomAccessFile(file, "rws");
        String rec = String.valueOf(countRegis);
        String rec2 = String.valueOf(AvailistHead);
        System.out.println("rec2:" + rec2);
        int x = (tamMetadata + 1) + (rec.length() + 1) + (tamRecord + 1) + (tamRecord * rrn);
        System.out.println("Valor del seek: " + x);
        rf.seek(x);
        String data = rf.readLine();
        System.out.println("+" + data);
        String prefix = "*|";
        String end = prefix + data.substring(2, data.length() - 1);
        rf.seek((tamMetadata + 1) + (rec.length() + 1) + (tamRecord + 1) + (tamRecord * rrn));
        rf.writeBytes(end);
        rf.close();
    }

    public String EscribirRegistro(Registro record) {
        String registroCompleto = "\n" + record.toString();
        System.out.println("->" + tamRecord);
        int longitudDolares = tamRecord - registroCompleto.length();
        for (int i = 0; i < longitudDolares; i++) {
            registroCompleto += "$";
        }
        return registroCompleto;
    }

    //Faltaria que al pasar estos metodos, modifique la estructura de registros. 
    public void modifyFields(int pos, Campo campo) {
        this.fields.get(pos).setName(campo.getName());
        this.fields.get(pos).setSize(campo.getSize());
        this.fields.get(pos).setType(campo.getType());
        this.fields.get(pos).setIsKeyT1(campo.isIsKeyT1());
        this.fields.get(pos).setIsKeyT2(campo.isIsKeyT2());
        this.fields.get(pos).setKey(campo.isKey());
    }

    public boolean KeyValue(char Key_suffix) {
        return Key_suffix == 'f';
    }

    public void deleteCampo(int pos) {
        this.fields.remove(pos);
    }
}
