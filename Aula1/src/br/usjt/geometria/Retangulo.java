package br.usjt.geometria;

public class Retangulo extends Poligono {

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
		return "Retangulo [area()=" + area() + "]";
	}

}
