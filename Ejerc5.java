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
public class Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que lea un número entero por teclado y muestre 
        //por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        double raiz = Math.sqrt(num);
        int doble = (num*2);
        int triple = (num*3);
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
        
    }
}             
               
    

   
    
    

