/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
/**
 * La clase MedicamentoComercial representa un medicamento que se vende comercialmente,con información adicional sobre su fabricante.
 * Extiende la clase Medicamento.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 * 
 */
public class MedicamentoComercial extends Medicamento{
    ///// atributo////
    /**
     * El fabricante del medicamento comercial
     */
    private String fabricante;
    
    //////constructor con parametros
    /**
     * Constructor de la clase MedicamentoComercial
     * @param id El ID del medicamento.
     * @param nombre El nombre del medicamento.
     * @param descripcion La descripción del medicamento.   
     * @param costo  El costo del medicamento.
     * @param precioVenta El precio de venta del medicamento.
     * @param fabricante El fabricante del medicamento.
     */
    public MedicamentoComercial(long id,String nombre,String descripcion,double costo,double precioVenta,String fabricante) {
        super(id,nombre,descripcion,costo,precioVenta);
        this.fabricante = fabricante;
        calcularCostoTotal();
    }
    /////metodos de acceso

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    } 
    //// metodos
    @Override
    public void calcularCostoTotal(){
        precioVenta = costo + (costo * 0.2);
    }
}
