package u2EstructuraControl;
import java.util.Scanner;
public class Ejercicio04ordenar {
	
	//pide 3 numeros y los muestra ordenados de forma mayor a menos usando if else if
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int num;
		int n2;
		System.out.print(" Introduce un numero");
		
		num = sc. nextInt();
		n1 = sc. nextInt();
		n2 = sc. nextInt();
		if (n1 < n2 && n2 < n1 && n2 != n1 && n2 < num  && num > n1 && n2 > num && num == n2) {
			
			System.out.println("el numero"+num+"mayor");
			System.out.println("el siguiente numero" +n1);
			System.out.println("n2"+num+"sigue");
			
		}
		sc.close();
		
		
		
	}
	

}
