package datas;

import java.util.Calendar;
import java.util.Date;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 24);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.YEAR, 1978);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		Date dt = cal.getTime();
		
		Date hj = new Date();
		
		long segundos = Ex2.segundosEntreDatas(dt, hj);
		System.out.println(segundos);
	}

}
