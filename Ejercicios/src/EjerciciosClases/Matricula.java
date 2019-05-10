/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClases;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Matricula {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String ciudad, estadoCivil;
        int edad;
        double costo_matricula = 120;
        double costo_final_matricula = 0;
        double descuento = 0;
        double impuesto = 0;
        System.out.println("Ingrese su ciudad de nacimiento ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estadoCivil = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        if (ciudad.equals("Loja") || ciudad.equals("Zamora")) {
            //descuento
            descuento = descuento + (20 * costo_matricula) / 100;            
        }
        if ((edad >= 17) && (edad < 20)) {
            //descuento
            descuento = descuento + (10 * costo_matricula) / 100;            
        }
        if (estadoCivil.equals("casado")) {
            //descuento
            descuento = descuento + (5 * costo_matricula) / 100;            
        }
        int costo_amtricula;
        
        impuesto = (2 * costo_matricula) / 100;
        costo_final_matricula = costo_matricula - descuento + impuesto;
        System.out.printf("Su matricula es %.2f :", costo_final_matricula);
    }
    

}
