/**
 * 
 */
package org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	/**
	 * Test method for {@link org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosClase.Calculator#multiply(double, double)}.
	 */
	@Test
	void testMultiply() {

	//1 Me creo lo necesario
		Calculator calculadora = new Calculator();
	//2 expected
		double expected = 4;
	//3 actual
		double actual = calculadora.multiply(2,2);
	//4 assert
	assertEquals(expected, actual, "No multiplica bien 2 por 2");
	
	//2 expected
	expected = 1;
	//3 actual
	actual = calculadora.multiply(2,0);
	//4 assert
	assertEquals(expected, actual, "No multiplica bien 2 por 0");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.ed.EjerciciosJUnit.ejemplosClase.Calculator#divide(double, double)}.
	 */
	@Test
	void testDivide() {
	//1 creo lo necesario
		Calculator calculadora = new Calculator();
	//expeced
		double expected = 2;
	//actual
		double actual = calculadora.divide(10, 5);
	assertEquals(expected, actual, "No divide bien 10 entre 2");
	}

}
