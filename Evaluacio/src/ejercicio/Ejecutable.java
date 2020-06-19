package ejercicio;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea el array de 10 posiciones

		Electrodomesticos ArrayElectro[] = new Electrodomesticos[10];

		// Asignacion de objetos
		/////
				
		
		ArrayElectro[0] = new Television(100, "negro", 'A', 50);

		ArrayElectro[1] = new Lavadora(80, "azul", 'B', 80);
			
		ArrayElectro[2] = new Electrodomesticos(10, "negro", 'F', 30);
	
		ArrayElectro[3] = new Lavadora(10, "blanco", 'F', 60);
	
		ArrayElectro[4] =new Television(100, "gris", 'A', 50);

		ArrayElectro[5] =new Electrodomesticos(100, "gris", 'A', 70);

		ArrayElectro[6] = new Television(50, "negro", 'D', 20);

		ArrayElectro[7] = new Lavadora(10, "blanco", 'A', 60);

		ArrayElectro[8] = new Television(10, "negro", 'A', 50);

		ArrayElectro[9] = new Electrodomesticos(10, "azul", 'A', 80);

		

//******
		//Creamos las variables que usaremos para almacenar la suma de los precios
        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        double totalLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<ArrayElectro.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(ArrayElectro[i] instanceof Electrodomesticos){
                totalElectrodomesticos+=ArrayElectro[i].precioFinal();
            }
            if(ArrayElectro[i] instanceof Lavadora){
                totalLavadoras+=ArrayElectro[i].precioFinal();
            }
            if(ArrayElectro[i] instanceof Television){
                totalTelevisiones+=ArrayElectro[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("Detalle de los electrodomésticos es:   "+totalElectrodomesticos);
        System.out.println("Detalle de las lavadoras es:   "+totalLavadoras);
        System.out.println("Detallede los televisores es:  "+totalTelevisiones);
        System.out.println("Sumatoria total:  "+(totalTelevisiones+totalElectrodomesticos+totalLavadoras));
    }
 	
}
