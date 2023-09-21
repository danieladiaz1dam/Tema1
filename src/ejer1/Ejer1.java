package ejer1;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;
		
		// Ask for phone number
		System.out.print("Cual es tu numero de teléfono?: ");
		num = sc.nextInt();
				
		// Print info
		System.out.println("Tu numero es: " + num);
		
		// Close scanner
		sc.close();
	}
}
