package u2EstructuraControl;
import java.util.Scanner;
import java.util.Random;

public class linterna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random dado = new Random();

        int bateria = 100;
        int turno = 1;
        boolean juegoActivo = true;

        System.out.println("=== NOCHE EN EL PASILLO DE NIGHTMARE BONNIE ===");

        while (turno <= 5 && juegoActivo) {
            System.out.println("\n--- Turno " + turno + " de 5 | Batería: " + bateria + "% ---");
            
            // Posición de Bonnie
            int posicionBonnie = dado.nextInt(3) + 1; // 1, 2 o 3

            System.out.println("¿Qué quieres hacer?");
            System.out.println("1: Alumbrar pasillo | 2: Cerrar/Escuchar puerta | 3: Mirar la cama");
            
            int opcion = sc.nextInt();

            // TODO: Aplica un SWITCH con la opción elegida
            switch (opcion) {
                case 1:
                    // Restar batería
                    // Evaluar con IF la posicionBonnie
                    break;
                case 2:
                    // Lógica para defender la puerta
                    break;
                case 3:
                    // Lógica para revisar la cama
                    break;
                default:
                    System.out.println("Opción inválida, perdiste tiempo.");
                    break;
            }

            // Comprobar si la batería se agotó
            if (bateria <= 0) {
                System.out.println("¡Te quedaste sin batería en la linterna! Quedaste a oscuras...");
                juegoActivo = false;
            }

            turno++;
        }

        if (juegoActivo) {
            System.out.println("\n¡Suena el reloj! 6:00 AM. Sobreviviste a la ronda.");
        }

        sc.close();
    }
}