public class AVLNode {
	public int element; //Elemento do nó é um inteiro
	public AVLNode esq; //Referência para o filho esquerdo
	public AVLNode dir; //Referência para o filho direito
	public int altura; //Altura do nó na árvore
	//Construtor do node
	public AVLNode(int valor, AVLNode e, AVLNode d) {
		element = valor;
		esq = e;
		dir = d;
		altura = 0;
	}
}