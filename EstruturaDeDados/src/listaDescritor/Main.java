package listaDescritor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Descritor dl = new Descritor();
		dl.il = 0;
		dl.fl = 0;
		dl.n = 0;
		System.out.print("IniArea: ");
		dl.ia = entrada.nextInt();
		System.out.print("FimArea: ");
		dl.fa = entrada.nextInt();
	}

}
