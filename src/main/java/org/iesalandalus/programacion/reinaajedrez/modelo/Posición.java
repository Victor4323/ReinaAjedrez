package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posición {
	private int fila;
	private char columna;

	private void setFila(int fila) {
		if (fila >= 1 && fila <= 8) {
		} else {
			throw new IllegalArgumentException("La reina esta fuera del tablero");
		}
		this.fila = fila;
	}

	private void setColumna(char columna) {
		if (columna >= 'a' && columna <= 'h') {
		} else {
			throw new IllegalArgumentException("La reina salio del tablero ");
		}
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public char getColumna(char columna) {
		return columna;
	}

	public Posición(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

}
