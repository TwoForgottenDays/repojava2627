package mirrorswitch;


public class mirrowhile {
	public static void main(String [] args) {
	
	int energia = 1;
	System.out.println("Iniciando conteo:  ");
	
	while (energia <= 10)  {
		System.out.println("Conteo de arranque: " + energia);
		
		energia++;
		
		}
	while (energia >= 0) {
		
		System.out.println("continua retrocendiendo: " + energia);
		energia--;
	}
	System.out.println("Nice nos fuimo");
	}
}
