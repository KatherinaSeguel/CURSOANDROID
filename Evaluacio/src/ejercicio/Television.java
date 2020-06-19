package ejercicio;

public class Television extends Electrodomesticos {
	
	private double resolusion;
	private Boolean sintonizador;
	
	
	//COSTRUCTOR
	
	public Television() {
		
	}
	public Television(double resolusion, Boolean sintonizador) {
		this.resolusion = 20;
		this.sintonizador = false;
	}

	
	public Television(double preciobase, double peso) {
		super(preciobase, peso);
		// TODO Auto-generated constructor stub
		this.resolusion = 20;
		this.sintonizador = false;
	}


	public Television(double preciobase, String color, char consener, double peso) {
		super(preciobase, color, consener, peso);
		// TODO Auto-generated constructor stub
		this.resolusion = 20;
		this.sintonizador = false;
	}
	
	//METODOS
	public double getResolusion() {
		return resolusion;
	}
	public Boolean getSintonizador() {
		return sintonizador;
	}
	

		public double precioFinal(){
			//Afectan la resolución y el sintonizador en el precio final
	        double aumen=super.precioFinal();
	  
	        //Añadimos el codigo necesario
	        if (resolusion>40){
	            aumen+=preciobase*0.3;
	        }
	        if (sintonizador){
	            aumen+=50;
	        }
	  
	        return aumen;
	    }
	

}
