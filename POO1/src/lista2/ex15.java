package lista2;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double preco;
		int cod;
		String[] reg = {"Sul", "Norte", "Leste", "Oeste", "Nordeste", "Nordeste", "Centro-oeste", "Centro-oeste"};
		
		System.out.print("Pre�o: R$");
		preco = entrada.nextDouble();
		
		System.out.print("C�digo de origem: ");
		cod = entrada.nextInt();
		
		System.out.println("Pre�o: R$"+preco);
		
		if (cod>=1 && cod<=8)
			System.out.println("Regi�o: "+reg[cod-1]);
		else
			System.out.println("Importado");
		
		entrada.close();
	}

}
