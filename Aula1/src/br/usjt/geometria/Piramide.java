package br.usjt.geometria;

public class Piramide extends Quadrado implements Volume {
	protected double profundidade;	

	public Piramide(double base, double altura, double profundidade) {
		super(base, altura);
		this.profundidade = profundidade;
	}

	@Override
	public double volume() {
		return (1/3) * getBase() * getAltura() * profundidade;
	}
	

}
