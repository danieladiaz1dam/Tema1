package ejer3;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int nacimiento, now;
		
		// Ask for user info
		System.out.print("Qué año naciste?: ");
		nacimiento = sc.nextInt();
		
		// Ask for user info
		System.out.print("Qué año es actualmente?: ");
		now = sc.nextInt();
				
		// Print info
		System.out.println("Entonces tienes " + (now - nacimiento) + " años.");
		
		// Close scanner
		sc.close();
	}
}
