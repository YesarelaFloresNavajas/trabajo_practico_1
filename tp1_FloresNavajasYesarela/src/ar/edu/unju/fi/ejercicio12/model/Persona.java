package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	String nombre;
	Calendar fechaNac;
	
	public Persona() {
		
	}
	

	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	//método para saber la edad de la persona
	public int edadPersona(Calendar fechaNac) {
		int edad;
		Calendar añoActual = Calendar.getInstance();
		int anio = fechaNac.get(Calendar.YEAR);
		añoActual.getTime();
		edad = añoActual.get(Calendar.YEAR) - anio;
		return edad;
	}
	
	
	//método para saber estación del año en que nació 
	public String estacionAnio(Calendar fechaNac) {
		//los meses en Calendar van de 0 a 11
		int mes = fechaNac.get(Calendar.MONTH) + 1;
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String estacion = null;
		if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 20)){
			estacion = "Otoño"; //Otoño (21 de marzo a 20 de junio).
		} else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) ||  (mes == 9 && dia <= 20)){
			estacion = "Invierno"; //Invierno (21 de junio a 20 de septiembre).
		} else if ((mes == 9 && dia >= 21) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 20)){
			estacion = "Primavera"; //Primavera (21 de septiembre a 20 de diciembre).
		} else if((mes == 12 && dia >= 21) || (mes == 1) || (mes == 2) || (mes == 3 && dia <= 20)) {
			estacion = "Verano"; //Verano (21 de diciembre a 20 de marzo). 
		} else {
			System.out.println("Fecha incorrecta");
		}
		return estacion;
	}
		
	//mostrar datos de persona
	public void mostrarDatos() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha nacimiento: " + date.format(this.fechaNac.getTime()));
		System.out.println("Edad: " + edadPersona(fechaNac) + " años");
		System.out.println("Estación: " + estacionAnio(fechaNac));
		
		}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
}
