package br.usjt.geometria;

public class Triangulo extends Poligono implements Diagonal {

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
		return "Triangulo [area()=" + area() + "]";
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

}
