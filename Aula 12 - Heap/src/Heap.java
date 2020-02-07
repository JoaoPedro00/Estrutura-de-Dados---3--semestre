
public class Heap {
	int vetor[];
	int n;
	public Heap(int t) {
		vetor = new int[t];
		n = 0; //heap inicia vazio
	}
	public void insere(int elemento) {
		vetor[n+1] = elemento; //n é a posição do último
		n++;
		subir(n);
	}
	void subir(int filho) {
		int pai = filho / 2;
		if (pai >= 1) {
			if (vetor[filho] > vetor[pai]) {
				int aux;
				aux = vetor[filho];
				vetor[filho] = vetor[pai];
				vetor[pai] = aux;
				subir(pai);
			}
		}
	}
	void remove() {
		vetor[1] = vetor[n];
		n--;
		descer(1, n);
	}
	void descer(int pai, int ultimo) {
		int filho = 2 * pai; //Filho esquerdo
		if (filho <= ultimo) {
			if (filho < ultimo) { //Tem filho direito
				if (vetor[filho + 1] > vetor[filho]) {
					filho++; //Filho direito maior
				}
			}
			if (vetor[pai] < vetor[filho]) {
				//Trocar pai e filho maior
				int aux;
				aux = vetor[pai];
				vetor[pai] = vetor[filho];
				vetor[filho] = aux;
				descer(filho, ultimo);
			}
		}
	}
	public String printHeap(int p) {
		String retorno;
		retorno = "(";
		if (p <= n) {
			retorno += " " + vetor[p]+ " ";
			retorno += printHeap(2*p);
			retorno += printHeap(2*p+1);
		}
		retorno = retorno + ") ";
		return retorno;
	}
}

