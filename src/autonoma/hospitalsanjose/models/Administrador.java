/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 * La clase Administrador representa un tipo específico de usuario en el sistema,con permisos adicionales de administración.
 * @author Angie Campuzano Betancur & Brayan Estivel Díaz
 * @versión 1.0.0
 * @since 2024-04-08
 */

public class Administrador extends Gerente{
    ///Atributos
    /**
     * El nombre de usuario del administrador
     */
    private String username;
    /**
     * La contraseña del administrador
     */
    private String password;
    
    ///constructor con parametros
    /**
     * El constructor de la clase Administrador
     * @param username El nombre de usuario del administrador.
     * @param password La contraseña del administrador.
     * @param nombre El nombre del administrador.
     * @param numeroIdentificacion El número de identificación del administrador.
     * @param edad La edad del administrador.
     * @param carrera La carrera del administrador.
     */
    public Administrador(String username, String password,String nombre, String numeroIdentificacion, int edad, String carrera) {
        super(nombre, numeroIdentificacion, edad, carrera);
        this.username = username; //Inicializa el nombre del usuario
        this.password = password;// Inicicaliza la contraseña
    }
    ///metodos de acceso
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
}
