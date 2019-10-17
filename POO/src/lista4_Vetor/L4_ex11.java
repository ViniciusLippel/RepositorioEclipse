package lista4_Vetor;

import java.util.Scanner;

public class L4_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String data;
		int[] dataInt = new int[3];
		
		System.out.print("Digite uma data (dd/mm/aaaa): ");
		data = entrada.nextLine();
		
		
		String[] vetorData = data.split("/");
		
		
		
		for (int i=0; i<3; i++)
			dataInt[i] = Integer.parseInt(vetorData[i]);
		
		System.out.println("Dia: "+dataInt[0]+"\nMês: "+dataInt[1]+"\nAno: "+dataInt[2]);
		
		entrada.close();
	}

}
