package ejercicio;


public class Lavadora extends Electrodomesticos {
	private double carga;
	
	
//	CONSTRUCTORES
 //Constructor por defecto
	public Lavadora() {
	 
 }


	public Lavadora(double preciobase, double peso) {
		super(preciobase, peso);
		// TODO Auto-generated constructor stub
	}



	public Lavadora(double preciobase, String color, char consener, double peso) {
		super(preciobase, color, consener, peso);
		// TODO Auto-generated constructor stub
		this.carga=5;
	}

	//METODOS

	public double getCarga() {
		return carga;
	}


		public double precioFinal() {
	        //Se llama m�todo precioFinal la clase padre
	        double aumen=super.precioFinal();
	  
	        //a�adimos el c�digo necesario
	        if (carga>30){
	            aumen+=50;
	        }
	  
	        return aumen;
	    }
 
}
