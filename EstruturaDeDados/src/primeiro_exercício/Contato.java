package primeiro_exercício;
import java.util.Scanner;

public class Contato {
	
	String nome;
	String telefone;
	String email;
	
	static Scanner entrada;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);
		Contato cont[] = new Contato[10];
		
		int numCont = 0;
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("------------------------\n");
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar contatos");
			System.out.println("2 - Listar contatos");
			System.out.println("3 - Sair");
			opcao = Integer.parseInt(entrada.nextLine());
			
			switch (opcao){
				case 1:
					cont[numCont] = new Contato();
					System.out.print("Nome: ");
					cont[numCont].nome = entrada.nextLine();
					System.out.print("Telefone: ");
					cont[numCont].telefone = entrada.nextLine();
					System.out.print("E-mail: ");
					cont[numCont].email = entrada.nextLine();
					numCont++;
					break;
				case 2:
					for (int i=0; i<numCont; i++) {
						System.out.println("------------------------");
						System.out.println("Pessoa "+(i+1)+":");
						System.out.println("Nome: "+cont[i].nome);
						System.out.println("Telefone: "+cont[i].telefone);
						System.out.println("E-mail: "+cont[i].nome+"\n");
						Thread.sleep(2000);
					}
					
					break;
				case 3:
					break;
			}
		}		
	}
}
