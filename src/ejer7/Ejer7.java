package ejer7;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		//variables info del usuario
		// su nombre
		String nombre;
		// su direccion
		String direccion;
		// su numero de telefono
		int numero;
		
		// Ask for user info
		System.out.print("Cómo te llamas?: ");
		// guardar su nombre
		nombre = sc.nextLine();
		
		// Ask for user info
		System.out.print("Dónde vives?: ");
		// guardar su direccion
		direccion = sc.nextLine();
		
		// Ask for user info
		System.out.print("Cual es tu numero de teléfono?: ");
		// guardar su numero de telefono
		numero = sc.nextInt();
				
		// Print info
		// imprimir su nombre
		System.out.println("Nombre: " + nombre);
		// imprimir su direccion
		System.out.println("Direccion: " + direccion);
		// imprimir su numero
		System.out.println("Teléfono: " + numero);
		
		// Close scanner
		sc.close();
	}
}
