package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
//import java.time.Period;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	//constructores
	//constructor vacío
	public Persona() {

	}
	
	//constructor parametrizado
	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	//constructor personalizado
	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
		
	}
	//métodos calcular edad, verificar si es mayor, datos de persona más mensaje
	
	public int edadPersona() {
		return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
		
	}
	
	public boolean esMayorDeEdad() {
		return edadPersona() > 18;
	}
	

	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
		System.out.println("Edad: " + edadPersona());
		System.out.println("Provincia: " + provincia);
		if (esMayorDeEdad() == true) {
			System.out.println(nombre + " es mayor de edad."); 
		} else {
			System.out.println(nombre + " es menor de edad.");
		}
		
		
	}
	

	//método toString

	@Override
	public String toString() {
		return "DNI: " + dni + ", Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaDeNacimiento + ", Provincia: " + provincia;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
