package main;

import controller.FilaEstaticaCircular;

public class principal {

	public static void main(String[] args) {

		FilaEstaticaCircular fila = new FilaEstaticaCircular(5);
		fila.enfileirar("1");
		fila.enfileirar("2");
		fila.enfileirar("3");
		System.out.println(fila.showFront());
		fila.desenfileirar();
		fila.desenfileirar();
		System.out.println(fila.showFront());
		fila.enfileirar("4");
		fila.desenfileirar();
		fila.enfileirar("5");
		fila.enfileirar("6");
		System.out.println(fila.showFront());
		}
	}


