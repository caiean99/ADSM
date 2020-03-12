package br.usjt.geometria;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public String toString() {
		return "Losango [area()=" + area() + "Perimetro =" + perimetro() + "]";
	}

	@Override
	public double perimetro() {
		return 4 * getBase();
	}

}
