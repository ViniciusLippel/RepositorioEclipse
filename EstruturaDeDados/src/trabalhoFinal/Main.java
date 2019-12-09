package trabalhoFinal;

import java.util.Scanner;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila filaProcessos = new Fila();
		Pilha pilhaA = new Pilha(), pilhaB = new Pilha(), pilhaC = new Pilha();
		int menu = 1;
		ListaEncadeada mesas = new ListaEncadeada();
		FilaFuncionarios filaFuncionarios = new FilaFuncionarios();
		int processosFechados = 0, pfA = 0, pfB = 0, pfC = 0;
		
		for(int i=0; i<3; i++) {
			mesas.add(new Mesa());
		}
		
		Funcionario f = new Funcionario();
		f.setNome("Junior");
		filaFuncionarios.add(f);
		f = new Funcionario();
		f.setNome("Judas");
		filaFuncionarios.add(f);
		f = new Funcionario();
		f.setNome("Jonatan");
		filaFuncionarios.add(f);
		
		while(menu!=0) {
			System.out.println("\nMENU");
			System.out.println("1- Chegada de processo");
			System.out.println("2- Triagem de processos");
			System.out.println("3- Analisar processo");
			System.out.println("4- Finalizar analise de processo");
			System.out.println("5- Estatísticas");
			System.out.println("0- Sair");
			menu = entrada.nextInt();
			entrada.nextLine();
			
			if(menu == 1) {
				//Codigo correto
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
				
				// Codigo para testes
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
					if(pilhaA.verificarProxima()!=null) {
						System.out.println("Processo a ser analisado: "+pilhaA.verificarProxima().toStringSimple());
						System.out.println("Funcionario designado: "+filaFuncionarios.getInicioFila().toStringSimple());
						int mesa = escolherMesa(mesas)-1;
						mesas.get(mesa).setProcesso(pilhaA.proxima());
						mesas.get(mesa).getProcesso().setProximo(null);
						mesas.get(mesa).setFuncionario(filaFuncionarios.pegarProximo());
						mesas.get(mesa).getFuncionario().setProximo(null);
					}
					else {
						System.out.println("Sem processos");
					}
				}
				else if(fin == 2) {
					if(pilhaB.verificarProxima()!=null) {
						System.out.println("Processo a ser analisado: "+pilhaB.verificarProxima().toStringSimple());
						System.out.println("Funcionario designado: "+filaFuncionarios.getInicioFila().toStringSimple());
						int mesa = escolherMesa(mesas)-1;
						mesas.get(mesa).setProcesso(pilhaA.proxima());
						mesas.get(mesa).getProcesso().setProximo(null);
						mesas.get(mesa).setFuncionario(filaFuncionarios.pegarProximo());
						mesas.get(mesa).getFuncionario().setProximo(null);
					}
					else
						System.out.println("Sem processos");
				}
				else if(fin == 3) {
					if(pilhaC.verificarProxima()!=null) {
						System.out.println("Processo a ser analisado: "+pilhaC.verificarProxima().toStringSimple());
						System.out.println("Funcionario designado: "+filaFuncionarios.getInicioFila().toStringSimple());
						int mesa = escolherMesa(mesas)-1;
						mesas.get(mesa).setProcesso(pilhaA.proxima());
						mesas.get(mesa).getProcesso().setProximo(null);
						mesas.get(mesa).setFuncionario(filaFuncionarios.pegarProximo());
						mesas.get(mesa).getFuncionario().setProximo(null);
					}
					else
						System.out.println("Sem processos");
				}
			}
			else if(menu == 4) {
				System.out.println("Escolha uma mesa para finalizar a analise: ");
				for(int i=0; i<mesas.tamanho(); i++) {
					if(mesas.get(i).emUso()) {
						System.out.println("Mesa "+(i+1));
					}
				}
				int x = entrada.nextInt();
				System.out.println("Analise do processo "+mesas.get(x-1).getProcesso().getDescricao()+" por "+mesas.get(x-1).getFuncionario().getNome()+" finalizada");
				if(mesas.get(x-1).getProcesso().getFinalidade() == Finalidade.A)
					pfA++;
				else if(mesas.get(x-1).getProcesso().getFinalidade() == Finalidade.B)
					pfB++;
				else if(mesas.get(x-1).getProcesso().getFinalidade() == Finalidade.C)
					pfC++;
				mesas.get(x-1).setFuncionario(null);
				mesas.get(x-1).setProcesso(null);
				processosFechados++;
			}
			
			else if(menu == 5) {
				int mesasEmUso = 0;
				for(int i=0; i<mesas.tamanho(); i++)
					if(mesas.get(i).emUso())
						mesasEmUso++;
				System.out.println("Número de funcionários na fila para analisar processo: "+filaFuncionarios.tamanho());
				System.out.println("Numero de funcionários analisando processos: "+mesasEmUso);
				System.out.println("Número de processos fechados: "+processosFechados);
				System.out.println("Processos fechados por finalidade: ");
				System.out.println("A: "+pfA);
				System.out.println("B: "+pfB);
				System.out.println("C: "+pfC);
				System.out.println("Processos nas pilhas: ");
				System.out.println("Pilha A: "+pilhaA.tamanho());
				System.out.println("Pilha B: "+pilhaB.tamanho());
				System.out.println("Pilha C: "+pilhaC.tamanho());
				System.out.println("Numero de mesas disponíveis: "+(mesas.tamanho()-mesasEmUso));
			}
		}
	}
	
	public static int escolherMesa(ListaEncadeada mesas) {
		System.out.println("Escolha uma das mesas disponíveis:");
		for(int i=0; i<mesas.tamanho(); i++) {
			if(!mesas.get(i).emUso()) {
				System.out.println("Mesa "+(i+1));
			}
		}
		int x = entrada.nextInt();
		return x;
	}
	
}
