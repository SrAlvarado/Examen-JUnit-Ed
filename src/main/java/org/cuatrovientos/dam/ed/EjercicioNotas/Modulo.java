package org.cuatrovientos.dam.ed.EjercicioNotas;

import java.util.List;

public class Modulo {
	private String nombre;
	private List<Double> entregables;
	private List<Double> examenes;

	public Modulo(String nombre, List<Double> entregables, List<Double> examenes) {
		this.nombre = nombre;
		this.entregables = entregables;
		this.examenes = examenes;
	}

	public double calcularNotaModulo() {
		// Reglas 1 y 2: entregables y exámenes no deben tener -1 (es que faltan)
		if (entregables.contains(-1.0) || examenes.contains(-1.0)) {
			return 0.0;
		}

		// Regla 3: si hay algún examen < 4, devolver el mayor de esos exámenes como nota
		double notaMinima = 4.0;
		for (double nota : examenes) {
			if (nota < notaMinima) {
				return nota;
			}
		}

		// Regla 4: calcular media ponderada
		double mediaEntregables = entregables.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		double mediaExamenes = examenes.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

		return (mediaEntregables * 0.6) + (mediaExamenes * 0.4);
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
}
