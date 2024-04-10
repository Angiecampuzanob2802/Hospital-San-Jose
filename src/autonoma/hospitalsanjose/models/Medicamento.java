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
 */
public abstract class Medicamento {
    ////////////////////////////////////////////////////////////////////////////
    ///////////atributos
    private String nombre;
    private String descripcion;
    private String enfermedadAlivia;

    ////////////////////////////////////////////////////////////////////////////
    //////////////constructores
    public Medicamento(String nombre, String descripcion, String enfermedadAlivia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAlivia = enfermedadAlivia;
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////metodos de acceso
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

    public String getEnfermedadAlivia() {
        return enfermedadAlivia;
    }

    public void setEnfermedadAlivia(String enfermedadAlivia) {
        this.enfermedadAlivia = enfermedadAlivia;
    }
    
    
}
