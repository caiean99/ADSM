package br.usjt.geometria;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public String toString() {
		return "Retangulo [Area = " + area() + ", Perimetro = " + perimetro() + "]\n";
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public double perimetro() {
		return 2 * getBase() + 2 * getAltura();
	}

}
