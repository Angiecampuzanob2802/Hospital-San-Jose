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
 * @version 1.0.0
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
     * @param especialidad La especialidad del empleado del área de la salud.
     * @param horasTrabajadas El número de horas trabajadas por el empleado del área de la salud.
     * @param nombre  El nombre del empleado.
     * @param id La identificación del empleado
     * @param edad La edad del empleado.    
     * @param salarioBase El salario base del empleado.
     * @param hospital El hospital donde trabajan los empleados
     * @param salarioTotal El salario total de los empleados
     */
    public EmpleadoDelAreaDeLaSalud(String especialidad, double horasTrabajadas, String nombre, long id, int edad, double salarioBase,Hospital hospital,double salarioTotal) {
        super(nombre, id, edad, salarioBase,hospital,salarioTotal);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
        calcularSalarioTotal();
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
    ////// metodo abstracto
    @Override
    public void calcularSalarioTotal(){
        double base = salarioBase * 0.012;
        double valorHoras = base * getHorasTrabajadas();
        salarioTotal = salarioBase + valorHoras;
    }
}
