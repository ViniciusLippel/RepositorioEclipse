package lista2;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char p1=' ',p2=' ',p3=' ',p4=' ',p5=' ';
		int soma=0;
		
		while(p1!='s' && p1!='n') {
			System.out.println("Telefonou para a vítima?");
			p1 = entrada.next().toLowerCase().charAt(0);
			if(p1=='s')
				soma++;
		}
		
		while(p2!='s' && p2!='n') {
			System.out.println("Esteve no local do crime?");
			p2 = entrada.next().toLowerCase().charAt(0);
			if(p2=='s')
				soma++;
		}
	
		
		while(p3!='s' && p3!='n') {
			System.out.println("Mora perto da vítima?");
			p3 = entrada.next().toLowerCase().charAt(0);
			if(p3=='s')
				soma++;
		}
		
		while(p4!='s' && p4!='n') {
			System.out.println("Devia para a vítima?");
			p4 = entrada.next().toLowerCase().charAt(0);
			if(p4=='s')
				soma++;
		}
		
		
		while(p5!='s' && p5!='n') {
			System.out.println("Já trabalhou com a vítima?");
			p5 = entrada.next().toLowerCase().charAt(0);
			if(p5=='s')
				soma++;
		}
		
		if(soma==2)
			System.out.println("Suspeito");
		else if(soma==3 || soma==4)
			System.out.println("Cúmplice");
		else if(soma==5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");
		
		entrada.close();
	}

}
