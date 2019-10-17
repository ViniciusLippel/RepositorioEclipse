package lista2;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double sal1, sal2, aum=0;
		
		System.out.print("Salário do colaborador: ");
		sal1 = entrada.nextDouble();
		
		if (sal1<=280) 
			aum = 0.2;
		else if (sal1>280 && sal1<=700)
			aum = 0.15;
		else if (sal1>700 && sal1<=1500)
			aum = 0.1;
		else if (sal1>1500)
			aum = 0.05;
		else
			System.out.println("O número deve ser positivo");
		
		sal2 = sal1*(aum+1);
		System.out.println("Salário atual: R$"+sal1);
		System.out.println("Percentual de aumento: "+aum*100+"%");
		System.out.println("Valor do aumento: R$"+sal1*aum);
		System.out.println("Novo salário: R$"+sal2);
		
		entrada.close();
	}

}
