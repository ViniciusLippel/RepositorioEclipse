package insertion_sort;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {3,1,4,1,5,9,2,6,5,4};
		int aux, pos=0;
		
		for (int i=0; i<vet.length; i++) {
			aux = vet[i];
			pos = i;
			while (pos>0 && aux<vet[pos-1]) {
				vet[pos] = vet[pos-1];
				pos = pos-1;
			}
			vet[pos] = aux;
		}
		
		for(int i=0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

}
