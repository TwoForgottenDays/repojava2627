package u3ClasesPOO;
/** Clase coche de la ut3
 * @author Jossu
 * @since quien sabe
 * 
 */

public class coche {
	/* atributos en min y privados */
	private String sColor;
	private int iVelocidad;
	private double dTamanyo;
	
	// contructor parra poder construir los objetos: publico
	public coche(String paramColorCoche, int paramVelCoche, double paramTamanyo) {
		this.sColor = paramColorCoche;
		this.iVelocidad = paramVelCoche;
		this.dTamanyo = paramTamanyo;
		
		
		
	}
	
	public void setColor(String elNuevoColorQueQuieroPoner) {
		this.sColor = elNuevoColorQueQuieroPoner;
		
	}
	public String getsColor() {
		return sColor;
	}
	public int iVelocidad() {
		return iVelocidad;
	}
	public double dTamanyo() {
		return dTamanyo;
	}
	// Alt + shift + S sirve para autocompletar los objetos

	@Override
	public String toString() {
		return "coche para ver los atributos [sColor=" + sColor + ", iVelocidad=" + iVelocidad + ", dTamanyo=" + dTamanyo + "]";
	}

	//metodos propios
	public void acelerar() {
		iVelocidad+=20;
		
		}
	public void pintar() {
		sColor="verde";
		}
	
	public void tunear(String paramNyuevoColor, double dNuevoTamanyo) {
		sColor = paramNuevoColor;
		dTamanyo = dNuevoTamanyo;
		{
	}
		()
	}
}

