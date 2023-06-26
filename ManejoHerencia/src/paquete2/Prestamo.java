/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona per, int tp, String ciu) {
        beneficiario = per;
        tiempoPrestamo = tp;
        ciudad = ciu;
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }
    public void establecerTiempoPrestamo(int n) {
        tiempoPrestamo = n;
    }
    public void establecerCiudad(String n) {
        ciudad = n;
    }
    public Persona obtenerBeneficiario() {
        return beneficiario;
    }
    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }
    public String obtenerCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre de beneficiario: %s\n"
                + "Appelido de beneficiario: %s\n"
                + "Nombre de usuario beneficiario: %s\n"
                + "Tiempo de prestamo en meses: %s\n"
                + "Ciudad del prestamo : %s\n", 
                beneficiario.obtenerNombrePersona(),
                beneficiario.obtenerApellidoPersona(),
                beneficiario.obtenerUser(),
                tiempoPrestamo,
                ciudad);
        
        return cadena;
    }
    
}
