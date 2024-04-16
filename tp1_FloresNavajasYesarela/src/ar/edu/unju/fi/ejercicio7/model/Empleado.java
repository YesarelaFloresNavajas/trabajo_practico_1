package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	private final double SALARIO_MINIMO = 210000.00;
	private final double AUMENTO_POR_MERITO = 20000.00;
	
	//CONSTRUCTOR PARAMETRIZADO
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if (salario >= SALARIO_MINIMO) {
			salario = (double) salario;
		} else {
			salario = SALARIO_MINIMO;
		}
			
	}
	
	//MÉTODOS
	//DATOS EMPLEADO
	public void datosEmpleado() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario $: " + salario);
	}
	//AUMENTO SALARIO EMPLEADO
	public void aumentoSalario() {
		salario += AUMENTO_POR_MERITO;
	}
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public double getAUMENTO_POR_MERITO() {
		return AUMENTO_POR_MERITO;
	}
	
}
