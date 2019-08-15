package lista3;

import java.util.Scanner;

public class L3_ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd;
		double soma=0, media=0;
		
		System.out.print("Quantidade de CDs: ");
		qtd = entrada.nextInt();
		
		double[] valor = new double[qtd];
		System.out.println("Preços: ");
		for (int i=0; i<qtd; i++) {
			System.out.print(i+1+"º CD: R$");
			valor[i] = entrada.nextDouble();
			soma = soma+valor[i];
		}
		
		media = soma/qtd;
		
		System.out.println("Valor total: R$"+soma);
		System.out.println("Valor médio: R$"+media);
		
		entrada.close();
	}

}
