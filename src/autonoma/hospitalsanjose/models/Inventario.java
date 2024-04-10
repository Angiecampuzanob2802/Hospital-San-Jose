/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.0.1
 * @since 2024-04-09
 */
public class Inventario {
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////atributos
    private int id;
    private Date anoActualizacion;
    private ArrayList<Medicamento> medicamentos;
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////constructores
    public Inventario(int id, Date anoActualizacion, ArrayList<Medicamento> medicamentos) {
        this.id = id;
        this.anoActualizacion = anoActualizacion;
        this.medicamentos = new ArrayList<>();
    }
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////metodos de acceso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAnoActualizacion() {
        return anoActualizacion;
    }

    public void setAnoActualizacion(Date anoActualizacion) {
        this.anoActualizacion = anoActualizacion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // Metodos de gestión de productos o CRUD de productos
    
    //////////////metodo para agregar medicamento
    public boolean agregarMedicamento(Medicamento medicamento){
        
        return this.medicamentos.add(medicamento);
    }
    
    ///////////////metodo para bucar producto
    public Medicamento buscarMedicamento(Medicamento medicamento){
        
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            if(m.equals(medicamentos)){
                return m;
            }
        }
        return null;   
    }
    
    /////////////////metodo para buscar producto por ID
    public Medicamento buscarMedicamento(long id){
        
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            if(m.getId()== id){
                return m;
            }
        }
        return null;   
    }
    
    ///////////////////metodo para buscar por nombre
    public Medicamento buscarMedicamento(String nombre){
        
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            if(m.getNombre().equals(nombre)){
                return m;
            }
        }
        return null;   
    }
    
    //////////////////////metodo para buscar por indice
    private int buscarIndiceMedicamento(long id){
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            if(m.getId() == id){
                return i;
            }
        }
        return -1;  
    }
    
    //////////////////////metodo para actualizar medicamentos
    public Medicamento actualizarMedicamento(long id, Medicamento medicamento)
    {
        int index = this.buscarIndiceMedicamento(id);
        if(index>=0){
            return this.medicamentos.set(index, medicamento);
        }else{
            return null;
        }
    }
    
    ///////////////////////metodo para eliminar medicamentos
    public Medicamento eliminarMedicamento(long id){
        
        int index = this.buscarIndiceMedicamento(id);
        if(index>=0){
            return this.medicamentos.remove(index);
        }else{
            return null;
        }
    }
    
    //////////////////////////metodo para mostrar inventario
    public String mostrarInventario(){
        String inventario = "";
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            inventario += m.toString()+"\n";
        }
        return inventario;
    }
}
