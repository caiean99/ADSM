package br.usjt.geometria;
import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(2));
		figuras.add(new Triangulo(2,3));
		figuras.add(new Quadrado(3,5));
		figuras.add(new Losango(2,5));
		figuras.add(new Retangulo(4,2));

		for(Figura fig:figuras) {
			System.out.println(fig);
		}
	}
 }
