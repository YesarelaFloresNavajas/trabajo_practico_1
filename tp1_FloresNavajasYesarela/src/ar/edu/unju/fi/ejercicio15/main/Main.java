package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número del 5 al 10: ");
		int valor = sc.nextInt();
		if (valor >= 5 && valor <= 10) {
			String[] nombres = new String[valor];
			sc.nextLine();
			//solicitar ingresar los nombres para el array
			System.out.println("Ingresar " + valor + " nombre/s: ");
			for (int i = 0; i < nombres.length; i++) {	
				nombres[i] = sc.nextLine();
		    }

			
			System.out.println();
			
	        imprimirArray(nombres);
	        imprimirArrayInvertido(nombres);
		} else {
			System.out.println("Número incorrecto");
		}
		sc.close();
	}
	
	public static void imprimirArray(String[] nombres) {
		int j = 0;
		while (j < nombres.length) {
			System.out.println("[" + j + "] = "+ nombres[j]);
			j++;
		}
		System.out.println();
	}
	
	public static void imprimirArrayInvertido(String[] nombres) {

		for (int j = nombres.length - 1; j >= 0; j--) {	
			System.out.println("[" + j + "] = "+ nombres[j]);
	    }
		System.out.println();
	}
}
