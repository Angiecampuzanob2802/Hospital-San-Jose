/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * La clase Hospital representa un hospital con su nombre, dirección, teléfono,
 * presupuesto, fecha de fundación, estado, localización, nóminas realizadas y
 * meta de venta anual.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @version 1.0.0
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
     * El logo del Hospital
     */
    private String logo;
    /**
     * El presupuesto del Hospital
     */
    private double presupuesto;
    /**
     * La Fecha de fundación del Hospital
     */
    private int fechaFundacion;
    /**
     * El estado financiero del Hospital
     */
    private String estado;
    /**
     * La localización del Hospital
     */
    private Coordenada localizacion;
    /**
     *Las nominas realizadas por el Hospital
     *private ArrayList<Nomina>nominasRealizadas;
     */
    /**
     * El Gerente del Hospital
     */
    private Gerente gerente;
    /**
     * El inventario de medicamentos del Hospital
     */
    private Inventario inventario;
    /**
     * Lista de empleados del hospital
     */
    private ArrayList<Empleado>empleados;
    /**
     * Lista de pacientes del hospital
     */
    private ArrayList<Paciente>pacientes;
    /**
     * El inicio de Sesión del hospital
     */
    private Administrador administrador;
    /////constructor con parametros /////
    /**
     * El constructor de la clase Hospital
     * @param nombre El nombre del hospital.
     * @param direccion La dirección del hospital
     * @param telefono El teléfono del hospital.
     * @param logo El logo del hospital
     * @param presupuesto El presupuesto del hospital.
     * @param fechaFundacion La fecha de fundación del hospital.
     * @param estado El estado financiero  del hospital.
     * @param localizacion La localización del hospital
     * @param gerente El gerente del hospital
     * @param inventario El inventario del hospital
     * @param empleados Los empleados del hospital
     * @param pacientes Los pacientes del hospital
     * @param administrador El inicio de sesión del hospital
     */

    public Hospital(String nombre, String direccion, String telefono,String logo,double presupuesto, int fechaFundacion, String estado, Coordenada localizacion,Gerente gerente,Inventario inventario,ArrayList<Empleado>empleados,ArrayList<Paciente>pacientes,Administrador administrador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.inventario = inventario;
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.administrador = administrador;
    }
        public Hospital(){
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

    public int getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    //// metodos////
    public void registrarPatrocinio(){
        
    }
    
    public static Hospital crearGerenteDesdeArchivo(){
        File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\HospitalSanJose\\src\\autonoma\\hospitalsanjose\\archivos\\Medicamentos.txt");
        Scanner scanner = null;
        Hospital hospitalNuevo= new Hospital();
        
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String[] partes = linea.split(":");
                
                if (partes.length >= 2){
                    String clave = partes[0];
                    String valor = linea.substring(clave.length() + 1);

                    switch (clave){
                        case "Nombre":
                            hospitalNuevo.setNombre(valor);
                            System.out.println("Entré");
                            break;
                        case "Direccion":
                            hospitalNuevo.setDireccion(valor);
                            break;
                        case "Telefono":
                            hospitalNuevo.setTelefono(valor);
                            break;
                        case "Logo":
                            hospitalNuevo.setLogo(valor);
                            break;
                        case "Presupuesto":
                            hospitalNuevo.setPresupuesto(0);
                            break;
                        case "Fecha de fundacion":
                            hospitalNuevo.setFechaFundacion(0);
                            break;
                        case "Estado":
                            hospitalNuevo.setEstado(valor);
                            break;
                        case "Localizacion":
                            String[] coordenadas = valor.split(";");
                            double latitud = Double.parseDouble(coordenadas[0]);
                            double longitud = Double.parseDouble(coordenadas[1]);
                            hospitalNuevo.getLocalizacion().setLatitud(latitud);
                            break;
                        case "Nombre gerente":
                            hospitalNuevo.gerente.getNombre();
                            break;
                        case "Numero de documento gerente":
                            hospitalNuevo.gerente.getNumeroIdentificacion();
                            break;
                        case "Edad gerente":
                            hospitalNuevo.gerente.getEdad();
                            break;
                        case "Carrera gerente":
                            hospitalNuevo.gerente.getCarrera();
                            break;
                        default:
                            // Ignorar líneas que no corresponden a datos del hospital
                            break;
                    }
                }
            }
            //System.out.println("Soy el archivo");
            //System.out.println("nombre" + hospitalNuevo.getNombre());
            //System.out.println("nombre gerente" + hospitalNuevo.getGerente().getNombreGerente() + hospitalNuevo.getLocalizacion().getLatitud() + " " + hospitalNuevo.getLocalizacion().getLongitud());
            return hospitalNuevo;  
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (scanner != null)
                    scanner.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
    
      public double calcularPresupuestoRestante(){
        return presupuesto;
    }
    
    public boolean cambiarEstadoFinanciero(boolean estado){
        return false;
    }

    public boolean iniciarSesion(String user, String password){
        return this.administrador.getUsername().equals(user) && this.administrador.getPassword().equals(password);
    }
}
