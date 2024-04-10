/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version  0.0.1
 * @since 2024-04-08
 */
public class Paciente {
    ///// atributos
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String correoElectronico;
    private String telefono;
    private boolean saludable;
    private ArrayList<Enfermedad>listaEnfermedades;
    
    //// constructor
    public Paciente(String nombre, String numeroDocumento, int edad, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.saludable = true;
        this.listaEnfermedades = new ArrayList<>();

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
    public void agregarEnfermedad(String nombre, String descripcion) {
        Enfermedad enfermedad = new Enfermedad(nombre, descripcion);
        listaEnfermedades.add(enfermedad);
        saludable = false; // El paciente deja de estar saludable al agregar una enfermedad
    }

    public void curarEnfermedad(String nombreEnfermedad) {
        for (Enfermedad enfermedad : listaEnfermedades) {
            if (enfermedad.getNombre().equals(nombreEnfermedad)) {
                listaEnfermedades.remove(enfermedad);
                if (listaEnfermedades.isEmpty()) {
                    saludable = true; // El paciente vuelve a estar saludable si no tiene más enfermedades
                }
                return;
            }
        }
    }   
}
