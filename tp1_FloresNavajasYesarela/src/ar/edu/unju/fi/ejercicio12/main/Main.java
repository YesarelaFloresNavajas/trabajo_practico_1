package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = datosPersona();
		persona.mostrarDatos();

	}
	
	public static Persona datosPersona() {
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingresar datos");
		System.out.println("Nombre/s: ");
		persona.setNombre(sc.nextLine());
		
		System.out.println("Ingrese fecha de nacimiento ");
		System.out.println("Ingrese año (yyyy): ");
		int anio = sc.nextInt();
		System.out.println("Ingrese mes (mm): ");
		int mes = sc.nextInt();
		System.out.println("Ingrese día (dd): ");
		int dia = sc.nextInt();
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(anio, mes - 1, dia);
		persona.setFechaNac(fechaNac);
				
		sc.close();
		return persona;
	}

}