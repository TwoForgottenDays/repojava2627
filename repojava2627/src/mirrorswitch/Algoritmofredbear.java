package mirrorswitch;


import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Algoritmofredbear {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Random dado = new Random ();
        
        int nivelFredbear = 14;  // Nivel de agresividad de Fredbear
        int nivelNightmare = 16; // Nivel de agresividad de Nightmare
        
        
        boolean fredbear = false;
        boolean nightmare = false;
        int opcion_usuario = 0;
        
        System.out.println("Modo crazy divine eternal activado (Fredbear + Nightmare)");
        
        do {
            // Intervalo de tiempo en el que el usuario interactúa en la consola
            try {
                // Estrictamente obligatorio poner try-catch en el sleep pq ahí se interrumpe el tiempo
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                System.out.println("El tiempo fue interrumpido tu tranqui");
            }
            
            // Si quiero que vaya del 1 al 20 tengo q añadir +1 (Tiradas independientes)
            int tiradaFredbear = dado.nextInt(20) + 1;
            fredbear = (tiradaFredbear <= nivelFredbear);
            
            int tiradaNightmare = dado.nextInt(20) + 1;
            nightmare = (tiradaNightmare <= nivelNightmare);
            
            // Mensajes según quién ataque
            if (fredbear && nightmare) {
                System.out.println("\n ¡ALERTA DOBLE! Escuchas respiración insana de Fredbear en la puerta Y pasos pesados de Nightmare en el armario");
            } else if (fredbear) {
                System.out.println("\n A ver escuchas respiración insana de Fredbear en la puerta");
            } else if (nightmare) {
                System.out.println("\n ¡Ey! Nightmare frenó en el armario, se siente la tensión");
            } else {
                System.out.println("\n no pasa nada orita, silencio en la casa");
            }
            
            System.out.println("¿Qué vas a hacer voce?");
            System.out.println("1: Defender puerta (Fredbear) | 2: Alumbrar armario (Nightmare) | 3: Esperarte tantito | 4: Salir del jogo por miedoso | 5: ¡CERRAR TODO DE GOLPE (Defensa total contra ambos) (eso si es trampa claraamente!");
            
            try  {
                opcion_usuario = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" A ver te dije un número válido asi q sea seri@");
                sc.next();
                continue; // Salta al siguiente ciclo para evitar bucles raros si ponen letras
            }
            
            // Evaluación de condiciones con ambos animatrónicos
            if (fredbear && nightmare && opcion_usuario == 1) {
                System.out.println(" ¡Defendiste a Fredbear pero Nightmare te cazó en el armario! Jumpscare bien exótico, perdiste.");
                opcion_usuario = 4; // Termina el juego
            }
            else if (fredbear && nightmare && opcion_usuario == 2) {
                System.out.println(" ¡Espantaste a Nightmare pero Fredbear entró a la puerta! Jumpscare, perdiste.");
                opcion_usuario = 4;
            }
            else if (fredbear == true && opcion_usuario == 1) {
                System.out.println(" Ey ey ey Fredbear estaba ahi respirandote y todo god se fue");
            }
            else if (nightmare == true && opcion_usuario == 2) {
                System.out.println(" ¡Le diste con la linterna al armario! Nightmare retrocedió god.");
            }
            else if ((fredbear || nightmare) && opcion_usuario == 3) {
                System.out.println(" ey ey oe oe oe lo tenes ahí y esperaste tantito, ya perdiste y un jumpscare bien exotico");
                opcion_usuario = 4;
            }else if (fredbear && nightmare && opcion_usuario == 5) {
                    System.out.println("¡TE LUCISTE!(eso es trampa) Cerraste la puerta de golpe y alumbraste el armario al mismo tiempo con una velocidad insana. Los dos se fueron.");
                
            } 
            else if (opcion_usuario == 4) {
                System.out.println(" Cobarde pero con vida. Saliendo del jogo...");
            }
            else {
                System.out.println(" Hmm ta weno no anda por ahi ");
            }
            
        } while(opcion_usuario != 4);
        
        System.out.println(" Se acabó el jogo");
        sc.close();        
    }
}