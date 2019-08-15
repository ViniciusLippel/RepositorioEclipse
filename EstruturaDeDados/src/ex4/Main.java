package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o número: ");
		num = entrada.nextInt();
		int vrf = Verificador.verificar(num);
		
		System.out.println("Número verificador: "+vrf);
		entrada.close();
	}

}
