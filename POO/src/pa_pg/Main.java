package pa_pg;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Progressao prog = new Progressao();
		int menu = 1;
		
		while(menu!=0) {
			System.out.println("\nMENU \n1-Criar progressao \n2-Ler arquivo \n0-Sair");
			menu = entrada.nextInt();
			entrada.nextLine();
			
			if(menu==1) {
				System.out.println("Criando PA/PG");
				System.out.print("Valor de a1: ");
				prog.setA1(entrada.nextInt());
				System.out.print("Razao: ");
				prog.setRazao(entrada.nextInt());
				System.out.print("Quantidade de elementos: ");
				prog.setQuantidade(entrada.nextInt());
				System.out.println("Tipo: \n1-PA \n2-PG");
				int x=0;
				while(x!=1 && x!=2) {
					x = entrada.nextInt();
					entrada.nextLine();
					if(x==1)
						prog.setTipo(TipoProgressao.PA);
					else
						prog.setTipo(TipoProgressao.PG);
				}
				System.out.print("Nome do arquivo: ");
				prog.gravar(entrada.nextLine());
			}
			
			else if(menu==2) {
				prog = new Progressao();
				System.out.print("Nome do arquivo: ");
				String nome = entrada.nextLine();
				if(prog.construir(prog.ler(nome))) {
					System.out.println("Progress�o: "+prog.strProgressao());
					System.out.println("A1: "+prog.getA1());
					System.out.println("Raz�o: "+prog.getRazao());
					System.out.println("Quantidade: "+prog.getQuantidade());
					System.out.println("Tipo: "+prog.getTipo());
					System.out.println("Somat�ria: "+prog.somatoria());
					System.out.println("M�dia: "+prog.media());
					System.out.println("Mediana: "+prog.mediana());
					System.out.println("Gr�fico criado como "+nome+".html");
					GraficoLinha gl = new GraficoLinha();
					gl.montarGrafico(prog.ler(nome), nome);
				}
				else {
					System.out.println("\nProgress�o alterada!");
					System.out.println("Esta progress�o est� "+(Math.round((1-prog.porcentagemAlteracao(prog.ler(nome)))*100))+"% errada");
				}
			}
		}
		
		entrada.close();
	}

}
