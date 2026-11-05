package u2EstructuraControl;
import java.util.Scanner;
public class ejemplodDowhile {
	
	public static void main(String [] args) {
	// Pide un número y se repite si el usuario pone algo menor o igual a 0
	int numero
	do {
	    System.out.println("Ingresa un número mayor a 0:");
	    numero = sc.nextInt();
	} while (numero <= 0);
	sc.close();
}
