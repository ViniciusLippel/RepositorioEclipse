package lista3;

import java.util.Scanner;

public class L3_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome, senha;
		
		do {
			System.out.print("Nome de usuário: ");
			nome = entrada.nextLine();
			System.out.print("Senha: ");
			senha = entrada.nextLine();
			if (nome.equalsIgnoreCase(senha))
				System.out.println("A senha não pode ser igual ao nome de usuário.");
		}while(nome.equalsIgnoreCase(senha));
		
		System.out.println("Usuário: "+nome+"\nSenha: "+senha);
		
		entrada.close();
	}

}
