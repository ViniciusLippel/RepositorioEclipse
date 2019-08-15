package lista2;

import java.util.Scanner;

public class ex25a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int valor;
		
		System.out.println("Valor do saque: ");
		valor = entrada.nextInt();
		
		if (valor/100>0) {
			System.out.println(valor/100+" notas de R$100");
			valor = valor-((valor/100)*100);
		}
		
		if (valor/50>0) {
			System.out.println(valor/50+" notas de R$50");
			valor = valor-((valor/50)*50);
		}
		
		if (valor/10>0) {
			System.out.println(valor/10+" notas de R$10");
			valor = valor-((valor/10)*10);
		}
		
		if (valor/5>0) {
			System.out.println(valor/5+" notas de R$5");
			valor = valor-((valor/5)*5);
		}
		
		if (valor>0)
			System.out.println(valor+" notas de R$1");
		
		entrada.close();
	}

}
