package u2EstructuraControl;

import java.util.Scanner;

// cuantos kilos de comida tengo
// cuantos animales tengo
// y cuantos kilos come un animal


public class ejercicio08 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese la cantida de kilos pues");
	int kilitos;
	kilitos = sc. nextInt();
	
	System.out.println(" la cantidad de animales");
	int animales = sc. nextInt();
	
	System.out.println("ingrese cuantos kilos traga cada animal");
		
	int kilosAcomer = sc.nextInt();
	
	
	int kiloanimal = animales * kilosAcomer;
	
	
	
		if ( kilitos >= kiloanimal) {
			System.out.println("hay suficiente comida, nice.");
			
			
			
			 
		}else if (animales == 0) {
			
			System.out.println("no hay animales, sea serio");
		}
		else {
			double racionReducida = (double) kilitos / animales;
			System.out.println("No hay suficiente comida por ser mamañema. La nueva ración por animal es: " + racionReducida);
			
		}
		
		sc.close();
		
	}

}
