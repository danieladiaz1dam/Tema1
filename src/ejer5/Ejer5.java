package ejer5;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		float radio;
		
		// Ask for user info
		System.out.print("Cual es el radio?: ");
		radio = sc.nextFloat();
				
		// Print info
		System.out.println("La longitud del circulo es: " + (2*Math.PI*radio));
		System.out.println("El area del circulo es: " + (Math.PI*radio*radio));
		
		// Close scanner
		sc.close();
	}
}
