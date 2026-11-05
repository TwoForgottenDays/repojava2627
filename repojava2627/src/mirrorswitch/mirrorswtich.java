package mirrorswitch;

import java.util.Scanner;
public class mirrorswtich {
	public static void main(String [] args) {
		System.out.println("Ingrese un numerito del 1 al 7");
		Scanner sc = new Scanner(System.in);
		
		int num = sc. nextInt();
		
		switch (num) {
		case 1:
			System.out.println("es lunes de chamba");
			
			break;
			
		case 2:
			System.out.println("es martes de chamba");
			
		break;
		
		case 3:
			
			System.out.println("es miercoles de chamba");
			
		break;
		
		case 4:
			
			System.out.println("es jueves de chamba");
			
		break;
			
		case 5:
			
			System.out.println("es viernes de farra");
			
		break;
		
		case 6:
			
			System.out.println("es Sabado de  farra");
			
		break;
		
		case 7:
			
			System.out.println("es Domingo de descanso");
			
		break;
		
		default:
			
			System.out.println("Sea serio es del 1 al 7");
			
		break;
		}
		
		System.out.println(" un operador ( +, -,*, /):");
		char operation = sc. next(). charAt(0);
		System.out.println("Ingresa el numerito");
		
		 double otro_num = sc. nextDouble();
		
		System.out.println(" otro numerito");
		double num2 = sc.nextDouble();
		
		switch (operation) {
		
		case '-':
			System.out.println("El resultado es" + (otro_num - num2));
		break;
		
		case '+':
			System.out.println("El otro resultado es " + (otro_num + num2));
		break;
		
		case '*':
			
			System.out.println("El otro resul es " + (otro_num * num2));
			
		break;
		
		case '/':
		
		if (num2 == 0) {
			System.out.println("Ah conque gil");
		}
		else {
			System.out.println("El meh es" + (otro_num / num2));
		}
		
		break;
		
			
		
		
		
		
			
			
			
		}
	}

	
	
	
}



