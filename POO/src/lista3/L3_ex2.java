package lista3;

import java.util.Scanner;

public class L3_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome, senha;
		
		do {
			System.out.print("Nome de usu�rio: ");
			nome = entrada.nextLine();
			System.out.print("Senha: ");
			senha = entrada.nextLine();
			if (nome.equalsIgnoreCase(senha))
				System.out.println("A senha n�o pode ser igual ao nome de usu�rio.");
		}while(nome.equalsIgnoreCase(senha));
		
		System.out.println("Usu�rio: "+nome+"\nSenha: "+senha);
		
		entrada.close();
	}

}
