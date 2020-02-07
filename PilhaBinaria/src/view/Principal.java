package view;

import java.util.Stack;

import javax.swing.JOptionPane;

import controller.Queue;
import controller.StaticStack;

public class Principal {

	public static void main(String args[]) {
		StaticStack pilha = new StaticStack(15);
		Principal binario = new Principal();
		String palavra = JOptionPane.showInputDialog("");
		System.out.println(pilha.testaPalindromo(palavra,pilha));
		System.out.println(pilha.binario(3,pilha));
		System.out.println(binario.binario(10));
		while (pilha.isEmpty() == false) {
			System.out.println(pilha.desempilhar());
		}
		Queue q = new Queue();  
	    q.enQueue(1);  
	    q.enQueue(2);  
	    q.enQueue(3);  
	  
	    System.out.println(q.deQueue());  
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue()); 
	}
	
	
	public String binario(int i) {//exer 16
		Stack<Integer> pilha = new Stack<Integer>()	;
		String numBinario = "";
		int resto = 0;
		while (i>0){
			resto = i % 2;
			pilha.push(resto);
			i = i/2;
		}
		while(!pilha.isEmpty()){
			numBinario += pilha.pop();//transformar em lista
		}
		return numBinario;
	}
}
