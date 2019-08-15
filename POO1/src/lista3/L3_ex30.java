package lista3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L3_ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner entrada = new Scanner(System.in);
		int alto, baixo, gordo, magro, cod=1, i=1;
		ArrayList<Integer> codigo = new ArrayList<Integer>();
		ArrayList<Double> altura = new ArrayList<Double>();
		ArrayList<Double> peso = new ArrayList<Double>();
		
		System.out.println("Clientes da academia: ");
		while (cod!=0) {
			System.out.println("\nCliente "+i);
			System.out.print("Código: ");
			cod = entrada.nextInt();
			
			if (cod!=0) {
				codigo.add(cod);
				System.out.print("Altura: ");
				altura.add(entrada.nextDouble());
				System.out.print("Peso: ");
				peso.add(entrada.nextDouble());
			}
			i++;
		}
		
		alto = altura.indexOf(Collections.max(altura));
		baixo = altura.indexOf (Collections.min(altura));
		gordo = peso.indexOf (Collections.max(peso));
		magro = peso.indexOf (Collections.min(peso));
		
		System.out.println("\nCliente mais alto: \nCódigo: "+codigo.get(alto)+"\nAltura: "+altura.get(alto)+"\nPeso: "+peso.get(alto));
		System.out.println("\nCliente mais baixo: \nCódigo: "+codigo.get(baixo)+"\nAltura: "+altura.get(baixo)+"\nPeso: "+peso.get(baixo));
		System.out.println("\nCliente mais gordo: \nCódigo: "+codigo.get(gordo)+"\nAltura: "+altura.get(gordo)+"\nPeso: "+peso.get(gordo));
		System.out.println("\nCliente mais magro: \nCódigo: "+codigo.get(magro)+"\nAltura: "+altura.get(magro)+"\nPeso: "+peso.get(magro));
		
		entrada.close();
	}

}
