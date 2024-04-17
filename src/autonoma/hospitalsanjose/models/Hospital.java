/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * La clase Hospital representa un hospital con su nombre, dirección, teléfono,
 * presupuesto, fecha de fundación, estado, localización, nóminas realizadas y
 * meta de venta anual.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.1.6
 * @since 2024-04-08
 * 
 */
public class Hospital {
    /// atributos///
    /**
     * El nombre del Hospital
     */
    private String nombre;
    /**
     * La direccion del Hospital
     */
    private String direccion;
    /**
     * El telefono del Hospital
     */
    private String telefono;
    /**
     * El presupuesto del Hospital
     */
    private double presupuesto;
    /**
     * La Fecha de fundación del Hospital
     */
    private Date fechaFundacion;
    /**
     * El estado del Hospital
     */
    private boolean estado;
    /**
     * La localización del Hospital
     */
    private Coordenada localizacion;
    /**
     * Las nominas realizadas por el Hospital
     */
    private ArrayList<Nomina>nominasRealizadas;
    /**
     * La meta de venta anual del Hospital
     */
    private double metaVentaAnual;
    private Gerente gerente;
    
    private Administrador administrador;
    /////constructor con parametros /////
    /**
     * El constructor de la clase Hospital
     * @param nombre El nombre del hospital.
     * @param direccion La dirección del hospital.
     * @param telefono El teléfono del hospital.
     * @param presupuesto El presupuesto del hospital.
     * @param fechaFundacion La fecha de fundación del hospital.
     * @param estado El estado del hospital.
     * @param localizacion La localización del hospital.
     * @param nominasRealizadas Las nóminas realizadas por el hospital.
     * @param metaVentaAnual La meta de venta anual del hospital.
     * @param gerente El gerente del Hospital
     * 
     */

    public Hospital(String nombre, String direccion, String telefono, double presupuesto, Date fechaFundacion, boolean estado, Coordenada localizacion,ArrayList<Nomina> nominasRealizadas, double metaVentaAnual,Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
        this.nominasRealizadas = nominasRealizadas;
        this.metaVentaAnual = metaVentaAnual;
        this.gerente=gerente;
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
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
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
    public ArrayList<Nomina> getNominasRealizadas() {
        return nominasRealizadas;
    }

    public void setNominasRealizadas(ArrayList<Nomina> nominasRealizadas) {
        this.nominasRealizadas = nominasRealizadas;
    }

    public double getMetaVentasAnual() {
        return metaVentaAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentaAnual = metaVentasAnual;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    //// metodos////
    /**
     * Realiza una nómina para el hospital, actualizando el presupuesto y el estado del hospital.
     * @param nomina La nómina a realizar.
     */
    public void realizarNomina(Nomina nomina) {
        nominasRealizadas.add(nomina);
        // Actualizar presupuesto y estado del hospital
        double totalNomina = calcularTotalNomina();
        presupuesto -= totalNomina;
        if (presupuesto < 0) {
            estado = false; // Cambiar a estado de quiebra
        }
    }
    /**
     * Calcula el total de la nómina realizada por el hospital.
     * @return El total de la nómina.
     */
    private double calcularTotalNomina() {
        double total = 0;
        for (Nomina nomina : nominasRealizadas) {
            total += nomina.getSalarioTotal();
        }
        return total;
    }
    /**
     * Registra un patrocinio para el hospital, actualizando el presupuesto y el estado del hospital.
     * @param monto El monto del patrocinio a registrar.
     */
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
