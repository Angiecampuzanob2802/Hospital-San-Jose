/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * La clase Gerente representa a un gerente del hospital, con su nombre, número de identificación,edad y carrera.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 * 
 */
public class Gerente {
  ////////////Atributos///////
    /**
     * El nombre del gerente
     */
   private String nombre;
   /**
    * El número de identificación del gerente 
    */
   private String numeroIdentificacion;
   /**
    * La edad del gerente
    */
   private int edad;
   /**
    * La carrera del gerente
    */
   private String carrera;
 
  ///////// Constructor con parametros ///////
   /**
    * Crea una nueva instancia de la clase Gerente
    * @param nombre El nombre del gerente 
    * @param numeroIdentificacion El número de Identificación del gerente 
    * @param edad La edad del gerente 
    * @param carrera La carrea del gerente
    */
    public Gerente (String nombre, String numeroIdentificacion, int edad, String carrera){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.carrera = carrera;
    }
    ///////Metodos De Acceso//////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
