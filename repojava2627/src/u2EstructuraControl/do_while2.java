package u2EstructuraControl;
import java.util.Scanner;

public class do_while2 {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        int option;
        double saldo = 1000.0; // Saldo inicial del cajero
        
        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar la money");
            System.out.println("3. Sacar la money");
            System.out.println("4. Salir");
            System.out.print("¿Qué queres hacer? ");
            
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Tu saldo actual es de: " + saldo + " euros.");
                    break;
                case 2:
                    System.out.print("¿Cuánto vas a depositar? ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("¡Listo! Nuevo saldo: " + saldo + " euros.");
                    break;
                case 3:
                    System.out.print("¿Cuánto vas a retirar? ");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("¡Sea serio! No tienes tanto dinero.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Te quedan: " + saldo + " euros.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programita, no vuelva pofa");
                    break;
                default:
                    System.out.println("¡Sea serio! Opción no válida.");
            }
            
        } while (option != 4); // Ahora sí, se repite mientras NO elija salir (4)
        
        sc.close();
    }
}