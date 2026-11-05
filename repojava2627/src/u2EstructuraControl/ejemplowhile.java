package u2EstructuraControl;

public class ejemplowhile {
	public static void main(String [] args) {
	// Cuenta regresiva mientras el contador sea mayor a 0
	int contador = 3;
	while (contador  >0) {
	    System.out.println("Faltan: " + contador);
	    contador--; // Resta 1 en cada vuelta
	}

}
