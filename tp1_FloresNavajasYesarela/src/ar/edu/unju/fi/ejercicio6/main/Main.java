
package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // con constructor por defecto
        Persona persona1 = generarPersona(sc);
        persona1.mostrarDatos();

        // con constructor parametrizado
        // dni, nombre, fechaDeNacimiento, provincia

        System.out.println("Ingrese DNI (sin puntos, ni espacios):");
        int dni = sc.nextInt();
        //sc.nextLine(); // limpiar buffer
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
       /* System.out.println("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fechaDeNacimiento = LocalDate.parse(sc.nextLine());*/
		System.out.println("Ingrese fecha de nacimiento ");
		System.out.println("Ingrese año (yyyy): ");
		int anio = sc.nextInt();
		System.out.println("Ingrese mes (mm): ");
		int mes = sc.nextInt();
		System.out.println("Ingrese día (dd): ");
		int dia = sc.nextInt();
		LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese provincia: ");
        String provincia = sc.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaDeNacimiento, provincia);
        persona2.mostrarDatos();

        // con constructor con parámetros dni, nombre, fecha de nacimiento
        System.out.println("Ingrese DNI (sin puntos, ni espacios):");
        dni = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        /*System.out.println("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        fechaDeNacimiento = LocalDate.parse(sc.nextLine());*/
		System.out.println("Ingrese fecha de nacimiento ");
		System.out.println("Ingrese año (yyyy): ");
		anio = sc.nextInt();
		System.out.println("Ingrese mes (mm): ");
		mes = sc.nextInt();
		System.out.println("Ingrese día (dd): ");
		dia = sc.nextInt();
		fechaDeNacimiento = LocalDate.of(anio, mes, dia);
        Persona persona3 = new Persona(dni, nombre, fechaDeNacimiento);
        persona3.mostrarDatos();

        sc.close();
    }

    public static Persona generarPersona(Scanner sc) {
        Persona persona = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona.setNombre(sc.nextLine());
        System.out.println("Ingrese DNI (sin puntos, ni espacios):");
        persona.setDni(sc.nextInt());
        sc.nextLine(); // limpiar buffer
        System.out.println("Ingrese provincia: ");
        persona.setProvincia(sc.nextLine());
        /*System.out.println("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fechaDeNacimiento = LocalDate.parse(sc.nextLine());*/
		System.out.println("Ingrese fecha de nacimiento ");
		System.out.println("Ingrese año (yyyy): ");
		int anio = sc.nextInt();
		System.out.println("Ingrese mes (mm): ");
		int mes = sc.nextInt();
		System.out.println("Ingrese día (dd): ");
		int dia = sc.nextInt();
		LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);
        persona.setFechaDeNacimiento(fechaDeNacimiento);

        return persona;
    }
}