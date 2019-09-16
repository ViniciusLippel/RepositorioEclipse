package trabalhoOrdenacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = new int[10000];
		Ordenacao o = new Ordenacao();
		
		System.out.println("BUBBLE SORT\nRandomizando vetor...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(o.bubbleSort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(o.bubbleSort(vet)+"ms");
		vet = o.inverter(vet);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(o.bubbleSort(vet)+"ms");
		
		System.out.println("\nINSERTION SORT\nRandomizando vetor...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(o.insertionSort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(o.insertionSort(vet)+"ms");
		vet = o.inverter(vet);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(o.insertionSort(vet)+"ms");
		
		System.out.println("\nSELECTION SORT\nRandomizando...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(o.selectionSort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(o.selectionSort(vet)+"ms");
		vet = o.inverter(vet);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(o.selectionSort(vet)+"ms");
	}

}
