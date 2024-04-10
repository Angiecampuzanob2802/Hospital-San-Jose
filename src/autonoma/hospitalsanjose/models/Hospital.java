/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.ArrayList;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.0.1
 * @since 2024-04-08
 * 
 */
public class Hospital {
    /// atributos///
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private int fechaFundacion;
    private boolean estado;
    private Coordenada localizacion;
    private Gerente gerente;
    private ArrayList<Nomina>nominasRealizadas;
    private double metaVentasAnual;
    
    /////constructor////

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, int fechaFundacion, boolean estado, Coordenada localizacion, Gerente gerente, ArrayList<Nomina> nominasRealizadas, double metaVentasAnual) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.nominasRealizadas = nominasRealizadas;
        this.metaVentasAnual = metaVentasAnual;
    }
    ///// metodos de acceso////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Coordenada getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Coordenada localizacion) {
        this.localizacion = localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Nomina> getNominasRealizadas() {
        return nominasRealizadas;
    }

    public void setNominasRealizadas(ArrayList<Nomina> nominasRealizadas) {
        this.nominasRealizadas = nominasRealizadas;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }
    
    //// metodos////
    public void realizarNomina(Nomina nomina) {
        nominasRealizadas.add(nomina);
        // Actualizar presupuesto y estado del hospital
        double totalNomina = calcularTotalNomina();
        presupuesto -= totalNomina;
        if (presupuesto < 0) {
            estado = false; // Cambiar a estado de quiebra
        }
    }
    private double calcularTotalNomina() {
        double total = 0;
        for (Nomina nomina : nominasRealizadas) {
            total += nomina.getSalarioTotal();
        }
        return total;
    }

    public void registrarPatrocinio(double monto) {
        presupuesto += monto;
        if (presupuesto >= 0) {
            estado = true; // Cambiar a estado activo
        }
    }
    /*
    gestionar ventaMedicamento desde el hospital
    */

}
