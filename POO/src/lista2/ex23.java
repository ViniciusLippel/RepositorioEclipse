package lista2;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] idades = new int[3];
		int media=0;
		
		for(int i=0; i<3; i++) {
			System.out.print("Idade do aluno "+(i+1)+": ");
			idades[i] = entrada.nextInt();
			media = media+idades[i];
		}
		media = media/3;
		
		if (media<25)
			System.out.println("Turma jovem");
		else if(media>=25 && media <=40)
			System.out.println("Turma adulta");
		else
			System.out.println("Turma idosa");
		
		entrada.close();
	}

}
