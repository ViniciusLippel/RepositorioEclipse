package datas;

import java.util.Date;
import java.util.ArrayList;

public class MainEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Date> lista = Ex1.listaDias(1, 2001);
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
