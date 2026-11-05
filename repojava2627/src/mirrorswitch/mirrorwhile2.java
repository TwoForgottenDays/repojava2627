package mirrorswitch;


public class mirrorwhile2 {
	public static void main(String []args) {
		int bateria = 100;
		
		System.out.println(" Empezando jogo con los compas");
		
		while (bateria > 0) {
			
			System.out.println("bateria bajando por jogo intenso, bateria :" + bateria +  "%");
			bateria -= 20;
			
		}
				System.out.println(" Bateria baja, todo valió madres");
		
	}

}

