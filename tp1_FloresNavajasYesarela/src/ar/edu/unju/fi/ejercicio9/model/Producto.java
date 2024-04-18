package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	//constructor por defecto
	public Producto() {
		
	}

	//constructor parametrizado
	public Producto(String nombre, String codigo, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}


	//método para calcular el decuento
	public double calcularDescuento() {
		return this.precio -=  (this.precio * this.descuento / 100);
	}
	
	//método para mostrar datos de los productos
	public void mostrarDatos() {
		
		System.out.println("Datos del Producto");
		System.out.println("Nombre: " + nombre);
		System.out.println("Código: " + codigo);
		System.out.println("Precio : " + precio);
		System.out.println("Precio con descuento: " + calcularDescuento() + " %");
		
		}
		
		
	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}

