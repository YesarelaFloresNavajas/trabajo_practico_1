package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 8 números: ");
		int[] numeros = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
	    }
		sc.close();

        int j = 0;
        while (j < numeros.length) {
            //System.out.print(numeros[j] + ", ");
        	System.out.println("Valor en índice [" + j + "] = " + numeros[j]);
            j++;
        }
	}
}