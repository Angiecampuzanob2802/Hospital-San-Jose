/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * La enfermedad se refiere al proceso y la fase que atraviesan los seres vivos
 * cuando padecen una afección que atenta contra su bienestar al modificar su condición ontológica de salud.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class Enfermedad {
    ///// atributos
    /**
     * El nombre de la enfermedad
     */
    private String nombre;
    /**
     * La descripcion de la enfermedad
     */
    private String descripcion;
    /**
     * Lista de medicamentos
     */
    private ArrayList<Medicamento>medicamentos;
    
    ///// constructor con parametros
    /**
     * Crea una nueva instancia de la clase Enfermedad
     * @param nombre El nombre de la enfermedad
     * @param descripcion La descripcion de la enfermedad
     * @param medicamentos La lista de medicamentos 
     */

    public Enfermedad(String nombre, String descripcion, ArrayList<Medicamento>medicamentos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medicamentos = medicamentos;
    }
    public Enfermedad(){
    
    }
    //// metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    ///// Métodos
    /**
     * @param medicamentos Objeto de tipo Enfermedad que se agregará a la lista de enfermedades.
     * @return verdadero si la enfermedad se agregó exitosamente y si no falso
     * @throws FileNotFoundException 
     */
   public static ArrayList<Enfermedad> crearEnfermedades(ArrayList<Medicamento> medicamentos) throws FileNotFoundException{
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Enfermedades.txt");
        Scanner scanner = null;
        ArrayList<Enfermedad> enfermedades = new ArrayList<>();
        ArrayList<Medicamento> medicamentosLeidos= new ArrayList<>();
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()){
                Enfermedad enfermedadNuevo = new Enfermedad();
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                enfermedadNuevo.setNombre(partes[0]);
                enfermedadNuevo.setDescripcion(partes[1]);
                String[] medicamentosStr = partes[2].split(",");// Obtener los nombres de los medicamentos
                System.out.println(medicamentosStr[1]);
                
                for (String medicamentoStr : medicamentosStr){
                    Medicamento m = Medicamento.buscarMedicamento(medicamentos, medicamentoStr.trim());
                    if(m != null){
                        medicamentosLeidos.add(m);
                    }
                }   
                enfermedadNuevo.setMedicamentos(medicamentosLeidos);
                enfermedades.add(enfermedadNuevo);
            }
            return enfermedades;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
                try {
                    if (scanner != null)
                        scanner.close();
                } catch (Exception ex2) {
                        System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }    
        return null;
    }          
    /**
     * Agrega un nuevo medicamento al inventario.
     * @param enfermedades Arreglo de tipo Enfermedades que contiene la lista de los padecimientos.
     * @param nombre del padecimiento
     * @return verdadero si el medicamento se agrega exitosamente y falso si no.
     */
    public static Enfermedad buscarEnfermedad(ArrayList<Enfermedad>enfermedades, String nombre){ 
        for (Enfermedad enfermedad : enfermedades){
            if(enfermedad.getNombre().equals(nombre)){
                return enfermedad;
            }
        }
        return null;
    }
    /**
     * Permite guardar los cambios en la ejecución para que no se pierdan una vez deje de ejecutarse
     * @param enfermedad La enfermedad del paciente
     * @param tipo del padecimiento
     * @throws IOException 
     */
    public static void guardarEnfermedad(Enfermedad enfermedad, int tipo) throws IOException{
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Medicamentos.txt");
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        pw.println(enfermedad.getNombre()+";"+ enfermedad.getDescripcion()+";"+ enfermedad.getMedicamentos());
        pw.close();
    }

}
