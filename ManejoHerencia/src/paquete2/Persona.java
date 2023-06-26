/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author darav
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String username;
    
    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        username = user;
    }
    public void establecerNombrePersona(String nom) {
        nombre = nom;
    }

    public void establecerApellidoPersona(String ape) {
        apellido = ape;
    }

    public void establecerUser(String user) {
        username = user;
    }

    public String obtenerNombrePersona() {
        return nombre;
    }

    public String obtenerApellidoPersona() {
        return apellido;
    }
    public String obtenerUser() {
        return username;
    }
}
