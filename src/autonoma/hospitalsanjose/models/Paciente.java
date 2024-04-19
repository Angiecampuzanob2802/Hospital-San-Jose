        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Paciente representa a un paciente del hospital San José.
 * Contiene información como nombre, número de documento, edad, contacto, estado de salud y enfermedades.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class Paciente {
    ///// atributos
    /**
     * Nombre del paciente
     */
    private String nombre;
    /**
     * El número de documento del paciente
     */
    private String numeroDocumento;
    /**
     * La edad del paciente
     */
    private int edad; 
    /**
     * El correo electronico del paciente
     */
    private String correoElectronico;
    /**
     * El telefono del paciente
     */
    private String telefono;
    /**
     * Indica si el paciente esta saludable o no 
     */
    private boolean saludable;
    /**
     * Lista de enfermedades que padece el paciente
     */
    private ArrayList<Enfermedad>listaEnfermedades;
    
    //// constructor con parametros
    /**
     * Constructor de la clase Paciente
     * @param nombre El nombre del paciente.
     * @param numeroDocumento El número de documento del paciente   
     * @param edad La edad del paciente.
     * @param correoElectronico El correo electrónico del paciente.
     * @param telefono El número de teléfono del paciente.
     * @param saludable La enfermedades diagnosticadas al paciente
     * @param listaEnfermedades Indica si el paciente es saludable o esta critico
     */
    
    public Paciente(String nombre, String numeroDocumento, int edad, String correoElectronico, String telefono, boolean saludable, ArrayList<Enfermedad> listaEnfermedades){
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.saludable = saludable;
        this.listaEnfermedades = listaEnfermedades;
    }
    public Paciente() {
    }
    //////metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    public ArrayList<Enfermedad> getListaEnfermedades() {
        return listaEnfermedades;
    }

    public void setListaEnfermedades(ArrayList<Enfermedad> listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }
    ///// metodos 
    public static ArrayList<Paciente> crearPacienteDesdeArchivo(ArrayList<Enfermedad>enfermedades) throws FileNotFoundException {
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Pacientes.txt");
        Scanner scanner = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Enfermedad> enfermedadesLeidas= new ArrayList<>();
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()){
                Paciente pacienteNuevo = new Paciente();
                //Paciente pacienteNuevo = new Paciente(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                pacienteNuevo.setNombre(partes[0]);
                pacienteNuevo.setNumeroDocumento(partes[1]);
                pacienteNuevo.setTelefono(partes[2]);
                pacienteNuevo.setEdad(Integer.parseInt(partes[3]));
                pacienteNuevo.setCorreoElectronico(partes[4]);
                String[] enfermedadesStr = partes[5].split(" , "); // Obtener los nombres de los padecimientos

                for (String enfermedadStr : enfermedadesStr){
                    Enfermedad e = Enfermedad.buscarEnfermedad(enfermedades,enfermedadStr.trim());
                    if(e != null){
                        enfermedadesLeidas.add(e);
                    }
                }
                pacienteNuevo.setListaEnfermedades(enfermedadesLeidas);
                pacientes.add(pacienteNuevo);
            }
            return pacientes;
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje 1: " + ex.getMessage());
        } finally {
            try{
                if (scanner != null)
                    scanner.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
}
