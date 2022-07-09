/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author evame
 */
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que pida dos números enteros por teclado y 
        //calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero entero");
        int num2 = leer.nextInt();
        int suma;
        suma = (num1+num2);
               
        System.err.println("La suma de ambos numeros es " + suma);
        
        
        
     
     
     
     
    }
    
}
