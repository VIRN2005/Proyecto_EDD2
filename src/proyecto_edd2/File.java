package proyecto_edd2;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class File {
    public String name;
    public List<Campos> fields;
    public List<Registros> records;
    private boolean cambiosPendientes;

    public File(String name) {
        this.name = name;
        this.fields = new ArrayList<>();
        this.records = new ArrayList<>();
        this.cambiosPendientes = false;
    }

    //Metodo para Crear un Nuevo Archivo
    public static File createFile() {
        String fileName = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Archivo");
        return new File(fileName);
    }

    
    public void AddCampos(Campo campo){
        fields.add(campo);
        //FALTA CODEEEEE!
       
        cambiosPendientes = true;
    }
    
    public void AddRegistro(Registro registro){
        records.add(registro);
        //FALTA CODEEEEE!
       
        cambiosPendientes = true;
    }
    
    // Metodo para salvar el Archivo a Binary
    public void saveFile() {
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
            } else if(opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cambios DESCARTADOS...\n"
                        + "Cerrando Archivo", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo CERRADO Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}



