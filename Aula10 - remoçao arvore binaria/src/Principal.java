
public class Principal {
	public static void main(String args[]) {
		BinaryTree arvore = new BinaryTree();
		arvore.inserir(arvore.raiz, 50); arvore.inserir(arvore.raiz, 30);
		arvore.inserir(arvore.raiz, 10); arvore.inserir(arvore.raiz, 35);
		arvore.inserir(arvore.raiz, 12); arvore.inserir(arvore.raiz, 15);
		arvore.inserir(arvore.raiz, 70);arvore.inserir(arvore.raiz, 60);
		arvore.inserir(arvore.raiz, 59);arvore.inserir(arvore.raiz, 62);
		arvore.inserir(arvore.raiz, 72);arvore.inserir(arvore.raiz, 80);
		System.out.println(arvore.printTree(arvore.raiz));
//		arvore.raiz = arvore.remover(arvore.raiz, 55);
//		arvore.raiz = arvore.removerEsq(arvore.raiz, 55);
//		System.out.println(arvore.printTree(arvore.raiz));
//		arvore.raiz = arvore.remover(arvore.raiz, 60);
//		arvore.raiz = arvore.removerEsq(arvore.raiz, 60);
//		System.out.println(arvore.printTree(arvore.raiz));
//		arvore.raiz = arvore.remover(arvore.raiz, 50);
//		arvore.raiz = arvore.removerEsq(arvore.raiz, 50);
//		System.out.println(arvore.printTree(arvore.raiz));
		arvore.preOrdemIterativo(arvore.raiz);
		System.out.println();
		arvore.preOrdem(arvore.raiz);
		System.out.println();
		arvore.inOrdemIterativo(arvore.raiz);
		System.out.println();
	//	arvore.emOrdem(arvore.raiz);
		System.out.println();
		arvore.posOrdemIterativo(arvore.raiz);
		System.out.println();
		arvore.posOrdem(arvore.raiz);
		System.out.println();
	//	arvore.percursoEmLargura(arvore.raiz);
		}
}
