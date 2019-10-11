package lista2;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.print("1ª nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("2ª nota: ");
		n2 = entrada.nextDouble();
		
		System.out.print("3ª nota: ");
		n3 = entrada.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		if (media>=7 && media<=10) {
			System.out.println("Media: "+media);
			System.out.print("Aprovado");
			if (media==10) {
				System.out.print(" com distinção");
			}
		}
		else if (media<7 && media>=0)
			System.out.println("Reprovado");
		else
			System.out.println("Notas inválidas");
		
		
		entrada.close();
	}

}
