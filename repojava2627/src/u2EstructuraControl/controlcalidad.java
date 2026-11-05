package u2EstructuraControl;
import java.util.Scanner;
import java.util.InputMismatchException;

public class controlcalidad {
    
    // 1. AQUí CREAS TU MÉTODO PERSONALIZADO (devuelve double, recibe dos int)
    public static double calcularDefecto(int totalLotes, int lotesConFalla) {
        if (totalLotes == 0) {
            throw new ArithmeticException("El total de lotes no puede ser cero.");
        }
        return ((double) lotesConFalla / totalLotes) * 100;
    }

    // 2. AQUÍ VA EL MAIN OFICIAL (el que arranca el programa, siempre void y String[] args)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Introduce el total de lotes: ");
            int total = sc.nextInt();
            
            System.out.print("Introduce los lotes con falla: ");
            int fallas = sc.nextInt();
            
            // Aquí llamas a tu método dentro del try
            double resultado = calcularDefecto(total, fallas);
            System.out.println("El porcentaje de defecto es: " + resultado + "%");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } finally {
            System.out.println("Finalizando proceso...");
            sc.close();
        }
    }
}
		
	}

}
