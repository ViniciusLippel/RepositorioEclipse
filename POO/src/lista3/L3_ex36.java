package lista3;

import java.util.Scanner;

public class L3_ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int jose=0, joana=0, joel=0, joaquina=0, nulo=0, branco=0, cod=1, total=0;
		Double nulo_p;
		
		System.out.println("ELEIÇÃO PRESIDENCIAL \n1- José \n2- Joana \n3- Joel \n4- Joaquina \n5- Nulo \n6- Branco\n");
		
		while (cod>0) {
			System.out.print("Voto: ");
			cod = entrada.nextInt();
			if (cod==1) 
				jose++;
			else if (cod==2)
				joana++;
			else if (cod==3)
				joel++;
			else if (cod==4)
				joaquina++;
			else if (cod==5)
				nulo++;
			else if (cod==6)
				branco++;
			else if (cod>0)
				System.out.println("Voto inválido");
		}
		
		total = jose+joana+joel+joaquina+nulo+branco;
		nulo_p = new Double(nulo);
		System.out.println("1- José: "+jose+"\n2- Joana: "+joana+"\n3- Joel: "+joel+"\n4- Joaquina: "+joaquina+"\n5- Nulo: "+nulo+"\n6- Branco: "+branco);
		System.out.println("Porcentagem de nulos: "+(nulo_p/total)*100+"%");
		
		entrada.close();
	}

}
