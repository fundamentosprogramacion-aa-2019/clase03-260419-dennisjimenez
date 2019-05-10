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
public class CondicionalDoble {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su calificaión : ");
        int calificacion = entrada.nextInt();
        String miMensaje1= MiMensaje.mensajeUno;
        String miMensaje2= MiMensaje.mensajeDos;
        if (calificacion >= 80) {
            System.out.printf("%s con %d puntos :", miMensaje1, 
                    calificacion);
                        
        }else{
            System.out.printf("%s con %d puntos :", miMensaje2, 
                    calificacion);}   
    }
}
