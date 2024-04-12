/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * La enfermedad se refiere al proceso y la fase que atraviesan los seres vivos
 * cuando padecen una afección que atenta contra su bienestar al modificar su condición ontológica de salud.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
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

    ///// constructor con parametros
    /**
     * Crea una nueva instancia de la clase Enfermedad
     * @param nombre El nombre de la enfermedad
     * @param descripcion La descripcion de la enfermedad
     */
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

    ///// Métodos
    /**
     * Modifica la descripción de la enfermedad
     * @param nuevaDescripcion La nueva descripcion de la enfermedad
     */
    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }
    /**
     * Obtiene la información completa de la información
     * @return Una cadena de texto con el nombre y la descripción de la enfermedad.
     */
    public String obtenerInformacion() {
        return "Enfermedad: " + nombre + "\nDescripción: " + descripcion;
    }

}
