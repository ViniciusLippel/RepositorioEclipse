package lista3;

import java.util.Scanner;

public class L3_ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd, soma=0, menor=0, maior=0;
		
		System.out.print("Quantidade: ");
		qtd = entrada.nextInt();
		
		int[] num = new int[qtd];
		
		System.out.println(qtd+" números: ");
		for (int i=0; i<qtd; i++) {
			num[i] = entrada.nextInt();
			soma = soma + num[i];
			if(i==0)
				menor = num[i];
			if(num[i]<menor)
				menor = num[i];
			if(num[i]>maior)
				maior = num[i];
		}
		
		System.out.println("Maior: "+maior+"; Menor: "+menor+"; Soma: "+soma);
		
		entrada.close();
	}

}
