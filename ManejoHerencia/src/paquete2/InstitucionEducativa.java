/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author darav
 */
public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

    public InstitucionEducativa(String n, String s){
        nombre = n;
        siglas = s;
    }
    
    public void establecerNombreInstitucion(String nom) {
        nombre = nom;
    }

    public void establecerSiglas(String sig) {
        siglas = sig;
    }

    public String obtenerNombreInstitucion() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

}
