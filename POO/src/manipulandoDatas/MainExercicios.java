package manipulandoDatas;

import java.util.Calendar;
import java.util.Date;

public class MainExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_MONTH, 03);
		c1.set(Calendar.MONTH, 10);
		c1.set(Calendar.YEAR, 2000);
		c1.set(Calendar.HOUR_OF_DAY, 10);
		c1.set(Calendar.MINUTE, 45);
		c1.set(Calendar.SECOND, 37);
		Date dt1 = c1.getTime();
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.DAY_OF_MONTH, 11);
		c2.set(Calendar.MONTH, 10);
		c2.set(Calendar.YEAR, 2000);
		c2.set(Calendar.HOUR_OF_DAY, 10);
		c2.set(Calendar.MINUTE, 45);
		c2.set(Calendar.SECOND, 37);
		Date dt2 = c2.getTime();
		
		System.out.println(sabadosEntreDatas(dt1, dt2));
	}
	
	public static String sabadosEntreDatas (Date dtInicio, Date dtFim) {
		Calendar cIni = Calendar.getInstance(), cFim = Calendar.getInstance();
		cIni.setTime(dtInicio);
		cFim.setTime(dtFim);
		int sabados = 0, domingos = 0;
		while (cFim.after(cIni)) {
			  if (cFim.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ){
			    sabados++;
			  }else if (cFim.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
			    domingos++;
			  }

			  cFim.add(Calendar.DATE, -1);
		}
		return "Sabados: "+sabados+"\nDomingos: "+domingos;
	}

}
