package datas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
	
	public static ArrayList<Date> listaDias(int mes, int ano) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, mes);
		c.set(Calendar.YEAR, ano);
		
		ArrayList<Date> listaDias = new ArrayList<Date>();
		for(int i=1; i<=c.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DATE, i);
			cal.set(Calendar.MONTH, mes);
			cal.set(Calendar.YEAR, ano);
			Date hoje = cal.getTime();
			listaDias.add(hoje);
		}
		return listaDias;
	}
}
