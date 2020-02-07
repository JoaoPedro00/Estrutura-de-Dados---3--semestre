import javax.swing.JOptionPane;

public class BuscaRecursivo {

	public static void main(String[] args) {
		int v[] = new int[10]; 
		int i; 
		for (i=0; i<10; i++) {
		  v[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha o vetor")); 
		}
		int inf = 0 ;
		int sup = v.length-1;
		int n = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
		int encontrado = +PesquisaBinaria (n,v,inf,sup);
		if(encontrado==1){
			System.out.println("valor encontrado");
		}
		else{
			System.out.println("valor não encontrado");
		}

	}

	private static int PesquisaBinaria(int valor, int[] v, int inferior, int superior) {
		int meio = (inferior + superior)/2;
		 if (v[meio] == valor)
		    return 1;
		 if (inferior >= superior)
		    return -1; 
		 else
		     if (v[meio] < valor)
		        return PesquisaBinaria(valor, v, meio+1,superior);
		     else
		        return PesquisaBinaria(valor, v,inferior, meio-1);
		}
	}


