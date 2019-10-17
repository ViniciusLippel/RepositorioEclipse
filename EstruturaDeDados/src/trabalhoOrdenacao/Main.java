package trabalhoOrdenacao;

public class Main {

	public static void main(String[] args) {
		int[] vet = new int[100000];
		Ordenacao o = new Ordenacao();
		
		BubbleSort bubble = new BubbleSort();
		System.out.println("BUBBLE SORT\nRandomizando vetor...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(bubble.sort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(bubble.sort(vet)+"ms");
		vet = o.inverter(vet, vet.length-1);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(bubble.sort(vet)+"ms");
		
		InsertionSort insertion = new InsertionSort();
		System.out.println("\nINSERTION SORT\nRandomizando vetor...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(insertion.sort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(insertion.sort(vet)+"ms");
		vet = o.inverter(vet, vet.length-1);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(insertion.sort(vet)+"ms");
		
		SelectionSort selection = new SelectionSort();
		System.out.println("\nSELECTION SORT\nRandomizando...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(selection.sort(vet)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(selection.sort(vet)+"ms");
		vet = o.inverter(vet, vet.length-1);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(selection.sort(vet)+"ms");
		
		MergeSort merge = new MergeSort();
		System.out.println("\nMERGE SORT\nRandomizando...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(merge.sort(vet, 0, vet.length-1)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(merge.sort(vet, 0, vet.length-1)+"ms");
		vet = o.inverter(vet, vet.length-1);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(merge.sort(vet, 0, vet.length-1)+"ms");
		
		QuickSort quick = new QuickSort();
		System.out.println("\nQUICK SORT\nRandomizando...");
		o.randomizar(vet);
		System.out.print("Tempo com vetor aleatório: ");
		System.out.println(quick.sort(vet, 0, vet.length-1)+"ms");
		System.out.print("Tempo com vetor ordenado: ");
		System.out.println(quick.sort(vet, 0, vet.length-1)+"ms");
		vet = o.inverter(vet, vet.length-1);
		System.out.print("Tempo com vetor invertido: ");
		System.out.println(quick.sort(vet, 0, vet.length-1)+"ms");
	}

}
