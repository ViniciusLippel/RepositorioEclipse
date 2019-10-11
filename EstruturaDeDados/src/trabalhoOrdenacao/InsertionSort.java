package trabalhoOrdenacao;

public class InsertionSort {
	
	public long sort(int[] vet) {
		int aux;
		long tempoInicial = System.currentTimeMillis();
		for (int i=0; i<vet.length; i++) {
			aux = vet[i];
			int pos = i;
			while (pos>0 && aux<vet[pos-1]) {
				vet[pos] = vet[pos-1];
				pos = pos-1;
			}
			vet[pos] = aux;
		}
		long tempoFinal = System.currentTimeMillis();
		return tempoFinal - tempoInicial;
	}
	
}
