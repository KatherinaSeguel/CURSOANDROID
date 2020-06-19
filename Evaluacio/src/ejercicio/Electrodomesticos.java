package ejercicio;

public class Electrodomesticos {
	protected double preciobase;
	private String color;
	private char consener;
	private double peso;

	// SE CREAN LOS CONSTRUCTORES

	// Por Defecto
	public Electrodomesticos() {
	}

	// Sólo con precio y peso

	public Electrodomesticos(double preciobase, double peso) {
		this.preciobase = preciobase;
		this.peso = peso;
		this.color = "blanco";
		this.consener = 'F';
	}

	public Electrodomesticos(double preciobase, String color, char consener, double peso) {
		this.preciobase = 100000;
		comprobarColor(color);
		comprobarConsumoEnergetico(consener);
		this.peso = 5;
	}

	// Métodos
	// Método Get de todos los atributos

	public double getPreciobase() {
		return preciobase;
	}

	public String getColor() {
		return color;
	}

	public char getConsener() {

		return consener;
	}

	public double getPeso() {
		return peso;
	}

		
	public void comprobarConsumoEnergetico(char consener) {

		if (consener == 'F' || consener == 'A') {
			this.consener = consener;
		} else {
			this.consener = 'F';
		}

	}

	public void comprobarColor(String color) {
		String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean igual = false;

		for (int i = 0; i < colores.length && !igual; i++) {

			if (colores[i].equals(color)) {
				igual = true;
			}

		}

		if (igual) {
			this.color = color;
		} else {
			this.color = "blanco";
		}

	}
	
//Según consumo energetico y peso  aumenta el precio

		public double precioFinal() {
	        double aumen=0;
	        switch(consener){
	            case 'A':
	            	aumen+=100;
	                break;
	            case 'B':
	            	aumen+=80;
	                break;
	            case 'C':
	            	aumen+=60;
	                break;
	            case 'D':
	            	aumen+=50;
	                break;
	            case 'E':
	            	aumen+=30;
	                break;
	            case 'F':
	            	aumen+=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19){
	        	aumen+=10;
	        }else if(peso>=20 && peso<49){
	        	aumen+=50;
	        }else if(peso>=50 && peso<=79){
	        	aumen+=80;
	        }else if(peso>=80){
	        	aumen+=100;
	        }
	       aumen+=preciobase+aumen;
	        return aumen;
	    }

}
