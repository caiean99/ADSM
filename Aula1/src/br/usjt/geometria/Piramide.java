package br.usjt.geometria;

public class Piramide extends Quadrado implements Volume {

	public Piramide(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double volume() {
		return (1/3) * Math.pow(getBase(), 2) * getAltura();
	}

	@Override
	public String toString() {
		return "Piramide [Volume = " + volume() + "]\n";
	}
	

}
