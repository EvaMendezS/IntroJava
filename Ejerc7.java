/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author evame
 */
public class Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Crear un programa que pida una frase y si esa frase es igual a “eureka”
       //el programa
      //pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
      //Nota: investigar la función equals() en Java.
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese su contraseña: ");
      String frase = leer.nextLine();
      String correcta = "eureka";
       if (frase.equalsIgnoreCase(correcta)) {

      System.out.println("Contraseña correcta");
    }
    else {
      System.out.println("Contraseña incorrecta");
    }
    }
  }  
