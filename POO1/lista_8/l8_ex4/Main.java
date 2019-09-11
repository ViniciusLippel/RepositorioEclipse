package l8_ex4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m = new Mouse();
		Teclado t = new Teclado();
		Monitor mt = new Monitor();
		Processador p = new Processador();
		Memoria mm = new Memoria();
		HD hd = new HD();
		PlacaMae pm = new PlacaMae("GG", "Super", p, hd, mm);
		Gabinete gab = new Gabinete("Zaz", "Grande", 5, pm);
		Computador pc = new Computador("Joooj", "3", gab, t, m, mt);
		System.out.println(pc);
	}

}
