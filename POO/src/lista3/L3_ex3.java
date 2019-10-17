package lista3;

import java.util.Scanner;

public class L3_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome, sexo, e_civil;
		int idade;
		double sal;
		
		do {
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			if(nome.length()<=3)
				System.out.println("Nome deve conter mais de 3 caracteres");
		}while(nome.length()<=3);
		
		do {
			System.out.print("Idade: ");
			idade = entrada.nextInt();
			if(idade<0 || idade>150)
				System.out.println("Idade inválida");
		}while(idade<0 || idade>150);
		
		do {
			System.out.print("Salário: ");
			sal = entrada.nextDouble();
			if(sal<=0)
				System.out.println("Salário inválido");
		}while(sal<=0);
		
		entrada.nextLine();
		
		System.out.print("Sexo (F/M): ");
		sexo = entrada.nextLine();
		
		while(!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo)) {
				System.out.println("Sexo inválido");
				sexo = entrada.nextLine();
		}
		
		
		System.out.print("Estado Civil (S/C/V/D): ");
		e_civil = entrada.nextLine();
		
		while(!"s".equalsIgnoreCase(e_civil) && !"c".equalsIgnoreCase(e_civil) && !"v".equalsIgnoreCase(e_civil) && !"d".equalsIgnoreCase(e_civil)) {
			System.out.println("Estado civil inválido");
			e_civil = entrada.nextLine();
		}
		
		System.out.println("Nome: "+nome+"; Idade: "+idade+"; Salário: "+sal+"; Sexo: "+sexo+"; Estado civil: "+e_civil);
		
		entrada.close();
	}

}
