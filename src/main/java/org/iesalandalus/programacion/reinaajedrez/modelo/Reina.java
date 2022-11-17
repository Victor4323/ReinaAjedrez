package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Color color;
	private Posicion posicion;

	private Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		if (posicion == null) {
			throw new NullPointerException("ERRO; El color no puede ser nulo");
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula. ");
		}
		this.posicion = posicion;
	}

	public Reina() {
		color = color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	public Reina(Color color) {
		if (color == Color.NEGRO) {
			posicion = new Posicion(1, 'd');
			this.color = color;
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
			this.color = color;
		}
	}

	public void mover(Direccion direccion, int Pasos) {

	}
}