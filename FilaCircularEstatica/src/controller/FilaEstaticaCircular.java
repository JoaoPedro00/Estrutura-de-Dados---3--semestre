package controller;

public class FilaEstaticaCircular {
	
	public Object[] fila;
	public int pri;
	public int ult;
	public int t;

	public FilaEstaticaCircular(int n) {
		this.pri = -1;
		this.ult = -1;
		this.fila = new Object[n];
		this.t = n;
	}
	
	public boolean isEmpty() {
		if (ult == -1) {
			return true;
		}
		return false;
	}
	
	
	public boolean isFull() {
		if (pri == (ult + 1) % t) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		if (this.isEmpty()) {
			return 0;
		}
		return this.ult + 1;
	}
	
	public Object showFront() {
		if (this.isEmpty()) {
			return null;
		}
		return this.fila[this.pri];
	}
	
	public void enfileirar(Object element) {
		if (isEmpty()) {
			 pri = 0;
			 ult = 0;
			this.fila[ult] = element;
		} else if (!isFull()) {
			ult = (ult + 1) % t;
			this.fila[ult] = element;
		}
	}
	
	public Object desenfileirar() {
		if (isEmpty()) {
			return null;
		}
		if (getSize() == 1) {
			ult--;
			return this.fila[this.pri--];
		}
		Object tmp = this.fila[this.pri];
		pri = (pri + 1) % t;
		return tmp;
	}
}
