/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.0.1
 * @since 2024-04-08
 */
public abstract class Medicamento {
    ////////////////////////////////////////////////////////////////////////////
    ///////////atributos
    private int id;
    private Date anoActualizacion;
    private String nombre;
    private String descripcion;
    private double costo;
    private double precioVenta;
    private ArrayList<Medicamento>medicamentos;

    ////////////////////////////////////////////////////////////////////////////
    //////////////constructores

    public Medicamento(int id, Date anoActualizacion, String nombre, String descripcion, double costo, double precioVenta, ArrayList<Medicamento> medicamentos) {
        this.id = id;
        this.anoActualizacion = anoActualizacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.medicamentos = medicamentos;
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////metodos de acceso

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

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}
