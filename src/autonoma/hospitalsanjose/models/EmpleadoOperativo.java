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
 * @version 1.0.0
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
     * @param hospital El hospital es donde trabajan los empleados
     * @param salarioTotal El salario total del empleado
     */
    public EmpleadoOperativo(String nombre, String identificacion, int edad, double salarioBase, String areaTrabajo,Hospital hospital,double salarioTotal){
        super(nombre, identificacion, edad, salarioBase,hospital,salarioTotal);
        this.areaTrabajo = areaTrabajo;
    }
    //// metodos de acceso
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    ////// metodo abstracto
    @Override
    public void calcularSalarioTotal(){
        double base = salarioBase * 0.2;
        salarioTotal = salarioBase + base;
    }
}
