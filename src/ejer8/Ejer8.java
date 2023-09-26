package ejer8;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		// variable para guardar el nombre del usuario
		String nombre;
		// varaible para guardar la edad del usuario
		byte edad;

		// Ask for user info
		System.out.print("Cómo te llamas?: ");
		// guardar su nombre
		nombre = sc.nextLine();

		// Ask for user info
		System.out.print("Qué edad tienes?: ");
		// guardar su edad
		edad = sc.nextByte();

		// Print formatted user info
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");

		// Close scanner
		sc.close();
	}
}
