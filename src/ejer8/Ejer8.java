package ejer8;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;

		// Ask for user info
		System.out.print("Cómo te llamas?: ");
		nombre = sc.nextLine();

		// Ask for user info
		System.out.print("Qué edad tienes?: ");
		edad = sc.nextInt();

		// Print info
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");

		// Close scanner
		sc.close();
	}
}
