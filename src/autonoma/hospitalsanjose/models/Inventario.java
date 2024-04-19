/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.util.ArrayList;
/**
 * 
 * La clase Inventario representa el inventario de medicamentos de un hospital,
 * con su identificador, año de actualización y lista de medicamentos.
 * Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los medicamentos.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-09
 */
public class Inventario {
    //////atributos
    /**
     * El Identificar del inventario
     */
    private int id;
    /**
     * El año de actualización del inventario
     */
    private int anoActualizacion;
    /**
     * La lista de medicamentos del inventario
     */
    private ArrayList<Medicamento> medicamentos;
    
    //////////////constructor con parametros 
    /**
     * Constructor de la clase Inventario
     * @param id El identificador del inventario.
     * @param anoActualizacion El año de actualización del inventario.
     * @param medicamentos La lista de medicamentos en el inventario.
     */
    public Inventario(int id, int anoActualizacion, ArrayList<Medicamento> medicamentos) {
        this.id = id;
        this.anoActualizacion = anoActualizacion;
        this.medicamentos = medicamentos;
    }
    ////////////////metodos de acceso
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAnoActualizacion() {
        return anoActualizacion;
    }

    public void setAnoActualizacion(int anoActualizacion) {
        this.anoActualizacion = anoActualizacion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    // Metodos de gestión de productos o CRUD de productos
    
    //////////////metodo para agregar medicamento
    /**
     * Agregar un medicamento al inventario 
     * @param medicamento El medicamento a agregar
     * @return true si el medicamento se agregó correctamente, false en caso contrario.
     */
     
    public boolean agregarMedicamento(Medicamento medicamento){
        
        return this.medicamentos.add(medicamento);
    }
    
    ///////////////metodo para bucar producto
    /**
     * Busca un medicamento en el inventario por objeto.
     * @param medicamento El medicamento a buscar.
     * @return El medicamento encontrado, o null si no se encontró
     */
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
    /**
     * Busca un medicamento en el inventario por ID.
     * @param id El ID del medicamento a buscar.
     * @return El medicamento encontrado, o null si no se encontró.
     */
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
    /**
     * Busca un medicamento en el inventario por nombre.
     * @param nombre El nombre del medicamento a buscar.
     * @return El medicamento encontrado, o null si no se encontró. 
     */
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
    /**
     * Busca el índice de un medicamento en el inventario por ID.
     * @param id El ID del medicamento a buscar.
     * @return El índice del medicamento encontrado, o -1 si no se encontró.
     */
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
    /**
     * Actualiza un medicamento en el inventario por ID.
     * @param id El ID del medicamento a actualizar.
     * @param medicamento El medicamento actualizado.
     * @return El medicamento actualizado, o null si no se encontró el medicamento.
     */
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
    /**
     * Elimina un medicamento del inventario por ID.
     * @param id El ID del medicamento a eliminar.
     * @return El medicamento eliminado, o null si no se encontró el medicamento.   
     */
    public Medicamento eliminarMedicamento(long id){
        int index = this.buscarIndiceMedicamento(id);
        if(index>=0){
            return this.medicamentos.remove(index);
        }else{
            return null;
        }
    }

    //////////////////////////metodo para mostrar inventario
    /**
     * Muestra el inventario de medicamentos.
     * @return Una cadena de texto con la información de todos los medicamentos en el inventario.
     */
    /*
    public String mostrarInventario(){
        String inventario = "";
        for(int i=0;i<this.medicamentos.size();i++){
            Medicamento m = this.medicamentos.get(i);
            inventario += m.toString()+"\n";
        }
        return inventario;
    }
    */
}
