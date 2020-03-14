package br.usjt.geometria;

public class Circulo extends Figura {
	protected double raio;

	public Circulo(double raio) {

		this.raio = raio;
	}
	

	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [Area " + area() + "Perimetro = " + perimetro() + "]\n";
	}


	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

}
