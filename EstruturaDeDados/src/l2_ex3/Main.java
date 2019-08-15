package l2_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int anoNasc;
		double renda;
		
		System.out.print("Nome: ");
		nome = entrada.nextLine();
		System.out.print("Ano de nascimento: ");
		anoNasc = entrada.nextInt();
		System.out.print("Renda mensal: ");
		renda = entrada.nextDouble();
		
		Cliente pessoa = new Cliente();
		pessoa.construct(nome, anoNasc, renda);
		pessoa.inserir();
		
		System.out.print("Consultar cliente (indice): ");
		int i = entrada.nextInt();
		pessoa.consultar(i);
		
	}

}
