/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marca;
    private Persona garante;
    private double valorAuto;
    private double valorMensual;

    public PrestamoAutomovil(Persona per, int tp, String ciu, String ta,
            String m, Persona g, double va) {
        super(per, tp, ciu);

        tipoAuto = ta;
        marca = m;
        garante = g;
        valorAuto = va;
    }

    public void establecerTipoAuto(String n) {
        tipoAuto = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerValorAuto(double n) {
        valorAuto = n;
    }

    public void calcularValorMensual(double n, int tp) {
        valorMensual = (valorAuto / tp);
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarca() {
        return marca;
    }
    public double obtenerValorAuto() {
        return valorAuto;
    }
    public double obtenerValorMensual() {
        return valorMensual;
    }
    
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Nombre garante: %s\n"
                + "Apellido garante: %s\n"
                + "Nombre de usuario garante: %s\n"
                +"Valor de automóvil: %s\n"
                + "Valor mensual del pago del préstamo: %s\n",
                cadenaFinal,
                obtenerTipoAuto(),
                obtenerMarca(),
                garante.obtenerNombrePersona(),
                garante.obtenerApellidoPersona(),
                garante.obtenerUser(),
                obtenerValorAuto(),
                obtenerValorMensual());

        return cadenaFinal;
    }
}
