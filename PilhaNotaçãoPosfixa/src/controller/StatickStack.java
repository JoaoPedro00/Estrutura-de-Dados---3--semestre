package controller;

public class StatickStack {
	public Object[] pilha;
	public int topo;
	/* Método Construtor */
	public StatickStack(int n) {
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

	public Object empilhar(Object element) {
		// push
		if(element == int) {
			if (this.topo < this.pilha.length - 1) {
				this.pilha[++topo] = element;
				}
			System.out.print(desempilhar());
			}
			if (element<=this.topo) {
				System.out.print(desempilhar());
				this.pilha[++topo] = element;
			}
			else if (element > this.topo) {
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
	
}
