package random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int menu=0;
		
		while (menu!=5) {
			System.out.println("\n1- Aleatório \n2- Aleatório em intervalo \n3- Cara ou coroa \n4- Dados \n5- Sair");
			menu = entrada.nextInt();
			Random rand = new Random();
			
			if (menu==1)
				System.out.println(rand.gerarAleatorio());
			
			else if (menu==2) {
				System.out.println("Intervalo entre: ");
				int min = entrada.nextInt();
				int max = entrada.nextInt();
				System.out.println(rand.gerarAleatorioIntervalo(min,max));
			}
			
			else if (menu==3) {
				System.out.print("Numero de jogadas: ");
				int jog = entrada.nextInt();
				System.out.println(rand.caraCoroa(jog));
			}
			
			else if (menu==4) {
				System.out.print("Tamanho do dado (4, 6, 8, 10, 12, 20, 60, 100): ");
				int tam = entrada.nextInt();
				System.out.println(rand.lancarDado(tam));
			}
		}
		
	}

}
