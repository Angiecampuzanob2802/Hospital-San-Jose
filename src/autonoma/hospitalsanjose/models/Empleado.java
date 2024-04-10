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
 */
public abstract class Empleado {
    private String nombre;
    private String identificacion;
    private int edad;
    private double salarioBase;

    public Empleado(String nombre, String identificacion, int edad, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

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
    
}
