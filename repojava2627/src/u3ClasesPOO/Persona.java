package u3ClasesPOO;
import java.util.Scanner;

public class Persona {
	Scanner sc = new Scanner(System.in);
	//atributos privador
	
	private String nombre;
	private int edad;
	private double estatura;
	//1. genera el constructor
	public Persona(String paramnombre, int paramedad, double paramestatura) {
		this.nombre = paramnombre;
		this.edad = paramedad;
		this.estatura = paramestatura;
		}
	
	// genera los getter y setter 
	public void setNombre(String elNuevoNombreQueQuieroPoner) {
		this.nombre = elNuevoNombreQueQuieroPoner;
		
		
		
	}
	//3 Genera el toString()
	@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
}
		

/**
 * Metodo que dice hola nombre encantado de saludarte
 */
	public void saludar() {
		
		System.out.println("Hola mi" + nombre + "encantado de conocerte");
	}


	/*
		 * metodo que añade un año a la persona*/
	public void cumplirAnyos() {}
	
	//metodo crecer 
	public void crecer (double incrememnto) {}
	
}	
	
