package br.usjt.geometria;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [area()=" + area() + "Perimetro =" + perimetro() + "]";
	}

	@Override
	public double perimetro() {
		return getBase() + 2 * Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

}
