package trabalhoOrdenacao;

import java.util.Random;

public class Ordenacao {
	
	public void randomizar(int[] vet) {
		Random r = new Random();
		for (int i=0; i<vet.length; i++) {
			vet[i] = r.nextInt(100000);
		}
	}
	
	public int[] inverter(int a[], int n) { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
  	} 	
	  
	
	
}

