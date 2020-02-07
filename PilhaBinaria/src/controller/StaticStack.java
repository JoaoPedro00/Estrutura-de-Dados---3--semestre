package controller;

public class StaticStack {
	public Object[] pilha;
	public int topo;
	/* Método Construtor */
	public StaticStack(int n) {
		this.topo = -1;
		this.pilha = new Object[n];
	}
	public boolean isEmpty() {
		if (this.topo == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if (pilha.length == topo + 1) {
			return true;
		}
		return false;
	}
	public int getSize() {
		return this.topo + 1;
	}
	public Object showTop() {
		if (this.isEmpty()) {
			return null;
		}
		return this.pilha[this.topo];
	}
	public void empilhar(Object element) {
		if (this.topo < this.pilha.length - 1) {
			this.pilha[++topo] = element;
		}
	}
	public Object desempilhar() {
		// pop
		if (isEmpty()) {
			return null;
		}
		return this.pilha[this.topo--];
	}
	public String binario(int i, StaticStack pilha) {//exer 16
		String numBinario = "";
		int resto = 0;
		while (i>0){
			resto = i % 2;
			pilha.empilhar(resto);
			i = i/2;
		}
		while(!pilha.isEmpty()){
			numBinario += pilha.desempilhar();//transformar em lista
		}
		return numBinario;
	}
	public static boolean testaPalindromo(String palavra, StaticStack pilha2) {
		for(int i=0;i<palavra.length();i++){
			pilha2.empilhar(palavra.charAt(i));
		}
		String palavraInversa = "";
		while(!pilha2.isEmpty()){
			palavraInversa += pilha2.desempilhar();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)){
			return true;
		}
		return false;
	}

}