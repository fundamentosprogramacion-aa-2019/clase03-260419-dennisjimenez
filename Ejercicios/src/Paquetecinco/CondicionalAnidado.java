/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetecinco;

import java.util.Scanner;
import paquetedos.MiMensaje;

/**
 *
 * @author Salas
 */
public class CondicionalAnidado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificaión : ");
        int calificacion = entrada.nextInt();
        String miMensaje1 = MiMensaje.mensajeUno;
        String miMensaje2 = MiMensaje.mensajeDos;
        if (calificacion >= 90) {
            System.out.printf("Usted está %s (excelente) con %d puntos\n",
                    miMensaje1,  calificacion);

        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Usted está %s (muy buena) con %d puntos\n",
                        miMensaje1, calificacion);

            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Usted está %s (regular) con %d puntos\n",
                            miMensaje1, calificacion);

                } else {
                    System.out.printf("Usted está %s con %d puntos\n",
                            miMensaje2, calificacion);
                }
            }
        }
    }

}
