/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * 
 *La clase abstracta Medicamento representa un medicamento con su identificador, nombre,descripción, costo y precio de venta.
 * Esta clase es abstracta y proporciona una base para la creación de diferentes tipos de medicamentos.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
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
    private double costo;
    /**
     * El precio de venta del medicamento
     */
    public double precioVenta;
    /**
     * ArrayList<Medicamento>medicamnetos   
     */

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
    //// metodo
    /**
     * Devuelve una representación en cadena del objeto de Medicamento
     * @return Una cadena que representa el objeto Medicamento.
     */
    @Override
     public String toString(){
       return  " Medicamento:" +id+ "\n"+
               " Descripcion:" +descripcion+ "\n"+
               "  Nombre: " +nombre+ "\n"+
               "  Costo: " +costo+ "\n"+
               "  Precio: " +precioVenta + "\n";         
    } 
}
