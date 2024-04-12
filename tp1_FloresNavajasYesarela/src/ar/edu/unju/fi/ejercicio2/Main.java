package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrePais;
		int edadPersona;
		double alturaEdificio;
		double precioProductoSup;
		double coseno = 0.5;
		String numTelefono;
		
		nombrePais = "Argentina";
		System.out.println("Nombre del país: " + nombrePais);
        
        edadPersona = 26;
        System.out.println("Edad de la persona: " + edadPersona);
        
        
        alturaEdificio = 8.5;
        System.out.println("La altura del edificio es: " + alturaEdificio);
        
        precioProductoSup = 2535.6;
        System.out.println("El precio del producto del supermercado es: " + precioProductoSup);
        
        // numTelefono = "3884444444";
        // numTelefono = "+543884444444";
        numTelefono = "+5493884444444";
        System.out.println("Número de teléfono: " + numTelefono);
        
        Math.cos(coseno);
        System.out.println("El coseno de 0.5 es = " + coseno);
		
	}

}
