package lista1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double ganho, horas, sal;
		
		System.out.print("Ganho por hora: ");
		ganho = entrada.nextDouble();
		
		System.out.print("Horas trabalhadas por m�s: ");
		horas = entrada.nextDouble();
		
		sal = ganho*horas;
		
		System.out.println("Sal�rio mensal: "+sal);
		
		entrada.close();
	}

}
