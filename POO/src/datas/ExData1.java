package datas;

import java.util.Calendar;
import java.util.Date;

public class ExData1 {

	public static void main(String[] args) {
//		Date hj = new Date();
//		System.out.println(hj);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 03);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 45);
		c.set(Calendar.SECOND, 37);
		Date dt = c.getTime();
		System.out.println("Vinicius nasceu em: "+dt);
	}
}
