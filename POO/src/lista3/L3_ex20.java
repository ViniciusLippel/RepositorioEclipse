package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class L3_ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		double n=0, media=0;
		
		System.out.println("Digite as notas (11 para parar): ");
		
		int x=1;
		while(n!=11) {
			System.out.print("Nota "+x+": ");
			n = entrada.nextDouble();
			if (n>=0 && n<11) {
				notas.add(n);
				x++;
			}
		}
		
		for (int i=0; i<notas.size(); i++) {
			media = media + notas.get(i);
		}
		
		System.out.println("Média "+media/notas.size());
		
		entrada.close();
	}

}
