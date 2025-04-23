package org.cuatrovientos.dam.ed.EjercicioNotas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testAprobarCurso_SinModulos() {
		Alumno alumno = new Alumno("Juan", "juan@example.com", Collections.emptyList());

		assertTrue(alumno.aprobarCurso(), "Si no tiene módulos, debería aprobar");
	}

	@Test
	void testAprobarCurso_TodosModulosAprobados() {
		Modulo m1 = new Modulo("FOL", Arrays.asList(10.0, 9.0), Arrays.asList(8.0, 7.0));
		Modulo m2 = new Modulo("BD", Arrays.asList(9.0, 10.0), Arrays.asList(7.0, 8.0));
		Alumno alumno = new Alumno("Laura", "laura@example.com", Arrays.asList(m1, m2));

		assertTrue(alumno.aprobarCurso(), "Debería aprobar si todos los módulos están aprobados");
	}

	@Test
	void testAprobarCurso_ModuloSuspendido() {
		Modulo m1 = new Modulo("Lenguajes", Arrays.asList(2.0, 3.0), Arrays.asList(4.0, 5.0)); // Nota baja
		Alumno alumno = new Alumno("Pedro", "pedro@example.com", Arrays.asList(m1));

		assertFalse(alumno.aprobarCurso(), "No debería aprobar si hay un módulo suspendido");
	}

	@Test
	void testSetEmailInvalido() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Alumno("Sofía", "emailErroneo", null);
		});

		assertEquals("Email no válido", exception.getMessage());
	}
}
