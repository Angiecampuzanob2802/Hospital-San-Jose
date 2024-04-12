/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version  0.0.1
 * @since 2024-04-08
 */
public class Enfermedad {
    
    ///// atributos
    private String nombre;
    private String descripcion;   
    
    ///// constructor
    public Enfermedad(String nombre, String descripcion) {    
        this.nombre = nombre;
        this.descripcion = descripcion;
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
   
    ///// metodos
    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }
    public String obtenerInformacion() {
        return "Enfermedad: " + nombre + "\nDescripción: " + descripcion;
    }
    
}
