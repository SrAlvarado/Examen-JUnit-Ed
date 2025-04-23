package org.cuatrovientos.dam.ed.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	/**
	 * Test para comprobar que generarNumero siempre da un número entre 0 y 254.
	 */
	@Test
	void testGenerarNumero() {
		// 1. Crear lo necesario
		GeneradorIp generador = new GeneradorIp();

		for (int i = 0; i < 1000; i++) {
			// 2. Expected
			int min = 0;
			int max = 254;

			// 3. Actual
			int actual = generador.generarNumero();

			// 4. Assert
			assertTrue(actual >= min && actual <= max, "Número fuera de rango: " + actual);
		}
	}

	/**
	 * Test para comprobar que la IP generada no empieza ni termina en 0.
	 */
	@Test
	void testGenerarIPV4() {
		// 1. Crear lo necesario
		GeneradorIp generador = new GeneradorIp();

		for (int i = 0; i < 1000; i++) {
			// 2. Actual
			String ip = generador.generarIPV4();

			// 3. Dividir la IP en partes
			String[] partes = ip.split("\\.");

			// 4. Parsear inicio y fin
			int primera = Integer.parseInt(partes[0]);
			int ultima = Integer.parseInt(partes[3]);

			// 5. Asserts
			assertNotEquals(0, primera, "La IP empieza por 0: " + ip);
			assertNotEquals(0, ultima, "La IP termina en 0: " + ip);
		}
	}
}
