    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * 
 * La clase EmpleadoOperativo representa a un empleado operativo en el sistema del hospital.
 * Extiende la clase abstracta Empleado e incluye atributos y métodos específicos para empleados operativos.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
 * @since 2024-04-08
 */
public class EmpleadoOperativo extends Empleado{
    ///// atributos
    /**
     *El area de trabajo del empleado operativo.
     */
    private String areaTrabajo;
    
    //// constructor con parametros
    /**
     * Constructor de la clase EmpleadoOperativo.
     * @param nombre El nombre del empleado
     * @param identificacion La identificación del empleado.
     * @param edad La edad del empleado
     * @param salarioBase El salario base del empleado
     * @param areaTrabajo El area de trabajo del empleado
     */
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
    /**
     * Calcula el salario del empleado operativo.
     * El salario se calcula sumando el 20% al salario base.
     * @return El salario del empleado operativo
     */
    
    /*
    @Override
    public double calcularSalario(){
        return getSalarioBase() * 1.20;///Se suma el 20% al salario base
    }
    */
    /*
    empleadoOperativo
    calcularSalario: se le suma el 20% para obtener el salario neto a retomar
    */
}
