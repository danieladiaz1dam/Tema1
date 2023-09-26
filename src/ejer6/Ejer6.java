package ejer6;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		// variables para guardar los numeros
		// primer numero
		float num1;
		// segundo numero
		float num2;
		
		// Ask for user info
		System.out.print("Introduce el primer numero?: ");
		// guardar el primer numero
		num1 = sc.nextFloat();
		
		// Ask for user info
		System.out.print("Introduce el segundo numero?: ");
		// guardar el segundo numero
		num2 = sc.nextFloat();
				
		// Print info
		// imprimir la suma
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		// imprimir la resta
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		// imprimir la multiplicacion
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		// imprimir la division
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		
		// Close scanner
		sc.close();
	}
}
