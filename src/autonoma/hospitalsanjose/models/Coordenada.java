/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
/**
 * La clase Coordenada representa una ubicación geográfica mediante latitud y longitud.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class Coordenada {
    /// atributos
    /**
     * la longitud de la ubicación
     */
    private double longitud;
    /**
     * la latitud de la ubicación
     */
    private double latitud;
    
    ///// constructor con parametros
    /**
     * Constructor de la clase Coordenada
     * @param longitud La longitud de la ubicación
     * @param latitud  La latitud de la ubicación
     */
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
    /**
     * Retorna una representación en cadena de la ubicación, incluyendo latitud y longitud.
     * @return Una cadena que representa la ubicación en el formato "Latitud: [latitud], Longitud: [longitud]". 
     */
    @Override
    public String toString() {
    return "Latitud: " + latitud + ", Longitud: " + longitud;
    }    
}
