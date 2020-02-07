
public class BinaryTree {
	public Node raiz; //node raiz da �rvore
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
	public void preOrdem(Node p) {
		if (p != null) {
			System.out.print(p.element + " ");
			preOrdem(p.esq);
			preOrdem(p.dir);
		}
	}
	
	public boolean Busca(Node p, int valor,boolean encontrado) {
		if(p!= null) {
			if(p.element != valor) {
				encontrado = Busca(p.esq,valor,encontrado);
				encontrado = Busca(p.dir,valor,encontrado);
			}
			else {
				encontrado = true;
			}
		}
		return encontrado;
	}
	public int altura (Node r) {
		   if (r == null) 
		      return 0; // altura da �rvore vazia
		   else {
		      int he = altura(r.esq);
		      int hd = altura (r.dir);
		      if (he < hd) return hd + 1;
		      else return he + 1;
		   }
	}
	public Node removerMenor(Node p){
		Node aux, r = null;
		aux = p.esq;
		r = p.esq;
		while(aux.esq!=null){
			r = aux;
			aux = aux.esq;
		}
		if(aux == r){
			p.esq=aux.dir;
		}
		r.esq = null;
		return p;
	}
		
	public Node remover(Node p, int valor) {
		Node aux, r = null;
		if (p.element == valor) { //achei o valor na �rvore
			if ((p.esq == null) && (p.dir == null)) { //n�o tem filhos
				return null;
			} else if (p.esq == null) { //tem apenas filho direito
				//(sub�rvore direita)
				return p.dir;
			} else if (p.dir == null) { //tem apenas filho esquerdo
				//(sub�rvore esquerda)
				return p.esq;
			} else { //tem dois filhos
				//(sub�rvores esquerda e direita)
				r = p;
				aux = p.dir;
				while (aux.esq != null) { //encontrar o descendente
					//mais � esquerda na
					//sub�rvore direita
					r = aux;
					aux = aux.esq;
				}
				p.element = aux.element;
				if (r == p) { //n�o entrou no la�o while
					r.dir = aux.dir;
				} else {
					r.esq = aux.dir;
				}
				return p;
			}
		} else if (p.element < valor) {
			p.dir = remover(p.dir, valor); //remover na sub�rvore
			//direita
		} else {
			p.esq = remover(p.esq, valor); //remover na sub�rvore
			//esquerda
		}
		return p;
	}
	public static boolean verificaBinaria(Node p){//exer 3
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
	
	public static boolean verificaHeap(int vetor[]){
		int i;
		for(i=(vetor.length-1);(i-1/2)>=0 && i>=1;i--){
			if(vetor[i]>vetor[(i-1)/2]){
				return false;
			}//if
		}//for
		return true;
	}
	
	}
	