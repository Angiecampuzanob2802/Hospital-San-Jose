/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.main;
import autonoma.hospitalsanjose.models.Administrador;
import autonoma.hospitalsanjose.models.Empleado;
import autonoma.hospitalsanjose.models.Enfermedad;
import autonoma.hospitalsanjose.models.Hospital;
import autonoma.hospitalsanjose.models.Inventario;
import autonoma.hospitalsanjose.models.Medicamento;
import autonoma.hospitalsanjose.models.Paciente;
import autonoma.hospitalsanjose.views.InicioHospital;
import autonoma.hospitalsanjose.views.VentanaPrincipal;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
 * @since 2024-04-08
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Hospital hospital = Hospital.crearGerenteDesdeArchivo();
        Administrador administrador= new Administrador("Aarong","12345678","Angie","1059813913",29,"Salud Publica");
        hospital.setAdministrador(administrador);
        
       // Lectura archivos Medicamentos 
        ArrayList<Medicamento> listaMedicamentos = Medicamento.crearMedicamentoDesdeArchivo();
        //Lectura Archivo Empleados
        ArrayList<Enfermedad> listaEnfermedades = Enfermedad.crearEnfermedades(listaMedicamentos);
        // Lectura Archivo Pacientes
        ArrayList<Paciente> listaPacientes = Paciente.crearPacienteDesdeArchivo(listaEnfermedades);
        //Lectura Archivo Empleados
        ArrayList<Empleado> listaEmpleados = Empleado.crearEmpleadoDesdeArchivo(hospital);
        
        //Inicializar Inventario
        Inventario inventario = new Inventario(1, 2024,null);
        inventario.setMedicamentos(listaMedicamentos);
        
        // Completar informacion Hospital
        hospital.setEmpleados(listaEmpleados);
        hospital.setPacientes(listaPacientes);
        hospital.setInventario(inventario);
        
        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        InicioHospital login = new InicioHospital(ventana, true, hospital, ventana);
        login.setVisible(true);
    }
}
