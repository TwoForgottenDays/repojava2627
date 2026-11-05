package u2EstructuraControl;

public class Ejercicio09for {
    
    public static void main(String[] args) {
        // for sencillo del 1 al 10
        System.out.print("cuenta ascendente: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        
        System.out.print("\ncuenta descendente: ");
        for (int i = 1; i > 0; i--) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nnumeros impares: ");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nnumeros del 1 al 100 (Suma): ");
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma += i;
        }
        System.out.println(suma); // Mostramos el resultado de la suma
     // Matriz  3x3
        System.out.println("Matriz:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* "); // Imprime el asterisco y un espacio
            }
            System.out.println(); // Da un salto de línea cuando termina cada fila
        }
        
    }
        
 // <--- Aquí se cierra correctamente todo el main

    // Cambiado a static para que el main pueda llamarlo sin problemas
    private static void pintarTriangulo() {
        // TODO Auto-generated method stub
    	
    	//otro
    	for (int i = 0, j = 0; i <5 && j  <5 ; i++, j++ {
    		System.out.print(i+ " "+j+ " ");
    		
    	}
    }
}


