package bubble_sort;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String menu;
		int t;
		
		System.out.println("1- Inteiro\n2- Caractere");
		menu = entrada.nextLine();
		
		System.out.print("Tamanho: ");
		t = entrada.nextInt();
		
		if (menu.equals("1")) {
			int aux;
			int[] vet = new int[t];
			for (int i=0; i<vet.length; i++) {
				vet[i] = entrada.nextInt();
			}
			
			entrada.nextLine();
			
			System.out.println("1- Crescente\n2- Decrescente");
			menu = entrada.nextLine();
			
			if (menu.equals("1")) {
				for (int j=0; j<vet.length-1; j++) {
					for (int i=0; i<vet.length-1; i++) {
						if (vet[i]>vet[i+1]) {
							aux = vet[i+1];
							vet[i+1] = vet[i];
							vet[i] = aux;
						}
					}
				}
			}
			
			else if(menu.equals("2")) {
				for (int j=0; j<vet.length-1; j++) {
					for (int i=0; i<vet.length-1; i++) {
						if (vet[i]<vet[i+1]) {
							aux = vet[i+1];
							vet[i+1] = vet[i];
							vet[i] = aux;
						}
					}
				}
			}
			for (int i=0; i<vet.length; i++)
				System.out.println(vet[i]);
		}
		
		else if(menu.equals("2")) {
			String aux;
			String[] vet = new String[t];
			for (int i=0; i<vet.length; i++) {
				vet[i] = entrada.nextLine();
			}
			
			System.out.println("1- Crescente\n2- Decrescente");
			menu = entrada.nextLine();
			
			if (menu.equals("1")) {
				for (int j=0; j<vet.length-1; j++) {
					for (int i=0; i<vet.length-1; i++) {
						if (vet[i].compareTo(vet[i+1])>0) {
							aux = vet[i+1];
							vet[i+1] = vet[i];
							vet[i] = aux;
						}
					}
				}
			}
			
			else if(menu.equals("2")) {
				for (int j=0; j<vet.length-1; j++) {
					for (int i=0; i<vet.length-1; i++) {
						if (vet[i].compareTo(vet[i+1])<0) {
							aux = vet[i+1];
							vet[i+1] = vet[i];
							vet[i] = aux;
						}
					}
				}
			}
			for (int i=0; i<vet.length; i++)
				System.out.println(vet[i]);
		}
		
		entrada.close();
	}

}
