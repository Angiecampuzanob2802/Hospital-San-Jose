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
public class Coordenada {
    /// atributos
    private double longitud;
    private double latitud;
    
    ///// constructor

    public Coordenada(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    ///// metodos de acceso
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    ////// metodo///
    @Override
    public String toString() {
    return "Latitud: " + latitud + ", Longitud: " + longitud;
    }    
}
