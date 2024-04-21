package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número del 3 al 10: ");
		int valor = sc.nextInt();
		int[] numeros = new int[valor];
		//solicitar ingresar los números para el array
		System.out.println("Ingresar " + valor + " números: ");
		for (int i = 0; i < numeros.length; i++) {	
			numeros[i] = sc.nextInt();
	    }

		sc.close();
		System.out.println();
		
		imprimirArray(numeros);
		sumaNumeros(numeros);
		/*
		//imprimir los valores del array
        int j = 0;
        while (j < numeros.length) {
            //System.out.print(numeros[j] + ", ");
        	System.out.println("Número en posición [" + j + "] = "+ numeros[j]);
            j++;
        }
        System.out.println();
        
        //sumatoria de los elementos del array
        int suma = 0;
        for (int k : numeros){
            suma += k;
        }
        System.out.println("Sumatoria de los números = " + suma);*/
	}
	
	public static void imprimirArray(int[] numeros) {
		int j = 0;
		while (j < numeros.length) {
			System.out.println("Número en posición [" + j + "] = "+ numeros[j]);
			j++;
		}
		System.out.println();
	}
	
	public static void sumaNumeros(int[] numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		System.out.println("Sumatoria de los números = " + suma);
	}
}
