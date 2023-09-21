package ejer6;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		
		// Ask for user info
		System.out.print("Introduce el primer numero?: ");
		num1 = sc.nextFloat();
		
		// Ask for user info
		System.out.print("Introduce el segundo numero?: ");
		num2 = sc.nextFloat();
				
		// Print info
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		
		// Close scanner
		sc.close();
	}
}
