package lista3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L3_ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char outro='s', resposta;
		char[] correto = {'a', 'b', 'c', 'd','e','e','d','c','b','a'};
		int nAlunos=0, media=0;
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		while (outro=='s') {
			int total=0;
			System.out.println("\nGabarito: ");
			for (int i=1; i<=10; i++) {
				System.out.print("Questão "+i+": ");
				resposta = entrada.next().toLowerCase().charAt(0);
				if (resposta==correto[i-1]) {
					total++;
				}
			}
			notas.add(total);
			media = media+total;
			nAlunos++;
			System.out.print("Mais algum aluno utilizará o programa? (s/n) ");
			outro = entrada.next().toLowerCase().charAt(0);
			
		}
		
		media = media/notas.size();
		
		System.out.println("\nMaior acerto: "+Collections.max(notas)+"\nMenor acerto: "+Collections.min(notas)+"\nTotal de alunos: "+nAlunos+"\nMedia: "+media);
		
		entrada.close();
	}

}
