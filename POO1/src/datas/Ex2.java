package datas;

import java.util.Date;

public class Ex2 {

	public static long segundosEntreDatas(Date inicio, Date fim) {
		long secIn = inicio.getTime();
		long secFi = fim.getTime();
		long dif = (secFi - secIn) / 1000;
		return dif;
	}
}
