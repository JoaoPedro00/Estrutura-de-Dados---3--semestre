import javax.swing.JOptionPane;

public class BuscaIterativo {

	public static void main(String[] args) {
		int vet[]= {1,3,5,7,10,17,18,29,30,51};
		int inf = 0;
		int sup = vet.length-1;
		int meio;
		int n = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
		while (sup>=inf) {
			meio = (inf+sup)/2;
			if(vet[meio]==n) {
				System.out.println("Valor encontrado");
				System.exit(0);
			}
			else if(n<vet[meio]) {
				sup = meio-1;
			}
			else {
				inf = meio+1;
			}
			
		}
		System.out.println("Valor não encontrado");
	}

}