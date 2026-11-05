package u3ClasesPOO;

public class clasecocheTest {
	public static void main(String  [] args){
		//voy a crear 1 coche mio
		ClaseCoche  cocheJossu = new ClaseCoche("negro", 80, 12.8);
		System.out.println("De que color es el coche" + cocheJossu.getsColor());
		System.out.println("a que velocidad va?" + cocheJossu.getiVelocidad());
		System.out.println(" y que tamaño? " +cocheJossu.getdTamanyo());
		
		
		;
	}
}
