package u2EstructuraControl;

import java.util.Scanner;
/* ´rograma que calcula el salario neto semanal de un trbajador en funcion de las horas trabajadas y sus impuestos 
*las primeras 35 horas tarifa normal
*mas de 35 horas a 1.5 la tarifa normal
*impuestos
*los primeros 500 euros libres de impuestos
*los siguientes 400 25% de impuestos
*los restantes un 45% de impuestos
*pide por pantalla
*!: horas trabajadas esta semana
*2: precio hora tarifa normal
*muestra por pantalla
*salario bruto, impuestos, salario neto-impuestos
*
* */
public class ejercicio07salario {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int salarioBruto = sc. nextInt();
	int horasTrabajadas =  sc. nextInt();
	int horasextra = (horasTrabajadas - 35);
	
	int horas = sc. nextInt();
	System.out.println("Cuanto has trabjado en esta semana guiño guiño");
	
	
	
	if (horas <= 35) {
		salarioBruto = horas * 10;
	} 
	
	
	
	sc.close();
	
			
	}

}
