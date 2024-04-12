package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ingrese un número del 0 al 10 para encontrar su factorización: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int dec;
        int factorial; 
        
        if (numero >= 0 && numero <= 10){
            
        if (numero == 0){
            System.out.println("El factorial de 0 es = 1");
        } else {
            dec = 1;
            factorial = numero; 
            while (dec < numero){
                
                factorial *= (numero - dec);
            dec++;
                
            }
            System.out.println("El factorial de " + numero + " es = " + factorial);
        }
            
        }else{
            System.out.println("El número ingresado no entra en el rango solicitado.");
        }
        sc.close();
	}

}
