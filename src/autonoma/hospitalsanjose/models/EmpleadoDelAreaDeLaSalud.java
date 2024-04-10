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
public class EmpleadoDelAreaDeLaSalud extends Empleado{
    //// atributos
    private String especialidad;
    private double horasTrabajadas;
    
    //// constructor
    public EmpleadoDelAreaDeLaSalud(String especialidad, double horasTrabajadas, String nombre, String identificacion, int edad, double salarioBase) {
        super(nombre, identificacion, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
     //// metodos de acceso
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    ////// metodos 
    /*
    empleado salud
    calcularSalario:1.2% y se multiplica por el numero de horas trabajadas y luego sumarlos
    */

}
