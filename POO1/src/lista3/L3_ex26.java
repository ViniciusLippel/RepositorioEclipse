package lista3;

import java.util.Scanner;

public class L3_ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n_obj = 50;
		double preco;
		
		System.out.print("Pre�o do p�o: R$");
		preco = entrada.nextDouble();
		System.out.println("\nPanificadora P�o de Ontem - Tabela de pre�os:");
		for (int i=1; i<=n_obj; i++) {
			System.out.println(i+" - R$"+i*preco);
		}
		
		entrada.close();
		
	}

}
