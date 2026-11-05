package u2EstructuraControl;

import java.util.Scanner;

public class Ejercicio02 {
// escribir un programa que le diga al  usuario si los numeros son pares
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = 2;
		System.out.println("Introduce un numero");
		
		if (num % 2 == 0) {
			System.out.println(" Nanana si es par");
			
		} else {
			System.out.println(" vales madres es impar");
			
		}
		
		sc.close();
		
		
	}
	
}
