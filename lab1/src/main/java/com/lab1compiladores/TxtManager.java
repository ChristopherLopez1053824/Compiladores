package com.lab1compiladores;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TxtManager {
    
    public static String seleccionarArchivoTxt()
    {
        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            String rutaArchivo = archivoSeleccionado.getAbsolutePath();
            System.out.println("Archivo seleccionado: " + rutaArchivo);
            return rutaArchivo;
        } else {
            System.out.println("No se seleccionó ningún archivo.");
            return null;
        }
    }
}
