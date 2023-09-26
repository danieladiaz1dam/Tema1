package ejer4;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		// variables para guardar las notas para hacer media
		//primera nota
		float nota1;
		//segunda nota
		float nota2;
		
		// Ask for user info
		System.out.print("Introduce la primera nota: ");
		// guardar la primera nota
		nota1 = sc.nextFloat();
		
		// Ask for user info
		System.out.print("Introduce la segunda nota: ");
		// guardar la segunda nota
		nota2 = sc.nextFloat();
				
		// Print info
		// hacer la medai de las notas e imprimirla
		System.out.println("Tienes un " + ((nota1+nota2)/2) + " de media");
		
		// Close scanner
		sc.close();
	}
}
