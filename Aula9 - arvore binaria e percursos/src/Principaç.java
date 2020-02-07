import sun.security.provider.VerificationProvider;

public class Principaç {
	public static void main(String args[]) {
		boolean encontrado = false;
		BinaryTree arvore = new BinaryTree();
		arvore.inserir(arvore.raiz, 14);
		arvore.inserir(arvore.raiz, 15);
		arvore.inserir(arvore.raiz, 9);
		arvore.inserir(arvore.raiz, 7);
		arvore.inserir(arvore.raiz, 18);
		arvore.inserir(arvore.raiz, 3);
		arvore.inserir(arvore.raiz, 5);
		arvore.inserir(arvore.raiz, 16);
		arvore.inserir(arvore.raiz, 4);
		arvore.inserir(arvore.raiz, 20);
		arvore.inserir(arvore.raiz, 17);
		System.out.println(arvore.printTree(arvore.raiz));
/*		System.out.println(arvore.printTree(arvore.raiz));
		arvore.raiz = arvore.removerMenor(arvore.raiz);
		System.out.println(arvore.printTree(arvore.raiz));
		arvore.preOrdem(arvore.raiz);
		System.out.println();
		System.out.println(arvore.Busca(arvore.raiz, 65,encontrado));
		System.out.println(arvore.Busca(arvore.raiz, 35,encontrado));
		System.out.println(arvore.Busca(arvore.raiz, 380,encontrado));
		System.out.println(arvore.altura(arvore.raiz));
*/		
		System.out.println(arvore.verificaBinaria(arvore.raiz));
	}
}
