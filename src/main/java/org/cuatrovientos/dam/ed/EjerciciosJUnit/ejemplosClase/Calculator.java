package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosClase;

public class Calculator {
	
	public Calculator() {
	}
	
	public double add(double num1, double num2) {
		return num1+num2;
	}
	
	public double sub(double num1, double num2) {
		return num1-num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1*num2;
	}
	
	public double divide(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Double.NaN; // Indicate division by zero or invalid operator.
		}
	}

}