//mostrar 
package u2EstructuraControl;


import java.util.Scanner;
/**
 * función para comprobar si es primo
 * @param numero int con el numero  a validar
 * @return boolean con el resultador
 * @author Quien sabe
 * @since 22/10/2028	
 */
public class Ejerciciofnción {

	private static boolean comprobarPrimo(int numero) {
		Scanner sc = new Scanner(System.in);
		int contador = 2;
		boolean  esPrimo = true;
		double raizNum = Math.sqrt(numero) ;
		while (contador < raizNum && esPrimo) {
			System.out.println("El resto de dividir " +numero+ " y "+contador+ " es " +numero%contador);
		
			if (numero%contador == 0) {
				esPrimo=false;
		}
			contador++;
			
		}
		
		return esPrimo;
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" introduce el numero:");
		int iNum = sc.nextInt();
		boolean bNumPrimo =  comprobarPrimo(iNum);
		if (bNumPrimo)
			System.out.println("El numero "+iNum+" Si es primo");
		else
			System.out.println("El numero "+iNum+" Si es primo (o no) ");
		comprobarPrimo(iNum);
		
		sc.close();
	}

}
