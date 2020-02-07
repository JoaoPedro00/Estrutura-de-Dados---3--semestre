
public class Principal {

	public static void main(String[] args) {
		AVLTree arvore = new AVLTree();
		arvore.raiz = arvore.inserir(arvore.raiz, 20);
		arvore.raiz = arvore.inserir(arvore.raiz, 10);
		arvore.raiz = arvore.inserir(arvore.raiz, 5);
		arvore.raiz = arvore.inserir(arvore.raiz, 30);
		arvore.raiz = arvore.inserir(arvore.raiz, 25);
		arvore.raiz = arvore.inserir(arvore.raiz, 27);
		arvore.raiz = arvore.inserir(arvore.raiz, 28);
		arvore.raiz = arvore.inserir(arvore.raiz, 32);
		arvore.raiz = arvore.inserir(arvore.raiz, 14);
		arvore.raiz = arvore.inserir(arvore.raiz, 39);
		arvore.raiz = arvore.inserir(arvore.raiz, 6);
	/*	System.out.println(arvore.printTree(arvore.raiz));
		arvore.raiz = arvore.remover(arvore.raiz, 7);
		System.out.println(arvore.printTree(arvore.raiz));
		arvore.raiz = arvore.remover(arvore.raiz, 4);
	*/	System.out.println(arvore.printTree(arvore.raiz));
	System.out.println(arvore.verificaBinaria(arvore.raiz));
	}

}
