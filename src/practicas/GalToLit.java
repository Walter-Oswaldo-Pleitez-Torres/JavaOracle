package practicas;

import java.util.Scanner;

public class GalToLit {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		double Galones=10;
		double Litros;
		
		System.out.println("Escriba la cantidad de Galones que quiere convertir en litros: ");
		Galones = input.nextDouble();
		
		Litros = Galones * 3.785;
		
		System.out.println("Galones: "+Galones+" - Litros: "+Litros);
		
		
	}
}
