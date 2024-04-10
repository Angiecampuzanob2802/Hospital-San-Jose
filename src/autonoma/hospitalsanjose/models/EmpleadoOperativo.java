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
public class EmpleadoOperativo extends Empleado{
    ///// atributos
    private String areaTrabajo;
    
    //// constructor
    public EmpleadoOperativo(String nombre, String identificacion, int edad, double salarioBase, String areaTrabajo) {
        super(nombre, identificacion, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }
    //// metodos de acceso
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    ////// metodos
    
}
