
public class Exer2 {

	public static void main(String[] args){
		int vet[] = new int[10];
		for (int n=0 ; n<10;n++){
			vet[n] = (int)(Math.random()*15)+1;
			System.out.print(" ["+vet[n]+"]" );
		}
		int n = 9;
		System.out.println("\n A soma do vetor é " +Soma(vet,n));
		inverte(vet,vet[0],vet[9]);
		for (int a=0 ; a<10;n++){
			System.out.print(" ["+vet[a]+"]" );
		}
}


	private static void inverte(int[] vet, int esq, int dir) {
		int t;
		if(esq>= dir)return;
		t = vet[esq];
		vet[esq] = vet[dir];
		vet[dir] = t;
		inverte(vet,esq+1,dir-1);
	}


	public static int Soma(int vet[],int n){
	if (n==0) return vet[n]; //condição de parada
	else 
		return vet[n] + Soma(vet , n-1) ; //chamada recursiva

	}
}