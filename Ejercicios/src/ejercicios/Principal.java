/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import Paquetetres.Demo;
import Paquetecuatro.DemoDos;
/**
 *
 * @author dennisjimenez
 */
public class Principal {
    public static void main(String[] args){
        int suma = Demo.valor + DemoDos.valordos;
        int multiplicacion = Demo.valor * DemoDos.valordos;
        
        System.out.printf("%d\n", suma);
        System.out.printf("%d\n",multiplicacion);
    }
            
}
