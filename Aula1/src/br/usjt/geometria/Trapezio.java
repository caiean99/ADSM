package br.usjt.geometria;

public class Trapezio extends Poligono {
	protected double basemenor;

	public Trapezio(double base, double altura, double basemenor) {
		super(base, altura);
		this.basemenor = basemenor;
	}

	@Override
	public double area() {
		return ((getBase() + basemenor) * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getBase() + basemenor + 2 * Math.sqrt(Math.pow((getBase() - basemenor)/2, 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public String toString() {
		return "Trapezio [Area = " + area() + ", Perimetro = " + perimetro() + "]\n";
	}
	

}
