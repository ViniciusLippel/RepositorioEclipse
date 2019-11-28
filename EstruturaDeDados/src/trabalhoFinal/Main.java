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
			System.out.println("3- Analisar processo");
			System.out.println("0- Sair");
			menu = entrada.nextInt();
			entrada.nextLine();
			
			if(menu == 1) {
//				Processo p = new Processo();
//				System.out.print("Descrição: ");
//				p.setDescricao(entrada.nextLine());
//				System.out.println("Finalidade: \n1- A \n2- B \n3- C");
//				int fin = 0;
//				while(fin!=1 && fin!=2 && fin!=3) {
//					fin = entrada.nextInt();
//					entrada.nextLine();
//				}
//				if(fin==1)
//					p.setFinalidade(Finalidade.A);
//				else if(fin==2)
//					p.setFinalidade(Finalidade.B);
//				else if(fin==3)
//					p.setFinalidade(Finalidade.C);
//				
//				filaProcessos.add(p);
//				
//				System.out.println(filaProcessos.getFimFila());
				Processo p = new Processo();
				p.setDescricao("Primerito");
				p.setFinalidade(Finalidade.A);
				filaProcessos.add(p);
				p = new Processo();
				p.setDescricao("Segundito");
				p.setFinalidade(Finalidade.B);
				filaProcessos.add(p);
				p = new Processo();
				p.setDescricao("Tercerito");
				p.setFinalidade(Finalidade.A);
				filaProcessos.add(p);
			}
			
			else if(menu == 2) {
				int tamanho = filaProcessos.tamanho();
				for(int i=0; i<tamanho; i++) {
					Processo atual = filaProcessos.pegarProximo();
					if(atual.getFinalidade() == Finalidade.A)
						pilhaA.add(atual);
					else if(atual.getFinalidade() == Finalidade.B)
						pilhaB.add(atual);
					else if(atual.getFinalidade() == Finalidade.C)
						pilhaC.add(atual);
				}
				System.out.println("Triagem finalizada");
			}
			
			else if(menu == 3) {
				int fin = 0;
				while(fin!=1 && fin!=2 && fin!=3) {
					System.out.println("1- Finalidade A \n2- Finalidade B \n3- Finalidade C");
					fin = entrada.nextInt();
					entrada.nextLine();
				}
				if(fin == 1) {
					if(pilhaA.verificarProxima()!=null)
						System.out.println("Processo a ser analisado: "+pilhaA.verificarProxima().toStringSimple());
					else
						System.out.println("Sem processos");
				}
				else if(fin == 2) {
					if(pilhaB.verificarProxima()!=null)
						System.out.println("Processo a ser analisado: "+pilhaB.verificarProxima().toStringSimple());
					else
						System.out.println("Sem processos");
				}
				else if(fin == 3) {
					if(pilhaC.verificarProxima()!=null)
						System.out.println("Processo a ser analisado: "+pilhaC.verificarProxima().toStringSimple());
					else
						System.out.println("Sem processos");
				}
			}
		}
		entrada.close();
	}
	
	public int escolherMesa() {
		System.out.println("Mesa");
		return 0;
	}

}
