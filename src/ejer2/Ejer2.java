package ejer2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		// variable para guardar la edad del usuario
		byte age;
		
		// Ask for age
		System.out.print("Cual es tu edad?: ");
		// guardar el input del usuario en la variable age
		age = sc.nextByte();
				
		// Print info
		// calcular la edad que tendra el año que viene e imprimirla
		System.out.println("El año que viene tendrás: " + (age+1));
		
		// Close scanner
		sc.close();
	}
}
