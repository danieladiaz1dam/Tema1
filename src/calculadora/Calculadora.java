package calculadora;

import java.util.Scanner;

public class Calculadora {

	/**
	 * Simple calculator
	 * 
	 */
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		double num1, num2, res;
		String op;

		// Ask for a simple operation
		System.out.print("The available operands are: ");
		System.out.print("+, -, *, /, %, sqrt, pow\n");
		System.out.println("Enter an operation like \"1 + 1\": ");
		
		// Read and set variables
		// It reads until the next space, so we'll need at least 2
		num1 = sc.nextDouble();
		op = sc.next();
		num2 = sc.nextDouble();
		
		// Depending on the operand we set the variable res
		switch (op) {
		case "+":
			res = num1 + num2;
			break;
		case "-":
			res = num1 - num2;
			break;
		case "*":
			res = num1 * num2;
			break;
		case "/":
			res = num1 / num2;
			break;
		case "%":
			res = num1 % num2;
			break;
		case "sqrt":
			// Doing a square root is the same of powering the number to the index of the square root
			res = Math.pow(num1, 1/num2);
			break;
		case "pow":
			res = Math.pow(num1, num2);
			break;
		default:
			res = 0;
		}

		// We print the info to the user
		System.out.print(num1 + " " + op + " " + num2 + " = " + res);
		
		// Close the scanner
		sc.close();
	}

}
