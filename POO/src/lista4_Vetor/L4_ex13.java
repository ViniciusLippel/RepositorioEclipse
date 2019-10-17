package lista4_Vetor;

import java.util.Scanner;

public class L4_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int n = 5; 
		int[] idade = new int[n];
		double[] altura = new double[n];
		int velho=0, novo=Integer.MAX_VALUE, idadeAlto=0, idadeBaixo=0;
		double alto=0, baixo=Double.MAX_VALUE, alturaVelho=0, alturaNovo=0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Pessoa "+(i+1)+": \nIdade:");
			idade[i] = entrada.nextInt();
			System.out.print("Altura: ");
			altura[i] = entrada.nextDouble();
			
			if (idade[i]>velho) {
				velho = idade[i];
				alturaVelho = altura[i];
			}
			else if (idade[i]<novo) {
				novo = idade[i];
				alturaNovo = altura[i];
			}
			
			if (altura[i]>alto) {
				alto = altura[i];
				idadeAlto = idade[i];
			}
			else if (altura[i]<baixo) {
				baixo = altura[i];
				idadeBaixo = idade[i];
			}
		}
		
		for (int i=n-11; i>=0; i--) {
			System.out.print("\nPessoa "+(i+1)+": \nIdade:"+idade[i]);
			System.out.print("Altura: "+altura[i]);
		}
		
		System.out.println("\nMais velho \nidade: "+velho+"\nAltura: "+alturaVelho);
		System.out.println("\nMais novo \nidade: "+novo+"\nAltura: "+alturaNovo);
		System.out.println("\nMais alto \naltura: "+alto+"\nIdade: "+idadeAlto);
		System.out.println("\nMais baixo \naltura: "+baixo+"\nIdade: "+idadeBaixo);
		
		entrada.close();
	}

}
