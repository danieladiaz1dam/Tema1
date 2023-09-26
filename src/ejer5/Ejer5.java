package ejer5;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		// varaible para guardar el radio del circulo
		float radio;
		
		// Ask for user info
		System.out.print("Cual es el radio?: ");
		
		// guardar el input del usuario en la variable radio
		radio = sc.nextFloat();
				
		// Print info
		// imprimir y calcular la longitud del circulo
		System.out.println("La longitud del circulo es: " + (2*Math.PI*radio));
		// imprimir y calcular el area del circulo
		System.out.println("El area del circulo es: " + (Math.PI*radio*radio));
		
		// Close scanner
		sc.close();
	}
}
