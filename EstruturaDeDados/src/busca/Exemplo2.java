package busca;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {1,5,7,9,14,16,17,25,28,32,44,56};
		int fim, i, x, j=0;
		boolean valida = false;
		
		x=25;
		fim = vet.length-1;
		i = fim/2;
		if(x>=vet[0] && x<=vet[vet.length-1]) {
			while (valida == false) {
				if (vet[i]==x) {
					valida = true;
					System.out.println(i);
				}
				else if(vet[i]<x) {
					fim = i+1;
				}
				else if(vet[i]>x){
					fim = i-1;
				}
				if(j>vet.length/2) {
					System.out.println("Número inexistente no vetor");
					break;
				}
				j++;
			}
		}
		else
			System.out.println("Número inexistente no vetor");
		
		
	}

}
