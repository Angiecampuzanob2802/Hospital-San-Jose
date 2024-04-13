/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * La clase EmpleadoDelAreaDeLaSalud representa a un empleado del área de la salud en el sistema del hospital.
 * Extiende la clase abstracta Empleado e incluye atributos y métodos específicos para empleados del área de la salud.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
 * @since 2024-04-08
 */
public class EmpleadoDelAreaDeLaSalud extends Empleado{
    //// atributos
    /**
     * La especialidad del empleado del área de la salud
     */
    private String especialidad;
    /**
     * El número de horas trabajadas por el empleado del área de la salud
     */
    private double horasTrabajadas;
    
    //// constructor con parametros 
    /**
     * 
     * Constructor de la clase EmpleadoDelAreaDeLaSalud.
     * 
     * @param especialidad La especialidad del empleado del área de la salud.
     * @param horasTrabajadas El número de horas trabajadas por el empleado del área de la salud.
     * @param nombre  El nombre del empleado.
     * @param identificacion La identificación del empleado
     * @param edad La edad del empleado.    
     * @param salarioBase El salario base del empleado.
     */
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
    /**
     * 
     * Calcula el salario del empleado del área de la salud.
     * El salario se calcula como el 1.2% del salario base multiplicado por el número de horas trabajadas.
     * @return El salario del empleado del área de la salud.
     */
    /*
    @Override
    public double calcularSalario(){
        return getSalarioBase()*0.012*horasTrabajadas;
    }
    */
    /*
    empleado salud
    calcularSalario:1.2% y se multiplica por el numero de horas trabajadas y luego sumarlos
    */
}
