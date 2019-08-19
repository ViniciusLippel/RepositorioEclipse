package l3_ex5;

public class Ordenacao {
	
	public void OrdenarString(int ordem, String[] str) {
		if (ordem==1) {
			int menor;
			String aux;
			
			for (int i=0; i<str.length; i++) {
				menor = i;
				aux = str[i];
				for (int j=i+1; j<str.length; j++) {
					if (str[i].compareTo(str[j])>0) {
						menor = j;
						aux = str[j];
					}
				}
				str[menor] = str[i];
				str[i] = aux;
			}
			
			for (int i=0; i<str.length; i++)
				System.out.println(str[i]);
			
		}
		
		else if (ordem==2) {
			int menor;
			String aux;
			
			for (int i=0; i<str.length; i++) {
				menor = i;
				aux = str[i];
				for (int j=i+1; j<str.length; j++) {
					if (str[i].compareTo(str[j])<0) {
						menor = j;
						aux = str[j];
					}
				}
				str[menor] = str[i];
				str[i] = aux;
			}
			
			for (int i=0; i<str.length; i++)
				System.out.println(str[i]);
		
		}
	}
	
	public void OrdenarInt(int ordem, int[] num) {
		
		if(ordem==1) {
			int aux, menor;
			
			System.out.println("\nOrdem crescente: ");
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
		
		else if(ordem==2) {
			int aux, menor;
			
			System.out.println("\nOrdem decrescente: ");
			for (int i=0; i<num.length-1; i++) {
				menor = i;
				aux = num[i];
				for (int j=i+1; j<num.length; j++) {
					if (num[j]>aux) {
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
	

}
