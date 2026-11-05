package u2EstructuraControl;

import java.util.Scanner;

public class Ejercicio01Par {
	
	public static void main(String[]args) {
		// uso de if
		//programa que puide un numero al usuario y muestra por pantalla si es par o impar
		Scanner sc = new Scanner(System.in);
		int num; //Numero  introduccion por  por el usuario
		System.out.print("Introduzca un numero: ");
		
		num = sc. nextInt();
		if (num % 2 == 0) { //entonces el numero es par
			System.out.println(" El numero "+num+ " es par. ");
		} else {
			System.out.println(" El numero "+num+" es impar)");
		}
		sc.close();
	}
	

}
