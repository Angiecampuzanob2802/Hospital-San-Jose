/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

import java.util.Date;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @versión 0.0.1
 * @since 2024-04-08
 */
public class Cita {
    //// atributo
    private Paciente paciente;
    private String medico;
    private Date fecha;
    private double valorCita;
    
    ///// constructor
    public Cita(Paciente paciente, String medico, Date fecha, double valorCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valorCita = valorCita;
    }
    ///// metodos de acceso
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorCita() {
        return valorCita;
    }

    public void setValorCita(double valorCita) {
        this.valorCita = valorCita;
    }
    public void atenderPaciente() {
        // Lógica para atender al paciente durante la cita
        System.out.println("La cita para el paciente " + paciente.getNombre() + " ha sido atendida por el médico " + medico + ".");
    }

    public void registrarEnfermedad(String enfermedad) {
        // Lógica para registrar una enfermedad durante la cita
        paciente.agregarEnfermedad(enfermedad);
        System.out.println("La enfermedad " + enfermedad + " ha sido registrada para el paciente " + paciente.getNombre() + ".");
    }

    public void recetarMedicamento(String medicamento) {
        // Lógica para recetar un medicamento durante la cita
        System.out.println("Se ha recetado el medicamento " + medicamento + " al paciente " + paciente.getNombre() + ".");
    }
}
