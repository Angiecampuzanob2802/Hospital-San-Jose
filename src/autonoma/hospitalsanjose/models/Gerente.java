/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.0.1
 * @since 2024-04-08
 * 
 */
public class Gerente {
    
  ////////////Atributos///////
   private String nombre;
   private String numeroIdentificacion;
   private int edad;
   private String carrera;
   
  ///////// Constructor///////
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
