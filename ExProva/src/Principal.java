
public class Principal {

	public static void main(String[] args) {
		int vet[]= new int[4];
		for (int n=0; n<vet.length;n++) {
			vet[n] = (int)(Math.random()*15)+1;
			System.out.print("["+vet[n]+"]");
		}
		int pos=0;
		int tamanho = vet.length;
		System.out.println();
		vet=Finverte(vet,pos,tamanho);
		for(int n=0;n<vet.length;n++) {
			System.out.print("["+vet[n]+"]");
		}

	}

	private static int[] Finverte(int[] vet, int pos, int tamanho) {
		int aux = 0;
		if(pos==tamanho/2) {
		//	aux = vet[pos];
		//	vet[pos] = vet[tamanho-pos];
		//	vet[tamanho-pos]=vet[pos];
			return vet;
		}
		aux = vet[pos];
		vet[pos]=vet[tamanho-(pos+1)];
		vet[tamanho-(pos+1)]=aux;
		return vet = Finverte(vet, pos+1, tamanho);
	}

}
