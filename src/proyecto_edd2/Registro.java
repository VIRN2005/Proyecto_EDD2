/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd2;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Registro {

    //ArrayList que agrega todos los fields, 
    private int tam;
    private String RRN;
    private ArrayList<String> all_fields = new ArrayList();

    //Constructors
    public Registro() {

    }

    public Registro(int tam) {
        this.tam = tam;
    }

    //Getters & setters
    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public ArrayList<String> getAll_fields() {
        return all_fields;
    }

    public void setAll_fields(ArrayList<String> all_fields) {
        this.all_fields = all_fields;
    }

    // Methods usados en Campo
    // Add al Arraylist
    public void Size() {
        int temp = 0;
        for (int i = 0; i < all_fields.size(); i++) {
            String element = (String) all_fields.get(i);
            temp += element.length();
            temp++; 
//            if (i < all_fields.size() - 1) {
//                temp++; // Agrega 1 para el carácter de separación, como un espacio o coma
//            }
        }
        tam = temp;
    }

    public void Add(String info) {
        all_fields.add(info);
    }
    public void Parseo(String str){
        tam = 0; 
        String[] campos = str.split("\\|");
        for (int i = 0; i <campos.length-1; i++) {
            all_fields.add(campos[i]);
            tam+=campos[i].length() + 1;
        }
        
    }

    public Registro(String str, int recordSize, int pos) {
        String[] campos = str.split("\\|");
        tam = recordSize;

        for (int i = 0; i < campos.length; i++) {
            all_fields.add(campos[i]);
            tam += campos[i].length();

            if (i < campos.length - 1) {
                tam++;
            }
        }

        RRN = Integer.toString(pos);
        System.out.println(RRN);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (String st : all_fields) {
            output.append(st).append('|');
        }

        while (output.length() < tam) {
            output.append('$');
        }

        System.out.println(output.length() + " " + tam);
        return output.toString();
    }

}
