package lista4_Vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class L4_ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> nome = new ArrayList<String>(), telefone = new ArrayList<String>(),
		celular = new ArrayList<String>(), email = new ArrayList<String>(), dataNasc = new ArrayList<String>(),
		aniverMes = new ArrayList<String>(), dataAniverMes = new ArrayList<String>();
		int menu=0, consulta=0, indice, mesCons;
		String nomeCons;
		
		while (menu!=3) {
			System.out.println("\nMENU \n1- Adicionar contato. \n2- Consultar Contatos. \n3- Sair");
			menu = entrada.nextInt();
			entrada.nextLine();
			
			if (menu==1) {
				System.out.print("\nNome: ");
				nome.add(entrada.nextLine());
				System.out.print("Telefone: ");
				telefone.add(entrada.nextLine());
				System.out.print("Celular: ");
				celular.add(entrada.nextLine());
				System.out.print("E-mail: ");
				email.add(entrada.nextLine());
				System.out.print("Data de nascimento (DD/MM/AAAA): ");
				dataNasc.add(entrada.nextLine());
			
			}
			
			else if (menu==2) {
				System.out.println("\n1- Consulta por nome \n2- Consulta por mês de aniversário ");
				consulta = entrada.nextInt();
				entrada.nextLine();
				
				if (consulta==1) {
					indice = -1;
					System.out.print("\nNome: ");
					nomeCons = entrada.nextLine();
					
					int i=0;
					while (i<nome.size() && indice==-1) {
						if (nomeCons.equalsIgnoreCase(nome.get(i)))
							indice = i;
						i++;
					}
					
					if (indice != -1) {
						System.out.println("\nNome: "+nome.get(indice));
						System.out.println("Telefone: "+telefone.get(indice));
						System.out.println("Celular: "+celular.get(indice));
						System.out.println("E-mail: "+email.get(indice));
						System.out.println("Data de nascimento: "+dataNasc.get(indice));
					}
					else
						System.out.println("Contato inexistente");
					
				}
				
				else if (consulta==2) {
					indice = -1;
					System.out.println("\nMes: ");
					mesCons = entrada.nextInt();
				
					for (int i=0; i<dataNasc.size(); i++) {
						if (mesCons == Integer.parseInt(dataNasc.get(i).substring(3,5))) {
							aniverMes.add(nome.get(i));
							dataAniverMes.add(dataNasc.get(i));
						}
					}
					
					System.out.println("\nAniversariantes do mês "+mesCons+": ");
					for (int i=0;i<aniverMes.size(); i++) {
						System.out.println("Nome: "+aniverMes.get(i)+" / "
								+ "Data de nascimento: "+dataAniverMes.get(i));
					}
				}
			}
				
			
		}
		
		entrada.close();
	}

}
