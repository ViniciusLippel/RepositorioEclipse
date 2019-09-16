package trabalhoOrdenacao;

import java.util.Random;

public class Ordenacao {
	
	public void randomizar(int[] vet) {
		Random r = new Random();
		for (int i=0; i<vet.length; i++) {
			vet[i] = r.nextInt(100000);
		}
	}
	
	public long bubbleSort(int[] vet) {
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
		long tempo = tempoFinal - tempoInicial;
		return tempo;
	}
	
	public long insertionSort(int[] vet) {
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
		long tempo = tempoFinal - tempoInicial;
		return tempo;
	}
	
	public long selectionSort(int[] vet) {
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
		long tempo = tempoFinal - tempoInicial;
		return tempo;
	}
	
	public int[] inverter(int[] vet) {
		int aux;
		for (int i=0; i<vet.length; i++) {
			aux = vet[i];
			int pos = i;
			while (pos>0 && aux<vet[pos-1]) {
				vet[pos] = vet[pos-1];
				pos = pos-1;
			}
			vet[pos] = aux;
		}
		return vet;
	}
}
