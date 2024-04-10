/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.Date;

/**
 *
 *@author Angie Campuzano Betancur & Brayan Estivel Díaz
 *@versión 0.0.1
 *@since 2024-04-08
 */
public class Nomina {
    ////atributos////
    private double salarioTotal;
    private Date fecha;
    private String identificadorUnico;
    
    //// constructor////
    public Nomina(double salarioTotal, Date fecha, String identificadorUnico) {
        this.salarioTotal = salarioTotal;
        this.fecha = fecha;
        this.identificadorUnico = identificadorUnico;
    }
    //////metodos de acceso///

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }
}
