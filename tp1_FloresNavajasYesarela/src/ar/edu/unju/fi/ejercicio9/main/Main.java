package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Producto nuevoProducto = crearProducto();
			nuevoProducto.mostrarDatos();
		}
	}

	public static Producto crearProducto() {
		Scanner sc = new Scanner(System.in);
		Producto nuevoProducto = new Producto();
		
		System.out.println("Datos del Nuevo Producto");
		System.out.println("Ingrese el nombre: ");
		nuevoProducto.setNombre(sc.nextLine());
		
		System.out.println("Ingrese el código: ");
		nuevoProducto.setCodigo(sc.nextLine());
		
		System.out.println("Ingrese el precio (decimales con coma): ");
		nuevoProducto.setPrecio(sc.nextDouble());
		
		System.out.println("Ingrese el descuento del producto (0 - 50): ");
		nuevoProducto.setDescuento(sc.nextInt());
		
		//sc.close();
		return nuevoProducto;
	}

}
