package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosClase;

import java.util.Scanner;

public class App {
    
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number: ");
			double num1 = input.nextDouble();

			System.out.print("Enter an operator (+, -, *, /): ");
			char operator = input.next().charAt(0);

			System.out.print("Enter second number: ");
			double num2 = input.nextDouble();

			Calculator calculator = new Calculator();
			
			double result = Double.NaN;
			
			switch (operator) {
	            case '+':
	                result = calculator.add(num1, num2);
	                break;
	            case '-':
	            	result = calculator.sub(num1, num2);
	            	break;
	            case '*':
	            	result = calculator.multiply(num1, num2);
	            	break;
	            case '/':
	            	result = calculator.divide(num1, num2);
	            	break;
	            default:
	                result = Double.NaN; // Indicate invalid operator.
	        }
			

			if (Double.isNaN(result)) {
				System.err.println("Error: Invalid operator or division by zero.");
			} else {
				System.out.println("Result: " + result);
			}
		}
		catch (Exception e) {
			System.err.println("Exception: " + e);
			e.printStackTrace();
		}
		finally {
			input.close();
		}

	}
    
}
