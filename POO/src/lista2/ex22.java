package lista2;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n, cent, dez, uni;
		
		System.out.print("Digite um número positivo menor que 1000: ");
		n = entrada.nextInt();
		
		if (n>=0 && n<1000) {
			cent = n/100;
			n = n-cent*100;
			dez = n/10;
			n = n-dez*10;
			uni = n;
			
			System.out.println("Centenas:"+cent+"\nDezenas:"+dez+"\nUnidades:"+uni);
		}
		else
			System.out.println("O valor deve ser positivo e menor que 1000");
		
		entrada.close();
	}

}
