package br.usjt.geometria;

public class Esfera extends Circulo implements Volume {

	public Esfera(double raio) {
		super(raio);

	}

	@Override
	public double volume() {
		return 4/3 * Math.PI * raio;

	}

	@Override
	public String toString() {
		return "Esfera [volume()=" + volume() + "]";
	}


}
