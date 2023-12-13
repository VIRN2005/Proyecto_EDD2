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
    private String type;
    private boolean key;
    private boolean isKeyT1;
    private boolean isKeyT2;
    private boolean isChar;

    

    // Constructors
    public Campo() {
    }

    public Campo(int size, String name, boolean key, String type, boolean isKeyT1, boolean isKeyT2) {
        this.size = size;
        this.name = name;
        this.key = key; 
        this.type = type;
        this.isKeyT1 = isKeyT1;
        this.isKeyT2 = isKeyT2;
    }

    // Getters & Setters
    public boolean isIsChar() {
        return isChar;
    }
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsKeyT1() {
        return isKeyT1;
    }

    public void setIsKeyT1(boolean isKeyT1) {
        this.isKeyT1 = isKeyT1;
    }

    public boolean isIsKeyT2() {
        return isKeyT2;
    }

    public void setIsKeyT2(boolean isKeyT2) {
        this.isKeyT2 = isKeyT2;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    // Methods usados en Campo
    //Determina  si el primer caracter es int o char
    public String character() {
        if (!isChar) {
            return "int";
        } else {
            return "char";
        }
    }

    //Da las flags a las keys usadas como flags
    public void setKeysValues(char Key_suffix) {
        if (Key_suffix == 'f') { // FIRST Key Value
            isKeyT1 = true;
            isKeyT2 = false;
        } else if (Key_suffix == 's') {// SECOND Key Value
            isKeyT1 = false;
            isKeyT2 = true;
        } else { // Key_suffix == 't' -> THIRD Key Value
            isKeyT1 = false;
            isKeyT2 = false;
        }
    }

    // Lee todos la info de los Fields y le hace un tokenizer (o como se diga XD) y lo pasa a un array para asignar los keys
    public Campo(String info) {
        String[] Fields_Array = info.split(": ");
        name = Fields_Array[0];

        //Mira al final de TODAAAAAAA la cadena para encontrar el ultimo valor (F,S,T) de las Key Values
        char lastChar = Fields_Array[1].charAt(Fields_Array[1].length() - 1);
        setKeysValues(lastChar);

        if (Fields_Array[1].charAt(0) == 'c') {
//            isCharacter = true;
            size = Integer.parseInt(Fields_Array[1].substring(5, Fields_Array[1].length() - 2));
        } else { // El char es 'f' o 't'
//            isCharacter = false;
            size = Integer.parseInt(Fields_Array[1].substring(4, Fields_Array[1].length() - 2));
        }
    }

    // Imprime la info con las Keys included (Ing. Nelbren me enseñó este method en Progra3 JAJAJA)
    @Override
    public String toString() {
        String keySuffix = (isKeyT1) ? "f" : (isKeyT2) ? "s" : "t";
        return name + ": " + type + '[' + Integer.toString(size) + "]" + keySuffix;
    }

}
