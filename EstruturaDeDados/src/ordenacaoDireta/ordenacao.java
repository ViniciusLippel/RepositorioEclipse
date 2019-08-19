package ordenacaoDireta;

public class ordenacao {

	public static void main(String[] args) {
		int [] num = {23,4,33,45,19,12,28,40};
		int aux, menor;
		
		for (int i=0; i<num.length-1; i++) {
			menor = i;
			aux = num[i];
			for (int j=i+1; j<num.length; j++) {
				if (num[j]<aux) {
					menor = j;
					aux = num[j];
				}
			}
			num[menor] = num[i];
			num[i] = aux;
		}
		
		for (int i=0; i<num.length; i++)
			System.out.println(num[i]);

	}

}
