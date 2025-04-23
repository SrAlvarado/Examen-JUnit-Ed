package org.cuatrovientos.dam.ed.EjercicioNotas;

import java.util.List;

public class Alumno {
	private String nombre;
	private String email;
	private List<Modulo> modulos;

	public Alumno(String nombre, String email, List<Modulo> modulos) {
		this.nombre = nombre;
		setEmail(email);
		this.modulos = modulos;
	}

	public boolean aprobarCurso() {
		// Regla 1: si no tiene módulos, lo aprueba directamente
		if (modulos == null || modulos.isEmpty()) {
			return true;
		}

		// Regla 2: comprobar si todas las notas son > 5
		for (Modulo modulo : modulos) {
			if (modulo.calcularNotaModulo() <= 5.0) {
				return false;
			}
		}

		return true;
	}

	public void setEmail(String email) {
		// Validación simple de sintaxis de email
		if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email no válido");
		}
		this.email = email;
	}
}
