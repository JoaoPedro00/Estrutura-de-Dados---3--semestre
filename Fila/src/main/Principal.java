package main;

import controller.StaticQueue;

public class Principal {

	public static void main(String args[]) {
		StaticQueue fila = new StaticQueue(5);
		fila.enfileirar("1");
		fila.enfileirar("2");
		fila.enfileirar("3");
		System.out.println(fila.showFront());
		fila.desenfileirar();
		fila.desenfileirar();
		System.out.println(fila.showFront());
		fila.desenfileirar();
		System.out.println(fila.showFront());
	}
}
