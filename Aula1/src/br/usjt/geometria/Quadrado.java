package br.usjt.geometria;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return Math.pow(getBase(), 2);
	}

	@Override
	public String toString() {
		return "Quadrado [Area = " + area() + ", Perimetro = " + perimetro() + "]\n";
	}

	@Override
	public double diagonal() {
		return getBase() * Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		return 4 * getBase();
	}

}
