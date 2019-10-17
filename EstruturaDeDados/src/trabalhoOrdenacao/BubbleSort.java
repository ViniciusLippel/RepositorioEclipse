package trabalhoOrdenacao;

public class BubbleSort {
	
	public long sort(int[] vet) {
		int aux;
		long tempoInicial = System.currentTimeMillis();
		for (int j=0; j<vet.length-1; j++) {
			for (int i=0; i<vet.length-1; i++) {
				if (vet[i]>vet[i+1]) {
					aux = vet[i+1];
					vet[i+1] = vet[i];
					vet[i] = aux;
				}
			}
		}
		long tempoFinal = System.currentTimeMillis();
		return tempoFinal - tempoInicial;
	}
	
}
