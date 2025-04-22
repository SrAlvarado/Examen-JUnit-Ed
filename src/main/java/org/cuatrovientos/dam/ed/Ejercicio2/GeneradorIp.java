package org.cuatrovientos.dam.ed.Ejercicio2;

import java.util.Random;

public class GeneradorIp {
	private int minNumIp = 0;
	private int maxNumIp = 254;
	public int generarNumero() {
		Random rnd = new Random();
		int numDevolver = rnd.nextInt(minNumIp, maxNumIp +1);
		return numDevolver;
	}
	
	public String generarIPV4() {
		String ipDevolver = "";
		int numIp = 0;
		int[] cadenaNumeros = new int[4];
		do {
			for (int i = 0; i < 4; i++) {
				cadenaNumeros[i] = generarNumero();
			}
		} while (cadenaNumeros[1] == 0 || cadenaNumeros[3] == 0);
		for (int i = 0; i < 4; i++) {
			ipDevolver += cadenaNumeros[i];
			if (i < 3) {
				ipDevolver += ".";
			}
		}
		return ipDevolver;
	}
}
