package lista3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L3_ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		int temp=0, i=1, media=0, maior, menor;
		
		System.out.println("Temperaturas ºC (digite -300 para finalizar): ");
		while (temp!=-300) {
			System.out.print("Temperatura "+i+": ");
			temp = entrada.nextInt();
			if (temp!=-300) {
				temperaturas.add(temp);
				media = media+temp;
				i++;
			}
		}
		
		media = media/temperaturas.size();
		maior = Collections.max(temperaturas);
		menor = Collections.min(temperaturas);
		
		System.out.println("\nMaior: "+maior+"ºC\nMenor: "+menor+"ºC\nMédia: "+media+"ºC");
		
		entrada.close();
	}

}
