package ejer9;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		float pesetas;

		// Ask for user's info
		System.out.print("Cuantas pesetas quieres convertir?: ");
		pesetas = sc.nextFloat();
		
		// Print info
		System.out.println(pesetas + " pesetas son " + (pesetas/166) + " euros.");
		
		// Close scanner
		sc.close();
	}
}
