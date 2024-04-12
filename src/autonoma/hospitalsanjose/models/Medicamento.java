/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
 * @since 2024-04-08
 */
public abstract class Medicamento {
    private static int contadorMedicamento=1;
    ///////////atributos
    private long id;
    private String nombre;
    private String descripcion;
    private double costo;
    public double precioVenta;
    /**
     * ArrayList<Medicamento>medicamnetos   
     */

    //////////////constructor sin parametros
    public Medicamento(){
        this.id=Medicamento.contadorMedicamento;
        this.nombre=" ";
        this.descripcion=" ";
        this.costo=0;
        this.precioVenta=0;  
        contadorMedicamento ++;
    }
    /////////// constructor con parametros
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
    @Override
     public String toString(){
       return  " Medicamento:" +id+ "\n"+
               " Descripcion:" +descripcion+ "\n"+
               "  Nombre: " +nombre+ "\n"+
               "  Costo: " +costo+ "\n"+
               "  Precio: " +precioVenta + "\n";         
    } 
}
