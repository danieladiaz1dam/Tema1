package ejer10;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		// Variables
		final int IVA = 21;
		float precio = 0;
		Scanner sc = new Scanner(System.in);
		
		// Ask for user info
		System.out.print("Cuál es el precio del producto?: ");
		precio = sc.nextFloat();
		
		// Print info
		System.out.println("El precio con IVA es de " + (precio + (precio*IVA/100)) + " euros.");
		
		// Close scanner
		sc.close();
	}
}
