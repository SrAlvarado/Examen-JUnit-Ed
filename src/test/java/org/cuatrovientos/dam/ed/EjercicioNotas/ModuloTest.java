package org.cuatrovientos.dam.ed.EjercicioNotas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ModuloTest {

	@Test
	void testNotaModulo_EntregablesIncompletos() {
		Modulo modulo = new Modulo("Programación",
				Arrays.asList(8.0, -1.0, 7.5), 
				Arrays.asList(6.0, 5.0));
		
		double actual = modulo.calcularNotaModulo();
		double expected = 0.0;

		assertEquals(expected, actual, "No debería calcular nota si faltan entregables");
	}

	@Test
	void testNotaModulo_ExamenesIncompletos() {
		Modulo modulo = new Modulo("Sistemas",
				Arrays.asList(7.0, 8.0, 9.0), 
				Arrays.asList(6.0, -1.0));
		
		double actual = modulo.calcularNotaModulo();
		double expected = 0.0;

		assertEquals(expected, actual, "No debería calcular nota si faltan exámenes");
	}

	@Test
	void testNotaModulo_ExamenMenorA4() {
		Modulo modulo = new Modulo("Redes",
				Arrays.asList(9.0, 10.0), 
				Arrays.asList(3.5, 6.0));
		
		double actual = modulo.calcularNotaModulo();
		double expected = 3.5;

		assertEquals(expected, actual, "Debería devolver la nota menor a 4 más alta");
	}

	@Test
	void testNotaModulo_TodoCorrecto() {
		Modulo modulo = new Modulo("Entornos",
				Arrays.asList(8.0, 9.0), 
				Arrays.asList(6.0, 7.0));
		
		double actual = modulo.calcularNotaModulo();
		double expected = (8.5 * 0.6) + (6.5 * 0.4);

		assertEquals(expected, actual, 0.01, "Debería calcular nota ponderada correctamente");
	}
}
