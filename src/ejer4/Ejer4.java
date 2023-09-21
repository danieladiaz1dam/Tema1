package ejer4;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		float nota1, nota2;
		
		// Ask for user info
		System.out.print("Introduce la primera nota: ");
		nota1 = sc.nextFloat();
		
		// Ask for user info
		System.out.print("Introduce la segunda nota: ");
		nota2 = sc.nextFloat();
				
		// Print info
		System.out.println("Tienes un " + ((nota1+nota2)/2) + " de media");
		
		// Close scanner
		sc.close();
	}
}
