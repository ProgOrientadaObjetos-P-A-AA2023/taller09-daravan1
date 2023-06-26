/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        ArrayList<PrestamoAutomovil> listaPrestamoAutomovil = new ArrayList<>();
        ArrayList<PrestamoEducativo> listaPrestamoEducativo = new ArrayList<>();

        while (bandera) {
            System.out.println("Ingrese 1 para un prestamo de tipo "
                    + "automovilistico, 2 para un prestamo educativo 0 "
                    + "3 para salir y presentar sus prestamos:");
            int op = entrada.nextInt();
            entrada.nextLine();
            if (op == 1) {
                System.out.println("Ingrese el tipo de automovil:");
                String tipo = entrada.nextLine();
                System.out.println("Ingrese la marca de automovil:");
                String marca = entrada.nextLine();
                System.out.println("Ingrese el nombre del garante:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido del garante:");
                String apellido = entrada.nextLine();
                System.out.println("Ingrese el nombre de usuario del garante:");
                String usuario = entrada.nextLine();
                System.out.println("Ingrese el nombre del beneficiario:");
                String nombreb = entrada.nextLine();
                System.out.println("Ingrese el apellido del beneficiario:");
                String apellidob = entrada.nextLine();
                System.out.println("Ingrese el nombre de usuario del beneficiario:");
                String usuariob = entrada.nextLine();
                System.out.println("Ciudad del préstamo:");
                String ciudad = entrada.nextLine();
                ciudad.toLowerCase();
                System.out.println("Ingrese el valor del automovil:");
                double valor = entrada.nextDouble();
                System.out.println("Ingrese tiempo de préstamo en meses:");
                int meses = entrada.nextInt();
                entrada.nextLine();

                Persona gara = new Persona(nombre, apellido, usuario);
                Persona bene = new Persona(nombreb, apellidob, usuariob);

                PrestamoAutomovil prestamoA = new PrestamoAutomovil(bene, 
                        meses, ciudad.toLowerCase(), tipo, marca, 
                        gara, valor);
                prestamoA.calcularValorMensual(valor, meses);
                listaPrestamoAutomovil.add(prestamoA);
            }
            if (op == 2) {
                System.out.println("Ingrese el nivel de estudio:");
                String nivel = entrada.nextLine();
                System.out.println("Ingrese el nombre de la institucion:");
                String nombreI = entrada.nextLine();
                System.out.println("Ingrese las siglas de la institucion:");
                String siglas = entrada.nextLine();
                System.out.println("Ingrese el nombre del beneficiario:");
                String nombreb = entrada.nextLine();
                System.out.println("Ingrese el apellido del beneficiario:");
                String apellidob = entrada.nextLine();
                System.out.println("Ingrese el nombre de usuario del beneficiario:");
                String usuariob = entrada.nextLine();
                System.out.println("Ciudad del préstamo:");
                String ciudad = entrada.nextLine();
                System.out.println("Ingrese tiempo de préstamo en meses:");
                int meses = entrada.nextInt();
                System.out.println("Ingrese el valor de la carrera:");
                double valor = entrada.nextDouble();
                entrada.nextLine();
                
                Persona bene = new Persona(nombreb, apellidob, usuariob);
                InstitucionEducativa ins = new InstitucionEducativa(nombreI, siglas);
                
                PrestamoEducativo prestamoE = new PrestamoEducativo(bene, 
                        meses, ciudad.toUpperCase(), nivel, ins, 
                        valor);
                prestamoE.calcularValorPrestamo(valor, meses);
                listaPrestamoEducativo.add(prestamoE);
            }
            if (op == 3) {
                System.out.println("Lista de prestamos automovil:\n");
                for (PrestamoAutomovil prestamo : listaPrestamoAutomovil){
                    System.out.println(prestamo.toString());
                } 
                System.out.println("Lista de prestamos estudiantiles:\n");
                for (PrestamoEducativo prestamo1 : listaPrestamoEducativo){
                    System.out.println(prestamo1.toString());
                } 
                bandera = false;
            }
        }
    }
}
