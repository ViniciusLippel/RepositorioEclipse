package trabalhoOrdenacao;

public class SelectionSort {
	
	public long sort(int[] vet) {
		int aux, menor;
		long tempoInicial = System.currentTimeMillis();
		for (int i=0; i<vet.length-1; i++) {
			menor = i;
			aux = vet[i];
			for (int j=i+1; j<vet.length; j++) {
				if (vet[j]<aux) {
					menor = j;
					aux = vet[j];
				}
			}
			vet[menor] = vet[i];
			vet[i] = aux;
		}
		long tempoFinal = System.currentTimeMillis();
		return tempoFinal - tempoInicial;
	}
	
}
