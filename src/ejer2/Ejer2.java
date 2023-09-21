package ejer2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int age;
		
		// Ask for age
		System.out.print("Cual es tu age?: ");
		age = sc.nextInt();
				
		// Print info
		System.out.println("El año que viene tendrás: " + (age+1));
		
		// Close scanner
		sc.close();
	}
}
