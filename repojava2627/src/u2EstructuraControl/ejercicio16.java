package u2EstructuraControl;
import java.util.Scanner;
public class ejercicio16 {
	
	public static void main(String[] args) {
		
		//pedir un numero y que muestre el factorial
		Scanner sc = new Scanner(System.in);
		System.out.println(" Ingresa un numero");
		int numero = sc.nextInt();
		
		int resultado = 1;
		for (int i = 1; i >= resultado; i++) {
			
		
			resultado *= i;
			
		System.out.println("El exotico factorial de " + numero + "es" + resultado);
		 
		sc.close();
		}
		
	}

}
