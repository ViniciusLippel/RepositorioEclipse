package lista2;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double ma, mo, soma, preco;
		
		System.out.print("Quilos de maçã: ");
		ma = entrada.nextDouble();
		System.out.print("Quilos de morango: ");
		mo = entrada.nextDouble();
		
		soma = ma+mo;
		if (soma>5) {
			preco = (ma*2.2)+(mo*1.5);
			if (soma>8 || preco>25)
				preco = preco*0.9;
		}
		else
			preco = (ma*2.5)+(mo*1.8);
		
		System.out.println("Valor a ser pago: R$"+preco);
		
		entrada.close();
	}

}
