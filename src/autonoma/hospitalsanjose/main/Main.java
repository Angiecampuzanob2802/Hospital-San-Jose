/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.main;

import autonoma.hospitalsanjose.models.Administrador;
import autonoma.hospitalsanjose.models.Hospital;
import autonoma.hospitalsanjose.views.InicioHospital;
import autonoma.hospitalsanjose.views.VentanaPrincipalHospital;

/**
 *
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 0.0.1
 * @since 2024-04-08
 */
public class Main {
    
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("San jose St Bonaventure", "2425 Samaritan Dr, San Jose, CA 95124, Estados Unidos", "+1 408-559-2011", 1.000000, 1965, true, 37.25157313140872 -121.94667417922749, "Nomina", 1.0000000000000,gerente);
        Administrador administrador = new Administrador("Aarong", "12345678", "Aaron Glassman", "84.941.564", 69, "Neurocirujano");
        hospital.setAdministrador(administrador);
        
        VentanaPrincipalHospital ventana = new VentanaPrincipalHospital(hospital);
        InicioHospital login = new InicioHospital(ventana, true, hospital, ventana);
        login.setVisible(true);
    }
}
