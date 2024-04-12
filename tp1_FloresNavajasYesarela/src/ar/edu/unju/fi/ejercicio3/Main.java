package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            numero *= 3; 
        } else {
            numero *= 2;
        }
        
        System.out.println(numero);
        sc.close();
	}

}
