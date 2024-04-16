package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado = crearEmpleado();
		empleado.datosEmpleado();
		System.out.println("Aumento de salario");
		empleado.aumentoSalario();
		empleado.datosEmpleado();
	}
	
	public static Empleado crearEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los datos del empleado");
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el legajo (sin puntos, ni letras): ");
		int legajo = sc.nextInt();
		System.out.println("Ingrese el salario (números decimales con coma): ");
		System.out.println("$ ");
		double salario = sc.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		sc.close();
		return empleado;
	}

}
