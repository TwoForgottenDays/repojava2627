package u2EstructuraControl;
import java.util.Scanner;
public class ejercicio06 {
	public static void main(String[] args) {
	
	//programa que pide un numero que pide un numero del 1 al 7 y dice el dia
	Scanner sc = new Scanner(System.in );
	int dia;
	System.out.println("Que numerito de la semana es");
	dia=sc. nextInt();
	
	switch (dia) {
	
	case 1:
		System.out.println("es lunes");
		break;
		
	case 2:
		System.out.println(" es martes");
		break;
		
	case 3:
		System.out.println(" es miercoles");
		break;
	case 4:
		
		System.out.println(" es jueves");
		break;
		
	case 5:
		System.out.println(" es viernes");
		break;
		
	case 6:
		System.out.println(" es sabado full farra");
		break;
		
	case 7:
		System.out.println(" es domingo");
		break;
	
	
	}
	
}		

}
