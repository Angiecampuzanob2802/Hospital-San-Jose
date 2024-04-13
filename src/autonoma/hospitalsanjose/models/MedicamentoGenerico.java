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
public class MedicamentoGenerico extends Medicamento {
    
    public MedicamentoGenerico(long id,String nombre,String descripcion,double costo,double precioVenta){
        super(id,nombre, descripcion,costo,precioVenta);
        this.precioVenta = costo * 1.10;
    }       
}
