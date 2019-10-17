package lista1;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double val, hr, bruto=0, liquido=0;
		
		System.out.print("Valor por hora: ");
		val = entrada.nextDouble();
		System.out.print("Horas por mês: ");
		hr = entrada.nextDouble();
		
		bruto = val*hr;
		liquido = bruto;
		System.out.println("Bruto: "+bruto);
		if (bruto>900 && bruto<=1500) {
			liquido = liquido-(bruto*0.05);
			System.out.println("(-)IR: R$"+bruto*0.05);
		}
		else if (bruto>1500 && bruto<=2500) {
			liquido = liquido-(bruto*0.1);
			System.out.println("(-)IR: R$"+bruto*0.1);
		}
		else {
			liquido = liquido-(bruto*0.2);
			System.out.println("(-)IR: R$"+bruto*0.2);
		}
		
		liquido = liquido-(bruto*0.1);
		System.out.println("(-)INSS: R$"+bruto*0.1);
		
		System.out.println("FGTS: R$"+bruto*0.11);
		
		System.out.println("Total de descontos: R$"+(bruto-liquido));
		
		System.out.println("Salário liquido: R$"+liquido);
		
		entrada.close();
	}

}
