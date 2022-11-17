package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;

	private void setFila(int fila) {
		if (fila >= 1 && fila <= 8) {
		} else {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
	}

	private void setColumna(char columna) {
		if (columna >= 'a' && columna <= 'h') {
		} else {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}

	public Posicion(int fila, char columna) { //constructor normal 
		
		setFila(fila);
		setColumna(columna);
	}

	public Posicion(Posicion posicion) { //constructor copia
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		fila = posicion.getFila();
		columna = posicion.getColumna();
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila); //no es un costructor 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila; //no es un costructor 
	}

	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna;
	}

}