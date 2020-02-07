import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public Node raiz; //node raiz da árvore
	public BinaryTree() {
		raiz = null;
	}
	public void inserir(Node p, int valor) {
		if (p == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esq != null) {
				inserir(p.esq, valor);
			} else {
				p.esq = new Node(valor, null, null);
			}
		} else if (valor > p.element) {
			if (p.dir != null) {
				inserir(p.dir, valor);
			} else {
				p.dir = new Node(valor, null, null);
			}
		}
	}
	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ") ";
		return retorno;
	}
	
	public Node remover(Node p, int valor) {
		Node aux, r = null;
		if (p.element == valor) { //achei o valor na árvore
			if ((p.esq == null) && (p.dir == null)) { //não tem filhos
				return null;
			} else if (p.esq == null) { //tem apenas filho direito
				//(subárvore direita)
				return p.dir;
			} else if (p.dir == null) { //tem apenas filho esquerdo
				//(subárvore esquerda)
				return p.esq;
			} else { //tem dois filhos
				//(subárvores esquerda e direita)
				r = p;
				aux = p.dir;
				while (aux.esq != null) { //encontrar o descendente
					//mais à esquerda na
					//subárvore direita
					r = aux;
					aux = aux.esq;
				}
				p.element = aux.element;
				if (r == p) { //não entrou no laço while
					r.dir = aux.dir;
				} else {
					r.esq = aux.dir;
				}
				return p;
			}
		} else if (p.element < valor) {
			p.dir = remover(p.dir, valor); //remover na subárvore
			//direita
		} else {
			p.esq = remover(p.esq, valor); //remover na subárvore
			//esquerda
		}
		return p;
	}
	
	public Node removerEsq(Node p, int valor) {
		Node aux, r = null;
		if (p.element == valor) { //achei o valor na árvore
			if ((p.esq == null) && (p.dir == null)) { //não tem filhos
				return null;
			} else if (p.esq == null) { //tem apenas filho direito
				//(subárvore direita)
				return p.dir;
			} else if (p.dir == null) { //tem apenas filho esquerdo
				//(subárvore esquerda)
				return p.esq;
			} else { //tem dois filhos
				r = p;
				aux = p.esq;
				while (aux.dir != null) { //encontrar o descendente
					//mais à esquerda na
					//subárvore direita
					r = aux;
					aux = aux.dir;
				}
				p.element = aux.element;
				if (r == p) { //não entrou no laço while
					r.esq = aux.esq;
				} else {
					r.dir = aux.esq;
				}
				return p;
			}
		} else if (p.element < valor) {
			p.dir=remover(p.dir, valor); //remover na subárvore direita
		} else {
			p.esq=remover(p.esq, valor); //remover na subárvore esquerda
		}
		return p;
	}
	
	public void preOrdemIterativo(Node p) {//exer 6
		Stack pilha = new Stack();
		if (p != null) { 
			pilha.push(p);
			while (!pilha.isEmpty()) {
				p = (Node) pilha.pop(); 
				System.out.print(p.element + " ");
				if (p.dir != null) {
					pilha.push(p.dir);
				}
				if (p.esq != null) {
					pilha.push(p.esq);
				}
			}
		}
	}
	
	
	public void inOrdemIterativo(Node p){
		Stack pilha = new Stack();
		if(p!=null){
			while(!pilha.isEmpty()){
				if(p!=null){
					pilha.push(p);
					p = p.esq;
				} else {
					p =(Node)pilha.pop();
					System.out.print(p.element+" ");
					p= p.dir;
				}
			}
		}
	}
	public void posOrdemIterativo(Node p) {
		Node q = p;
        Stack travStack = new Stack();
        while (p != null) {
            for ( ; p.esq != null; p = p.esq)
                travStack.push(p);
            while (p != null && (p.dir == null ||
                                  p.dir == q)) {
            	System.out.print(p.element + " ");
                q = p;
                if (travStack.isEmpty())
                     return;
                p = (Node) travStack.pop();
            }
            travStack.push(p);
            p = p.dir;
        }
    }

	
	
	
	
	
	public void preOrdem(Node p) {
	    if (p != null){
	        System.out.print(p.element+" ");
	        preOrdem(p.esq);
	        preOrdem(p.dir);
	    }
	}
	
	public void emOrdem(Node p) {
	    if (p != null) {
	        emOrdem(p.esq);
	        System.out.print(p.element+" ");
	        emOrdem(p.dir);
	    }
	}
	
	public void posOrdem(Node p) {
	    if (p != null) {
	        posOrdem(p.esq);
	        posOrdem(p.dir);
	        System.out.print(p.element+" ");
	    }
	}
	void percursoEmLargura(Node p) {
		Queue fila = new LinkedList();
		if (p != null) { 
			fila.add(p);
			while (!fila.isEmpty()) {
				p = (Node) fila.remove(); 
				System.out.print(p.element + " ");
				if (p.esq != null) {
					fila.add(p.esq);
				}
				if (p.dir != null) {
					fila.add(p.dir);
				}
			}
		}
	}
}


