package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int menu, tamanho, ordem, menor, auxI;
		String auxC;
		
		
		System.out.println("1- Ordenação por inteiros\n2- Ordenação por caracteres");
		menu = entrada.nextInt();
		System.out.print("Tamanho: ");
		tamanho = entrada.nextInt();
		
		
		
		if(menu==1) {
			int[] inte = new int[tamanho];
			System.out.print("Números: ");
			for (int i=0; i<tamanho; i++) {
				inte[i] = entrada.nextInt();
			}
			
			System.out.println("1- Crescente \n2- Decrescente");
			ordem = entrada.nextInt();
			
			if (ordem==1) {
				for (int i=0; i<inte.length-1; i++) {
					menor = i;
					auxI = inte[i];
					for (int j=i+1; j<inte.length; j++) {
						if (inte[j]<auxI) {
							menor = j;
							auxI = inte[j];
						}
					}
					inte[menor] = inte[i];
					inte[i] = auxI;
				}
			}
			
			else if (ordem==2) {
				for (int i=0; i<inte.length-1; i++) {
					menor = i;
					auxI = inte[i];
					for (int j=i+1; j<inte.length; j++) {
						if (inte[j]>auxI) {
							menor = j;
							auxI = inte[j];
						}
					}
					inte[menor] = inte[i];
					inte[i] = auxI;
				}
			}
			
			for (int i=0; i<inte.length; i++)
				System.out.println(inte[i]);
			
		}
		
		else if (menu==2) {
			entrada.nextLine();
			String[] carac = new String[tamanho];
			System.out.print("Caracteres: ");
			for (int i=0; i<tamanho; i++) {
				carac[i] = entrada.nextLine();
			}
			
			System.out.println("1- Crescente \n2- Decrescente");
			ordem = entrada.nextInt();
			
			if (ordem==1) {
				for (int i=0; i<carac.length; i++) {
					menor = i;
					auxC = carac[i];
					for (int j=i+1; j<carac.length; j++) {
						if (carac[i].compareTo(carac[j])>0) {
							menor = j;
							auxC = carac[j];
						}
					}
					carac[menor] = carac[i];
					carac[i] = auxC;
				}
				
			}
			
			else if (ordem==2) {
				for (int i=0; i<carac.length; i++) {
					menor = i;
					auxC = carac[i];
					for (int j=i+1; j<carac.length; j++) {
						if (carac[i].compareTo(carac[j])<0) {
							menor = j;
							auxC = carac[j];
						}
					}
					carac[menor] = carac[i];
					carac[i] = auxC;
				}
			}
			
			for (int i=0; i<carac.length; i++)
				System.out.println(carac[i]);
		}
		
		entrada.close();
		
	}

}
