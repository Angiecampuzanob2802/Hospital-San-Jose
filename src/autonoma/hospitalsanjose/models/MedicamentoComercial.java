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
 * 
 */
public class MedicamentoComercial extends Medicamento{
    ///// atributos////
    private String fabricante;
    
    //////constructor
    public MedicamentoComercial(String nombre,String descripcion,double costo,double precioVenta,String fabricante) {
        super(nombre,descripcion,costo,precioVenta);
        this.fabricante = fabricante;
        this.precioVenta=costo * 1.25;
    }
    /////metodos de acceso

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }   
}
