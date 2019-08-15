package lista2;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String tipo, tipo_pagamento;
		double quant, valor=0,preco_desc=0;
		
		System.out.print("Tipo: ");
		tipo = entrada.nextLine().toLowerCase();
		System.out.print("Quantidade: ");
		quant = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Tipo de pagamento: ");
		tipo_pagamento = entrada.nextLine();
		
		if(quant>5) {
			if (tipo.intern()=="file")
				valor = quant*5.8;
			else if(tipo.intern() == "alcatra")
				valor = quant*6.8;
			else if(tipo.intern() == "picanha")
				valor = quant*7.8;
			else
				System.out.println("Não esta funcionando:"+tipo);
		}
		
		else {
			if (tipo.intern()=="file")
				valor = quant*4.9;
			else if(tipo.intern() == "Alcatra")
				valor = quant*5.9;
			else if(tipo.intern() == "Picanha")
				valor = quant*6.9;
		}
		
		if (tipo_pagamento.intern() == "cartão tabajara")
			preco_desc = valor*0.95;
		
		System.out.println("Tipo: "+tipo);
		System.out.println("Quantidade "+quant+" Kg");
		System.out.println("Preco total: R$"+valor);
		System.out.println("Tipo de pagamento: "+tipo_pagamento);
		System.out.println("Valor do desconto: R$"+(Math.round(valor-preco_desc)));
		System.out.println("Valor a pagar: R$"+preco_desc);
		
		entrada.close();
	}

}
