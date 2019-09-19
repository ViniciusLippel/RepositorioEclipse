package listaRecursividade;

public class Ex4 {
	
	public static int verificarMaior(int[] vet, int maior, int i) {
		if (vet[i]>maior)
			maior = vet[i];
		if (i>0) {
			i--;
			maior = verificarMaior(vet, maior, i);
		}
		return maior;
	}
	
	public static int verificarMenor(int[] vet, int menor, int i) {
		if (vet[i]<menor)
			menor = vet[i];
		if (i>0) {
			i--;
			menor = verificarMenor(vet, menor, i);
		}
		return menor;
	}
	public static void main(String[] args) {
		int[] vet = {2,7,8,3,64,54,567,234,34,7,2,42,};
		int maior = 0, menor = Integer.MAX_VALUE, i = vet.length-1;
		
		System.out.println(verificarMaior(vet, maior, i));
		System.out.println(verificarMenor(vet, menor, i));
	}

}
