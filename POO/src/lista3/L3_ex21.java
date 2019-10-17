package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class L3_ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> idades = new ArrayList<Integer>();
		int n=0, media=0;
		
		System.out.println("Digite a idade (-1 para sair): ");
		
		int x=1;
		while(n!=-1) {
			System.out.print("Pessoa "+x+": ");
			n = entrada.nextInt();
			if (n>=0 && n<150) {
				idades.add(n);
				x++;
			}
		}
		
		for (int i=0; i<idades.size(); i++) {
			media = media + idades.get(i);
		}
		
		media = media/idades.size();
		System.out.println("\nMédia de idade "+media);
		
		if (media>=0 && media<=25)
			System.out.println("Turma jovem");
		else if (media>=26 && media<=60)
			System.out.println("Turma adulta");
		else
			System.out.println("Turma idosa");
		
		entrada.close();
	}

}
