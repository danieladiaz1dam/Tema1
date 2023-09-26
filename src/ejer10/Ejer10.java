package ejer10;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		// Variables
		// constante con el porcentaje de IVA
		final int IVA = 21;
		// variable para guardar el precio del producto
		float precio = 0;
		// scanner
		Scanner sc = new Scanner(System.in);
		
		// Ask for user info
		System.out.print("Cuál es el precio del producto?: ");
		// guardar el input del usuario en la variable precio
		precio = sc.nextFloat();
		
		// Print info
		// calcular e imprimir el precio del producto mas su IVA
		System.out.println("El precio con IVA es de " + (precio + (precio*IVA/100)) + " euros.");
		
		// Close scanner
		sc.close();
	}
}
