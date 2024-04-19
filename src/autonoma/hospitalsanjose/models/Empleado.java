/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * 
 * La clase abstracta Empleado representa a un empleado en el sistema del hospital.
 * Esta clase define los atributos comunes y métodos de acceso para todos los tipos de empleados.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
 * @since 2024-04-08
 */
public abstract class Empleado {
    //// atributos
    /**
     * El nombre del empleado
     */
    private String nombre;
    /**
     * La identificación del empleado
     */
    private String identificacion;
    /**
     * La edad del empleado
     */
    private int edad;
    /**
     * El salario base del empleado
     */
    private double salarioBase;

    //// constructor con parametros 
    /**
     * Constructor de la clase Emleado
     * @param nombre El nombre del empleado
     * @param identificacion La identificación del empleado
     * @param edad La edad del empleado
     * @param salarioBase El salario base del empleado
     */
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, String identificacion, int edad, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }
    //// metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    //////// Metodos abstractos
    /**
     * Calcula el salario del empleado
     * @return El salario del empleado 
     */
    /**
    public abstract double calcularSalario();
    */
}
