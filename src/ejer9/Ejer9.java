package ejer9;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);
		// float para guardar la cantidad de pesetas
		float pesetas;

		// Ask for user's info
		System.out.print("Cuantas pesetas quieres convertir?: ");
		// guardar el numero de pesetas
		pesetas = sc.nextFloat();
		
		// Print info
		// convertir las pesetas a euros e imprimirlos
		System.out.println(pesetas + " pesetas son " + (pesetas/166) + " euros.");
		
		// Close scanner
		sc.close();
	}
}
