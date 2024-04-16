package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calculadoraEsp = new CalculadoraEspecial();
		System.out.println("Ingresar un número entero: ");
		int k = sc.nextInt();
		
		System.out.println("Sumatoria = " + calculadoraEsp.calcularSumatoria(k));
		System.out.println("Productoria = " + calculadoraEsp.calcularProductoria(k));
		sc.close();
	}

}
