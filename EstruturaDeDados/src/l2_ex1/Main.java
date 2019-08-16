package l2_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("1 / 2 / 3: ");
		n = entrada.nextInt();
		if(n==1) {
			int dia, mes, ano;
			dia = Data.lerDia();
			mes = Data.lerMes();
			ano = Data.lerAno();
			
			System.out.println(Data.escreveValidacao(dia, mes, ano));
		}
		
		else if (n==2) {
			String data = Data.lerData();
			boolean val = Data.validaDataStr(data);
			
			System.out.println(val);
		}
		
		else if(n==3) {
			String data = Data.lerData();
			System.out.println(Data.escreveData(data));
		}
		
		entrada.close();
		
	}

}
