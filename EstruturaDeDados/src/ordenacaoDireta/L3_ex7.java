package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd, menor=0, aux, igual=0, menorN=0, maiorN=0, maior=0;
		
		System.out.print("Quantidade: ");
		qtd = entrada.nextInt();
		int[] num = new int[qtd];
		
		System.out.println("Números: ");
		for (int i=0; i<qtd; i++) {
			num[i] = entrada.nextInt();
		}
		
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
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>maior)
				maior = num[i];
		}
		
		for (int i=0; i<num.length; i++) {
			if (num[i]==num[menor])
				menorN++;
			
			if (num[i]==maior)
				maiorN++;
		}
		
		System.out.print("O menor número aparece "+menorN+" vezes, o maior "+maiorN);
		
		entrada.close();
	}

}
