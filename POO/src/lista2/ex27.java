package lista2;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n1,n2,re=0;
		char op;
		
		System.out.print("numero 1:");
		n1 = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.print("Operação (+, -, /, ou *):");
		op = entrada.next().charAt(0);
		
		System.out.print("Numero 2: ");
		n2 = entrada.nextDouble();
	
		if(op=='+')
			re = n1+n2;
		else if(op=='-')
			re = n1-n2;
		else if(op=='/')
			re = n1/n2;
		else if(op=='*')
			re = n1*n2;
		else
			System.out.println("Operação inválida");
		
		System.out.println(n1+" "+op+" "+n2+" = "+re);
		
		if(re%2==0)
			System.out.println("Par");
		else
			System.out.println("Ímpar");
		
		if(re>0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo");
		
		if(re == Math.round(re))
			System.out.println("Inteiro");
		else
			System.out.println("Decimal");
		
		entrada.close();
	}

}
