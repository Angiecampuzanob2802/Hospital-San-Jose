/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * La clase MedicamentoGenerico representa un medicamento genérico, el cual es una versión no patentada de un medicamento que contiene 
 * los mismos ingredientes activos en la misma concentración que el medicamento original.
 * Extiende la clase Medicamento para heredar sus características básicas.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class MedicamentoGenerico extends Medicamento {
    ////// constructor con parametros
    /**
     * El Constructor de la clase MedicamentoGenerico
     * @param id El identificador único del medicamento genérico.
     * @param nombre El nombre del medicamento genérico.
     * @param descripcion La descripción del medicamento genérico.
     * @param costo El costo del medicamento genérico para adquirirlo
     * @param precioVenta  El precio al que se vende el medicamento genérico
     */
    
    public MedicamentoGenerico(long id,String nombre,String descripcion,double costo,double precioVenta){
        super(id,nombre, descripcion,costo,precioVenta);//Llamada al constructor de la clase base Medicamento
        calcularCostoTotal();
    }   
    ///// metodos
    @Override
        public void calcularCostoTotal(){
        precioVenta = costo + (costo * 0.1);
    }
    
}
