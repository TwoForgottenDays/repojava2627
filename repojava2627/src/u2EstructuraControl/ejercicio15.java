package u2EstructuraControl;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ejercicio15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Introduce un numero : ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce un numero : ");
		int num2 = sc.nextInt();
		
		System.out.println(" Resultado division: " + num1/num2);
		System.out.println("Numero leido: "+num1);
		
		} catch (InputMismatchException ime) {
			System.err.println("Error al leer el numero debe ser un entero");
			//ime.printStackTrace();
		}
		
		catch (ArithmeticException ime) {
			System.err.println("Error al leer el numero debe ser un entero");
			//ime.printStackTrace();
		}
		
		catch (Exception ex) {
			System.err.println("error general");
			ex.addSuppressedprint (StackTrace);
		}
		finally {
			//codigo que se ejecuta siempre, falle o no falle 
			System.out.print("este codigo es meh : ");
			sc.close();
		}
	}

}
