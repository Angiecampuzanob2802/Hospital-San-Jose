/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalsanjose.models;

/**
 *
 * @author Usuario
 */
public class Administrador extends Gerente{
    
    private String username;
    private String password;
    
    
    public Administrador(String username, String password,String nombre, String numeroIdentificacion, int edad, String carrera) {
        super(nombre, numeroIdentificacion, edad, carrera);
        this.username = username;
        this.password = password;
    }

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
