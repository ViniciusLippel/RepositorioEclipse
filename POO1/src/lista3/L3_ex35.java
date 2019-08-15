package lista3;

import java.util.Scanner;

public class L3_ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int cod=0, qtd;
		double total=0;
		final double p100=1.2, p101=1.3, p102=1.5, p103=1.2, p104=1.3, p105=1;
		
		System.out.println("Lanchonete Pouca Fome (Digite negativo para encerrar:");
		while (cod>=0) {
			System.out.print("Código: ");
			cod = entrada.nextInt();
			if (cod>=100 && cod<=105) {
				System.out.print("Quantidade: ");
				qtd = entrada.nextInt();
				if (cod==100)
					total = total+(p100*qtd);
				else if (cod==101)
					total = total+(p101*qtd);
				else if (cod==102)
					total = total+(p102*qtd);
				else if (cod==103)
					total = total+(p103*qtd);
				else if (cod==104)
					total = total+(p104*qtd);
				else if (cod==105)
					total = total+(p105*qtd);
				
			}
			else if (cod>=0)
				System.out.println("Lanche indisponível");
		}
		
		System.out.println("\nPreço total: R$ "+total);
		
		entrada.close();
	}

}
