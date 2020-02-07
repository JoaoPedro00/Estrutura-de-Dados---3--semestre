public class AVLTree {
	public AVLNode raiz; //nó raiz da árvore
	public AVLTree() {
		raiz = null;
	}
	//Retorna a altura da árvore
	public int altura(AVLNode t) {
		return (t == null) ? -1 : t.altura;
	}
	//Retorna o maior valor entre ladoEsq e ladoDir
	public int max(int ladoEsq, int ladoDir) {
		return (ladoEsq > ladoDir) ? ladoEsq : ladoDir;
	}
	//Retorna o fator de balanceamento
	public int fatorDeBalanceamento(AVLNode t) {
		return altura(t.esq) - altura(t.dir);
	}
	//Insere um elemento x na árvore AVL
	public AVLNode inserir(AVLNode t, int x) {
		if (t == null) {
			t = new AVLNode(x, null, null);
		} else if (x <= t.element) {
			t.esq = inserir(t.esq, x);
		} else if (x > t.element) {
			t.dir = inserir(t.dir, x);
		}
		t = balanceamento(t);
		return t;
	}
	//Realiza o balanceamento da árvore
	public AVLNode balanceamento(AVLNode t) {
		if (fatorDeBalanceamento(t) == 2) {
			//He > Hd: elemento inserido na subárvore esquerda
			if (fatorDeBalanceamento(t.esq) > 0) {
				//"positivo + positivo" = "reta"
				t = rotacaoDireita(t);
			} else {
				//"positivo + negativo" = "joelho"
				t = rotacaoEsquerdaDireita(t);
			}
		} else if (fatorDeBalanceamento(t) == -2) {
			//Hd > He: elemento inserido na subárvore direita
			if (fatorDeBalanceamento(t.dir) < 0) {
				//"negativo + negativo" = "reta"
				t = rotacaoEsquerda(t);
			} else {
				//"negativo + positivo" = "joelho"
				t = rotacaoDireitaEsquerda(t);
			}
		}
		t.altura = max(altura(t.esq), altura(t.dir)) + 1;
		return t;
	}
	//Rotação Simples à Direita
	public AVLNode rotacaoDireita(AVLNode p) {
		AVLNode u = p.esq;
		p.esq = u.dir;
		u.dir = p;
		p.altura = max(altura(p.esq), altura(p.dir)) + 1;
		u.altura = max(altura(u.esq), p.altura) + 1;
		return u;
	}
	//Rotação Simples à Esquerda
	public AVLNode rotacaoEsquerda(AVLNode p) {
		AVLNode z = p.dir;
		p.dir = z.esq;
		z.esq = p;
		p.altura = max(altura(p.esq), altura(p.dir)) + 1;
		z.altura = max(altura(z.dir), p.altura) + 1;
		return z;
	}
	//Rotação Dupla à Direita
	public AVLNode rotacaoEsquerdaDireita(AVLNode p) {
		p.esq = rotacaoEsquerda(p.esq);
		return rotacaoDireita(p);
	}
	//Rotação Dupla à Esquerda
	public AVLNode rotacaoDireitaEsquerda(AVLNode p) {
		p.dir = rotacaoDireita(p.dir);
		return rotacaoEsquerda(p);
	}
	public String printTree(AVLNode p) {
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
	
	public AVLNode remover(AVLNode p, int valor) {
		AVLNode aux, r = null;
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
		p = balanceamento(p);
		return p;
	}
	
	
	public static boolean verificaBinaria(AVLNode p){
		if (p == null) {
			return true;
		}else if (p.esq !=null)
		{
			if (p.element <= p.esq.element)
			{
				return false;
			} else if (p.dir !=null) 
			{
				if (p.element > p.dir.element) 
				{
					return false;
				}
			}
			
		}
		verificaBinaria(p.esq);
		verificaBinaria(p.dir);
		return true;
	}
}
