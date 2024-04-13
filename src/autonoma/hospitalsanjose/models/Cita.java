/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.util.Date;
/**
 * La clase Cita representa una cita médica entre un paciente y un médico.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @versión 0.1.6
 * @since 2024-04-08
 */
public class Cita {
    //// atributos
    /*
    *El paciente que tiene la cita
    */
    private Paciente paciente;
    /*
    *El medico que atendera la cita
    */
    private String medico;
    /*
    *Feha y hora de la cita
    */
    private Date fecha;
    /*
    *El valor monetario de la cita
    */
    private double valorCita;
    
    ///// constructor con parametros
    /**
     * El constructor de la clase medico
     * 
     * @param paciente El paciente que tiene la cita
     * @param medico El médico que atenderá la cita.
     * @param fecha  La fecha y hora de la cita 
     * @param valorCita El valor monetario de la cita.
     */
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
    ///// metodos
    /**
     * Metodos para atender al paciente durante la cita
     */
    public void atenderPaciente() {
        // Lógica para atender al paciente durante la cita
        System.out.println("La cita para el paciente " + paciente.getNombre() + " ha sido atendida por el médico " + medico + ".");
    }
    /**Metodos para registrar una enfermedad durante la cita
     * 
     * @param enfermedad La enfermedad a registrar
     */
    public void registrarEnfermedad(String enfermedad) {
        // Lógica para registrar una enfermedad durante la cita
        /*
        paciente.agregarEnfermedad(enfermedad);
        */
        System.out.println("La enfermedad " + enfermedad + " ha sido registrada para el paciente " + paciente.getNombre() + ".");
    }
    /**
     * Metodo para formular un medicamento durante la cita
     * @param medicamento El medicamento a formular
     */
    public void prescribirMedicamento(String medicamento) {
        // Lógica para recetar un medicamento durante la cita
        System.out.println("Se ha recetado el medicamento " + medicamento + " al paciente " + paciente.getNombre() + ".");
    }
}
