/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * La clase abstracta Empleado representa a un empleado en el sistema del hospital.
 * Esta clase define los atributos comunes y métodos de acceso para todos los tipos de empleados.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
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
    public double salarioBase;
    /**
     * Hospital en el que trabajan los empleados 
     */
    private Hospital hospital;
    /**
     * El salario total de los empleados
     */
     public double salarioTotal;
     
    //// constructor con parametros 
    /**
     * Constructor de la clase Emleado
     * @param nombre El nombre del empleado
     * @param identificacion La identificación del empleado
     * @param edad La edad del empleado
     * @param salarioBase El salario base del empleado
     * @param hospital El hospital en el que trabajan los empleados
     * @param salarioTotal El salario total del empleado
     */
    public Empleado(String nombre, String identificacion, int edad, double salarioBase,Hospital hospital,double salarioTotal) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.hospital = hospital;
        this.salarioTotal = salarioTotal;
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
    
    //////// Metodos abstractos
    /**
     * Calcula el salario del empleado
     * @return El salario del empleado 
     */
    /**
    public abstract double calcularSalario();
    */
    public static ArrayList<Empleado> crearEmpleadoDesdeArchivo(Hospital hospital){
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Empleados.txt");
        Scanner scanner = null;
        Double salarioTotal=0.0;
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<String> lineasActualizadas = new ArrayList<>();
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                if(partes[4].equals("Operativo")){
                    Empleado empleado = new EmpleadoOperativo(partes[0],partes[1],Integer.parseInt(partes[2]),Integer.parseInt(partes[3]) ,partes[5], hospital,salarioTotal);
                    empleados.add(empleado);
                    if(partes.length == 6){
                        linea += ";" + empleado.getSalarioTotal();
                    }
                }else{
                    Empleado empleado = new EmpleadoDelAreaDeLaSalud(partes[0],Integer.parseInt(partes[1]),partes [2],partes[3],Integer.parseInt(partes[5]),Integer.parseInt(partes[6]), hospital,salarioTotal);
                    empleados.add(empleado);
                    if(partes.length == 7){
                        linea += ";" + empleado.getSalarioTotal();
                    }
                }
                lineasActualizadas.add(linea);
            }
            return empleados;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (scanner != null){
                    scanner.close();
                }
                actualizarSalariosArchivo(lineasActualizadas, "C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Empleados.txt");
            } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
    public static Empleado buscarEmpleado(ArrayList<Empleado> empleados, String nombre){ 
        for (Empleado empleado : empleados){
            if(empleado.getNombre().equals(nombre)){
                return empleado;
            }
        }
        return null;
    }
    public static void guardarEmpleado(Empleado empleado, int tipo) throws IOException{
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Empleados.txt");
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        pw.println(empleado.getNombre()+";"+ empleado.getIdentificacion()+";"+ empleado.getEdad()+";"+ empleado.getSalarioBase()+";"+ tipo);
        pw.close();
    }
    public abstract void calcularSalarioTotal();
    
    public static void actualizarSalariosArchivo(ArrayList<String> lineas, String rutaArchivo){
        try
        {
            FileWriter escritor = new FileWriter(rutaArchivo);
            for (String linea : lineas)
            {
                escritor.write(linea + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
