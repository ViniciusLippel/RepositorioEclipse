package lista4_Vetor;

import java.util.Random;
import java.util.Scanner;

public class L4_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
				"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int t, iL=2;
		String senha="";
		
		System.out.print("Tamanho da senha: ");
		t = entrada.nextInt();
		
		int i=0;
		while (i<t) {
			
			if (i%2==0) {
				iL = new Random().nextInt(alfabeto.length);
				if (!alfabeto[iL].equals("a") && !alfabeto[iL].equals("e") && !alfabeto[iL].equals("i") && !alfabeto[iL].equals("o") && !alfabeto[iL].equals("u")) {
					senha = senha.concat(alfabeto[iL]);
					i++;
				}
			}
			
			else {
				iL = new Random().nextInt(alfabeto.length);
				if (alfabeto[iL].equals("a") || alfabeto[iL].equals("e") || alfabeto[iL].equals("i") || alfabeto[iL].equals("o") || alfabeto[iL].equals("u")) {
					senha = senha.concat(alfabeto[iL]);
					i++;
				}
	
			}
			
		}
		
		System.out.println("\nSenha: "+senha);
	}

}
