/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd2;

/**
 *
 * @author Victor
 */
public class Campo {
    // Sizes, Names y Flags de entrada a las Keys
    private int size;
    private String name;
    private boolean isCharacter;
    private boolean isKey1;
    private boolean isKey2;

    // Constructors
    public Campo() {
    }

    public Campo(int size, String name, boolean isCharacter, boolean isKey1, boolean isKey2) {
        this.size = size;
        this.name = name;
        this.isCharacter = isCharacter;
        this.isKey1 = isKey1;
        this.isKey2 = isKey2;

        System.out.println(">> Name:" + this.name + " >> Size:" + this.size + " >>Is Character: " + this.isCharacter);
    }

    // Getters & Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsCharacter() {
        return isCharacter;
    }

    public void setIsCharacter(boolean isCharacter) {
        this.isCharacter = isCharacter;
    }

    public boolean isIsKey1() {
        return isKey1;
    }

    public void setIsKey1(boolean isKey1) {
        this.isKey1 = isKey1;
    }

    public boolean isIsKey2() {
        return isKey2;
    }

    public void setIsKey2(boolean isKey2) {
        this.isKey2 = isKey2;
    }

    // Methods usados en Campo
    //Determina  si el primer caracter es int o char
    public String character() {
        if (!isCharacter) {
            return "int";
        } else {
            return "char";
        }
    }

    //Da las flags a las keys usadas como flags
    public void setKeysValues(char Key_suffix) {
        if (Key_suffix == 'f') { // FIRST Key Value
            isKey1 = true;
            isKey2 = false;
        } else if (Key_suffix == 's') {// SECOND Key Value
            isKey1 = false;
            isKey2 = true;
        } else { // Key_suffix == 't' -> THIRD Key Value
            isKey1 = false;
            isKey2 = false;
        }
    }

    // Lee todos la info de los Fields y le hace un tokenizer (o como se diga XD) y lo pasa a un array para asignar los keys
    public Campo(String info) {
        String[] Fields_Array = info.split(": ");
        name = Fields_Array[0];

        //Mira al final de TODAAAAAAA la cadena para encontrar el ultimo valor (F,S,T) de las Key Values
        char lastChar = Fields_Array[1].charAt(Fields_Array[1].length() - 1);
        setKeysValues(lastChar);

        if (Fields_Array[1].charAt(0) == 's') {
            isCharacter = true;
            size = Integer.parseInt(Fields_Array[1].substring(5, Fields_Array[1].length() - 2));
        } else { // El char es 'f' o 't'
            isCharacter = false;
            size = Integer.parseInt(Fields_Array[1].substring(4, Fields_Array[1].length() - 2));
        }
    }

    // Imprime la info con las Keys included (Ing. Nelbren me enseñó este method en Progra3 JAJAJA)
    @Override
    public String toString() {
        String keySuffix = (isKey1) ? "f" : (isKey2) ? "s" : "t";
        return name + ": " + character() + '[' + Integer.toString(size) + "]" + keySuffix;
    }

}
