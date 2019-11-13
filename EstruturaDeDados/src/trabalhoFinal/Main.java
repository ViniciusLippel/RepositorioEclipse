package trabalhoFinal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Fila filaProcessos = new Fila();
		Pilha pilhaA = new Pilha(), pilhaB = new Pilha(), pilhaC = new Pilha();
		int menu = 1;
		
		while(menu!=0) {
			System.out.println("\nMENU");
			System.out.println("1- Chegada de processo");
			System.out.println("2- Triagem de processos");
			System.out.println("3- Pegar processo");
			System.out.println("0- Sair");
			menu = entrada.nextInt();
			entrada.nextLine();
			
			if(menu == 1) {
				Processo p = new Processo();
				System.out.print("Descrição: ");
				p.setDescricao(entrada.nextLine());
				System.out.println("Finalidade: \n1- A \n2- B \n3- C");
				int fin = 0;
				while(fin!=1 && fin!=2 && fin!=3) {
					fin = entrada.nextInt();
					entrada.nextLine();
				}
				if(fin==1)
					p.setFinalidade(Finalidade.A);
				else if(fin==2)
					p.setFinalidade(Finalidade.B);
				else if(fin==3)
					p.setFinalidade(Finalidade.C);
				
				filaProcessos.add(p);
			}
			
			else if(menu == 2) {
				for(int i=0; i<filaProcessos.tamanho(); i++) {
					if(filaProcessos.getElemento(i).getFinalidade() == Finalidade.A)
//						System.out.println("inserindo em A");
						pilhaA.add(filaProcessos.getElemento(i));
					else if(filaProcessos.getElemento(i).getFinalidade() == Finalidade.B)
						pilhaB.add(filaProcessos.getElemento(i));
//						System.out.println("inserindo em B");
					else if(filaProcessos.getElemento(i).getFinalidade() == Finalidade.C)
						pilhaC.add(filaProcessos.getElemento(i));
//						System.out.println("inserindo em C");
//					System.out.println("teste"+1);
				}
				System.out.println("Triagem finalizada");
			}
			
			else if(menu == 3) {
				
			}
		}
		
		System.out.println(filaProcessos.toString());
		
		entrada.close();
	}

}
