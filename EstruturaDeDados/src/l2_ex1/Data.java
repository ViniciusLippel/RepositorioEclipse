package l2_ex1;

import java.util.Scanner;

public class Data {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static int lerDia() {
		System.out.print("Dia: ");
		int dia = entrada.nextInt();
		return dia;
	}
	
	public static int lerMes() {
		System.out.print("Mês: ");
		int mes = entrada.nextInt();
		return mes;
	}
	
	public static int lerAno() {
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		return ano;
	}
	
	public static String lerData() {
		System.out.print("Digite a data (DD/MM/AAAA): ");
		String data = entrada.nextLine();
		return data;
	}
	
	public static String verificarBissexto(int ano) {
		if ((ano%4==0 && ano%100!=0) || (ano%400==0))
			return "Bissexto";
		else
			return "Não Bissexto";
	}
	
	public static boolean validaData(int dia, int mes, int ano) {
		boolean v=false;
		
		if (mes>0 && mes<=12) {
			if (mes==4 || mes==6 || mes==9 || mes==11) {
				if (dia>0 && dia<=30)
					 v = true;
			}
			else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
				if (dia>0 && dia<=31)
					v =  true;
			}
			
			else {
				if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
					if (dia>0 && dia<=29)
						v = true;
				}
				else {
					if (dia>0 && dia<=28)
						v = true;
				}
			}
		}
		
		return v;
	}
	
	public static String escreveValidacao(int dia, int mes, int ano) {
		if (validaData(dia, mes, ano)) 
			return "Válido".concat("\n"+verificarBissexto(ano));
		else 
			return "Inválido";
	}
	
	
	public static boolean validaDataStr(String data) {
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(3, 5));
		int ano = Integer.parseInt(data.substring(6, 10));
		
		boolean v = validaData(dia, mes, ano);
		
		return v;
	}
	
	public static String escreveData(String data) {
		String[] mesExt = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}; 
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(3, 5));
		int ano = Integer.parseInt(data.substring(6, 10));
		
		return dia+" de "+mesExt[mes-1]+" de "+ano;
	}
}










