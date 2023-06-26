/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivel;
    private InstitucionEducativa centro;
    private double valorCarrera;
    private double valorPrestamo;

    public PrestamoEducativo(Persona per, int tp, String ciu, String ni,
            InstitucionEducativa c, double vc) {
        super(per, tp, ciu);

        nivel = ni;
        centro = c;
        valorCarrera = vc;

    }

    public void establecerNivel(String n) {
        nivel = n;
    }

    public void establecerCentro(InstitucionEducativa n) {
        centro = n;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public void calcularValorPrestamo(double n, int tp) {
        valorPrestamo = (valorCarrera / tp) - ((valorCarrera / tp) * 0.1);
    }

    public String obtenerNivel() {
        return nivel;
    }

    public InstitucionEducativa obtenerCentro() {
        return centro;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorPrestamo() {
        return valorPrestamo;
    }

    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro educativo: %s %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del pago del préstamo %s\n",
                cadenaFinal,
                obtenerNivel(),
                centro.obtenerNombreInstitucion(),
                centro.obtenerSiglas(),
                obtenerValorCarrera(),
                obtenerValorPrestamo());

        return cadenaFinal;
    }
}
