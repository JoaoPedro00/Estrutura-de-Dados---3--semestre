
public class Exer1 {

	public static void main(String[] args) {
		int maior = 0;
		int vet[] = new int[10];
		int i = 0;
		for (int n=0 ; n<10;n++){
			vet[n] = (int)(Math.random()*15)+1;
			System.out.print(vet[n]+" ");
		}
		
		System.out.println("O maior numero do vetor é " + Maior(vet,i,maior));
		}
		public static int Maior(int vet[],int i,int maior) {
			if(i == vet.length-1){
				if (vet[i] > maior){
					maior = vet[i];
					return maior;
				} else{
					return maior;
				}
			}else if(i < vet.length-1){
				if (vet[i] > maior){
					maior = vet[i];
					return maior = Maior(vet, i+1, maior);
				} else{
					return maior = Maior(vet, i+1, maior);
				}
			}
			else {
				return maior = Maior(vet, i+1, maior);
			}
		
		}
}
