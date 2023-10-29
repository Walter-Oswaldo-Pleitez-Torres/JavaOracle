package practicas;

public class Concatenacion {
	public static void main(String []args) {
		String s1 = "abc";
		String s2 = "cde";
		
		String s3 = "igualito";
		String s4 = "igualito";
		//String s5 = s3 == s4;
		System.out.println("Otra prueba: "+(s3 == s4));
		System.out.println("Otra prueba 2"+s3.equals(s4));
		System.out.println(System.identityHashCode(4));
		System.out.println(System.identityHashCode(3));
		System.out.println(s1.compareTo(s2)); 
		Boolean sTest2 = s3.equals(s4);
		System.out.println("Prueba: "+sTest2);
		System.out.println(s3 == s4);
		s3 = s3 + "otra cosa";
		System.out.println(s3 == s4);
		
		//System.out.println(s1.compareTo(s2));
		
		String ss1 = "abc";
		String ss2 = "ABC";
		//System.out.println(s1.equals(s2));
		
		/*String s1 = "This is a ";
		System.out.println(s1);
		String s2 = "string";
		System.out.println(s2);
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = "This is a "+ s2;
		System.out.println(s4);
		s1 += s2;
		System.out.println(s1);
		*/
		
		/*String cadena1 = "Hello";
		String cadena2 = "Lisa";
		String cadena3 = " ";
		
		cadena3 = "How are you ".concat(cadena2);
		System.out.println("Length: "+cadena1.length());
		
		System.out.println("Substring: "+ cadena3.substring(0,5));
		System.out.println("Upper: "+cadena3.toUpperCase());
		*/
		
		
		
		
	}

}
