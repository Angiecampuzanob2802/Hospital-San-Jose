/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 
 *La clase abstracta Medicamento representa un medicamento con su identificador, nombre,descripción, costo y precio de venta.
 * Esta clase es abstracta y proporciona una base para la creación de diferentes tipos de medicamentos.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public abstract class Medicamento {
    /**
     * El contador de Medicamentos
     */
    private static int contadorMedicamento=1;
    ///////////atributos
    /**
     * El identificador del medicamento
     */
    private long id;
    /**
     * El nombre del medicamento
     */
    private String nombre;
    /**
     * La descripcion del medicamento
     */
    private String descripcion;
    /**
     * El costo del medicamento
     */
    public double costo;
    /**
     * El precio de venta del medicamento
     */
    public double precioVenta;

    //////////////constructor sin parametros
    /**
     * Constructor de la clase Medicamentos sin parametros
     */
    public Medicamento(){
        this.id=Medicamento.contadorMedicamento;
        this.nombre=" ";
        this.descripcion=" ";
        this.costo=0;
        this.precioVenta=0;  
        contadorMedicamento ++;
    }
    /////////// constructor con parametros
    /**
     * Constructor de la clase Medicamentos
     * @param id El identificador del medicamento.
     * @param nombre El nombre del medicamento.
     * @param descripcion La descripción del medicamento.
     * @param costo El costo del medicamento.
     * @param precioVenta El precio de venta del medicamento.
     */
    public Medicamento(long id, String nombre, String descripcion, double costo, double precioVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
        contadorMedicamento ++;
    }
    ////// metodos de acceso
    public static int getContadorMedicamento() {
        return contadorMedicamento;
    }
    public static void setContadorMedicamento(int contadorMedicamento) {
        Medicamento.contadorMedicamento = contadorMedicamento;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    //// metodos
    public static ArrayList<Medicamento> crearMedicamentoDesdeArchivo()
    {
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Medicamentos.txt");
        Scanner scanner = null;
        Double costoTotal =0.0;
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        ArrayList<String> lineasActualizadas = new ArrayList<>();
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                if(partes[3].equals("0"))
                {
                    Medicamento medicamento = new MedicamentoGenerico(contadorMedicamento, partes[0],partes[1],Integer.parseInt(partes[2]),costoTotal);
                    medicamentos.add(medicamento);
                    if(partes.length ==4){
                        linea += ";" + medicamento.getPrecioVenta();
                    }
                }else{
                    Medicamento medicamento = new MedicamentoComercial(contadorMedicamento,partes[0],partes[1], Integer.parseInt(partes[2]),costoTotal,partes[4]);
                    medicamentos.add(medicamento);
                    if(partes.length ==5){
                        linea += ";" + medicamento.getPrecioVenta();
                    }
                }
                lineasActualizadas.add(linea);
            }
            return medicamentos;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (scanner != null){
                    scanner.close();
                }
                actualizarCostoMedicamentoArchivo(lineasActualizadas,"C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Medicamentos.txt");
            } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
    public static Medicamento buscarMedicamento(ArrayList<Medicamento> medicamentos, String nombre){ 
        for (Medicamento medicamento : medicamentos){
            if(medicamento.getNombre().equals(nombre)){
                return medicamento;
            }
        }
        return null;
    }
    public static void guardarMedicamento(Medicamento medicamento, Integer tipo) throws IOException {
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Medicamentos.txt");
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        pw.println(medicamento.getNombre()+";"+medicamento.getDescripcion()+";"+ medicamento.getCosto()+";"+ medicamento.getPrecioVenta()+";"+ tipo);
        pw.close();
    }
     public abstract void calcularCostoTotal();
     
      public static void actualizarCostoMedicamentoArchivo(ArrayList<String> lineas, String rutaArchivo) {
        try{
            FileWriter escritor = new FileWriter(rutaArchivo);
            for (String linea : lineas){
                escritor.write(linea + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
