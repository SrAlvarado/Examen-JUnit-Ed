package org.cuatrovientos.dam.ed.EjercicioCadena;

public class Cadena {
	static String cadena;
	public Cadena(String string) {
		this.cadena = cadena;
	}
	public static int longitud(String cadena) {
		int longi = cadena.replace(" ","").length();
		return longi;
	}
	public static int numVocales(String cadena2) {
		String cantidadVocales = cadena.replaceAll("[^aeiouAEIOU]", "");
		return cantidadVocales.length();
	}
	public static String devolverReves(String cadena2) {
		StringBuilder reves = new StringBuilder(cadena);
		reves.reverse();
		return reves.toString();
	}
	public static int numLetras(String cadena, char letra) {
		int numeroLetras = 0;
		for (int i = 0; i < cadena.length() -1; i++) {
			numeroLetras = (cadena.charAt(i) == letra ? numeroLetras+1 : numeroLetras+0);
		}
		return numeroLetras;
	}
}
