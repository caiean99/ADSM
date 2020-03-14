package br.usjt.geometria;

public class Cubo extends Quadrado implements Volume {

	public Cubo(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double volume() {
		return Math.pow(getBase(), 3);
	}

	@Override
	public String toString() {
		return "Cubo [Volume = " + volume() + "]\n";
	}
	

}
