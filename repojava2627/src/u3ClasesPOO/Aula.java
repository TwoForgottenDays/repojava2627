package u3ClasesPOO;

public class Aula {
	private int numAula;
	private String grupo;
	private double largo;
	private double ancho;
	public Aula(int numAula, String grupo, double largo, double ancho) {
		super();
		this.numAula = numAula;
		this.grupo = grupo;
		this.largo = largo;
		this.ancho = ancho;
	}
	public int getNumAula() {
		return numAula;
	}
	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	@Override
	public String toString() {
		return "Aula [numAula=" + numAula + ", grupo=" + grupo + ", largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	public void cambiarGrupo(String paramNuevoGrupo) {
		this.grupo = paramNuevoGrupo;
		
	}

}
