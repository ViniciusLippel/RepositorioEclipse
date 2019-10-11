package lista3;

import java.util.Scanner;
import java.util.ArrayList;

public class L3_ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> valores = new ArrayList<Double>();
		double n=1, total=0, dinheiro, troco;
		int i=1, menu=1;
		
		while (menu==1){
			System.out.println("1- Nova compra \nOutro- Sair");
			menu = entrada.nextInt();
			if (menu==1) {
				System.out.println("\nRegistro da compra (Digite 0 para finalizar): ");
				while (n!=0) {
					System.out.print("Produto "+i+": R$ ");
					n = entrada.nextDouble();
					valores.add(n);
					i++;
				}
				
				System.out.println("\nLojas tabajara");
				for (int x=0; x<valores.size(); x++) {
					total = total+valores.get(x);
				}
				
				System.out.println("Total: R$ "+total);
				do{
					System.out.print("Dinheiro: R$ ");
					dinheiro = entrada.nextDouble();
					if (dinheiro >= total) {
						troco = dinheiro - total;
						System.out.println("Troco: R$ "+troco+"\n");
					}
					else
						System.out.println("Dinheiro insuficiente\n");
				}while (dinheiro<total);
			}
		}
		
		entrada.close();
	}
}
