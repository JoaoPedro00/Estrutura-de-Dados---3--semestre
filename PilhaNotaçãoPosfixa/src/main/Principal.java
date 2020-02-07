package main;

import javax.swing.JOptionPane;

import controller.StatickStack;

public class Principal {

	public static void main(String[] args) {
		StatickStack pilha = new StatickStack(20);
		char[] vet = new char[10];
		for(int i=0;i<vet.length;i++) {
			vet[i] = (char) Integer.parseInt(JOptionPane.showInputDialog("digite a expressão"));
		}
		for(int i=0;i<vet.length;i++) {
			pilha.empilhar(vet[i]);
		}
		}
}
