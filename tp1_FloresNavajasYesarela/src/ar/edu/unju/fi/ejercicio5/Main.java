package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 9: ");
        int numero = sc.nextInt();
        int producto;
        if (numero >= 1 && numero<= 9) { 
            System.out.println("Tabla de multiplicación del número " + numero + ": ");
            for( int i = 0; i<=10; i++){
                producto = numero * i;
                System.out.println(numero + " x " + i + " = " + producto);
            }
            
            
        } else {
             System.out.println("El número ingresado no entra en el rango.");
        }
        sc.close();
	}

}
