package lista3;

import java.util.Scanner;

public class L3_ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n=0, s1=0, s2=0, s3=0, s4=0;
		
		System.out.println("Digite vários números entre 0 e 100 (negativo para finalizar): ");
		while(n>=0) {
			n = entrada.nextInt();
			if (n>=0) {
				if (n>=0 && n<=25)
					s1++;
				else if (n<=50)
					s2++;
				else if (n<=75)
					s3++;
				else if (n<=100)
					s4++;
				else
					System.out.println("O número deve ser menor que 100");
			}
		}
		
		System.out.println("[0-25]: "+s1+"\n[26-50]: "+s2+"\n[51-75]: "+s3+"\n[76-100]: "+s4);
		
		entrada.close();
	}

}
