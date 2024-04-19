/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * La clase Reporte proporciona métodos para generar y manipular informes relacionados con pacientes y enfermedades.
 * Permite solicitar datos al usuario y guardar la información en un archivo de texto.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class Reporte {
    /**
     * Solicita datos al usuario relacionados con el paciente y la enfermedad.
     * Devuelve un array de strings que contiene el nombre completo del paciente, el nombre de la enfermedad y el nombre del medicamento.
     * @return Un array de strings con el nombre completo del paciente, el nombre de la enfermedad y el nombre del medicamento.
     */
    public static String[] pedirDatos() {
       String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo del paciente:");
       String enfermedad = JOptionPane.showInputDialog("Ingrese el nombre de la enfermedad:");
       String medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento para tratar la enfermedad:");

       return new String[]{nombreCompleto, enfermedad, medicamento};
    }
    /**
     * Guarda los datos proporcionados en un archivo de texto.
     * Los datos incluyen el nombre completo del paciente, el nombre de la enfermedad y el nombre del medicamento.
     * El archivo se encuentra en la ruta especificada y se agrega al final del archivo si ya existe.
     * @param datos  Un array de strings que contiene el nombre completo del paciente, el nombre de la enfermedad y el nombre del medicamento.
     */
    public static void escribirEnArchivo(String[] datos){
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Enfermedades.txt");
        try{
            FileWriter escritor = new FileWriter(fichero, true); // true para que agregue al final del archivo
            PrintWriter impresor = new PrintWriter(escritor);
            impresor.println(datos[0] + " " + datos[1] + " " + datos[2]);
            impresor.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
    

