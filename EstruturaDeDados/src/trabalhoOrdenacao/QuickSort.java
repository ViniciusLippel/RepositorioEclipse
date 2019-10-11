package trabalhoOrdenacao;

public class QuickSort {
	public long sort(int[] arr, int low, int high) {
		long ti = System.currentTimeMillis();
		if (arr == null || arr.length == 0)
			return 0;
 
		if (low >= high)
			return 0;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			sort(arr, low, j);
 
		if (high > i)
			sort(arr, i, high);
		long tf = System.currentTimeMillis();
		return tf-ti;
	}
	
}
