package lista3;

import java.util.Scanner;

public class L3_ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[][] info = new int[5][3];
		int maior=0, menor=Integer.MAX_VALUE, maior_i=0, menor_i=0, media=0, m_acidentes=0, m_a_soma=0;
		
		System.out.println("Estatistica 5 cidades: ");
		for (int i=0; i<5; i++) {
			System.out.print("\nCódigo da cidade: ");
			info[i][0] = entrada.nextInt();
			System.out.print("Número de veículos de passeio (1999): ");
			info[i][1] = entrada.nextInt();
			System.out.print("Número de acidentes de trânsito com vítimas (1999): ");
			info[i][2] = entrada.nextInt();
			media = media+info[i][1];
			if(info[i][1]<2000) { 
				m_acidentes = m_acidentes+info[i][2];
				m_a_soma++;
			}
			if(info[i][2]>maior) {
				maior = info[i][2];
				maior_i = i+1;
			}
			else if(info[i][2]<menor) {
				menor = info[i][2];
				menor_i = i+1;
			}
		}
		
		media = media/5;
		m_acidentes = m_acidentes/m_a_soma;
		
		System.out.println("\nMaior indice de acidentes: "+maior+" na cidade "+maior_i+"\nMenor indice de acidentes: "+menor+" na cidade "+menor_i);
		System.out.println("Média de veículos nas cidades: "+media);
		System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: "+m_acidentes);
		
		entrada.close();
	}

}
