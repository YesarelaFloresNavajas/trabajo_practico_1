package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza pizza1 = pedirPizza();
		pizza1.mostrarDatos();

	}

	public static Pizza pedirPizza() {
		Scanner sc = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		System.out.println("Comenzar pedido");
		System.out.println("Diámetros: 20 (pizza pequeña), 30 (pizza mediana) y 40(pizza grande)");
		System.out.println("Ingrese el diámetro (número): ");
		pizza.setDiametro(sc.nextInt());
		
		
		System.out.println("Quiere ingredientes especiales? ");
		System.out.println("Escribir [1] si su respuesta es: Sí, de lo contrario escribir [0] ");
		pizza.quiereIngredientesEsp(sc.nextInt());
		
		sc.close();
		return pizza;
	}
	
}
