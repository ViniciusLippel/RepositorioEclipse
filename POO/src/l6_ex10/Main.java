package l6_ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int menu=1;
		
		Televisor tv = new Televisor();
		
		tv.ligarTV();
		tv.setCanal(entrada.nextInt());
		tv.setVolume(entrada.nextInt());
		
		while(menu!=0) {
			menu = entrada.nextInt();
			if (menu==1)
				tv.aumentarVolume();
			else if (menu==2)
				tv.diminuirVolume();
			else if (menu==3)
				tv.setCanal(entrada.nextInt());
		}
		
		System.out.println(tv.toString());
	}

}
