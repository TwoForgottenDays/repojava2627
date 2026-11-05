package u2EstructuraControl;

public class ejercicio13cadenas {
	
	public static void main(String[] args ) {
		//ejemplos con cadenas
		String str1 = "name";
		String str2 = "name";
		String str3 = new String ("name");
		String str4 = "Name";
		System.out.println(str1.equals(str2) ); //true
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str3) );
		System.out.println(str3 == str1 );
		System.out.println(str4 == str1);
		System.out.println(str1.equals(str3) );
		System.out.println(str1.equalsIgnoreCase(str4) );
		
	}

}
