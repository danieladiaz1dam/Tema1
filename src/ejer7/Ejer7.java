package ejer7;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		String nombre, direccion;
		int numero;
		
		// Ask for user info
		System.out.print("Cómo te llamas?: ");
		nombre = sc.nextLine();
		
		// Ask for user info
		System.out.print("Dónde vives?: ");
		direccion = sc.nextLine();
		
		// Ask for user info
		System.out.print("Cual es tu numero de teléfono?: ");
		numero = sc.nextInt();
				
		// Print info
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Teléfono: " + numero);
		
		// Close scanner
		sc.close();
	}
}
