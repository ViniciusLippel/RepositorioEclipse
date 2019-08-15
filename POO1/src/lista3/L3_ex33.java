package lista3;

import java.util.Scanner;

public class L3_ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double divida, juros=0;
		int parcelas=1;
		
		System.out.print("Valor da dívida: ");
		divida = entrada.nextDouble();
		
		
		System.out.println("Valor da dívida / Valor dos juros / Quantidade de parcelas / Valor da parcela");
		for (int i=0; i<5; i++) {
			System.out.println("R$ "+divida*(1+juros)+"              "+Math.round(divida*juros)+"                "+parcelas+"                             "+(divida*(1+juros))/10);
			if (i==0) {
				juros = 0.1;
				parcelas = parcelas+2;
			}
			else {
				juros = juros+0.05;
				parcelas = parcelas+3;
			}
		}
		
		entrada.close();
	}

}
