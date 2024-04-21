package ar.edu.unju.fi.ejercicio10.model;


public class Pizza {
	//atributos de la clase pizza
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	private static final int ingEsp20 = 500;
	private static final int ingEsp30 = 750;
	private static final int ingEsp40 = 1000;
	
	//constructor por defecto
	public Pizza() {
		
	}
	
	//método para calcular el valor del precio de la pizza
	public double calcularPrec(int diametro, boolean ingredientesEspeciales) {
		switch(diametro) {
		case 20:
			precio = 4500;
			if (ingredientesEspeciales == false) {
				return precio;
			} else {
				return precio += ingEsp20;
			} 
		case 30:
			precio = 4800;
			if (ingredientesEspeciales == false) {
				return precio;
			} else {
				return precio += ingEsp30;
			}
		case 40:
			precio = 5500;
			if (ingredientesEspeciales == false) {
				return precio;
			} else {
				return precio += ingEsp40;
			}
		}
		
		return precio;
	}
	
	//método para calcular el precio
	public double calcularPrecio (int diametro, boolean ingredientesEspeciales) {
		if(diametro == 20) {
			precio = 4500;
			if (ingredientesEspeciales == true) {
				return precio += ingEsp20;
			} else {
				return precio;
			}
		}
		
		if (diametro == 30) {
			precio = 4800;
			if (ingredientesEspeciales == true) {
				return precio += ingEsp30;
			} else {
				return precio;
			}
		}
		
		if (diametro == 40) {
			precio = 5500;
			if (ingredientesEspeciales == true) {
				return precio += ingEsp40;
			} else {
				return precio;
			}
		}
		return precio;
	}
	
	//método si quiere o no ingredientes especiales
	public boolean quiereIngredientesEsp (int variable) {
		if (variable == 1) {
			return ingredientesEspeciales = true;
		} else {
			if (variable == 0) {
				return ingredientesEspeciales = false;
			} else {
				System.out.println("Variable incorrecta");
			}
		}
		
		return ingredientesEspeciales;
	}
	
	
	//método para calcular el área
	public double calcularArea(int diametro) {
		return Math.PI * diametro;
	}
	
	
	//mostrar datos de pizza
	public void mostrarDatos() {
		
		System.out.println("**Pizza 1**");
		System.out.println("Diámetro = " + diametro);
		System.out.println("Ingredientes Especiales = " + ingredientesEspeciales);
		System.out.println("Precio Pizza = " + calcularPrec(diametro, ingredientesEspeciales) + "$");
		System.out.println("Área de la pizza = " + calcularArea(diametro));
		
		}
	
	//getters and setters de los atributos
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public static int getIngEsp20() {
		return ingEsp20;
	}
	
	public static int getIngEsp30() {
		return ingEsp30;
	}
	
	public static int getIngEsp40() {
		return ingEsp40;
	}
		
}
