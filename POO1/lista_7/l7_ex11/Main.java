package l7_ex11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peao p = new Peao(1, 1, false, 0);
		System.out.println(p.mover(2, 1));
		System.out.println(p.mover(1, 2));
		System.out.println(p.mover(5, 1));
		System.out.println(p.toString());
		
		Torre t = new Torre(2, 2, false, 0);
		System.out.println(t.mover(5, 2));
		System.out.println(t.mover(2, 7));
		System.out.println(t.mover(5, 7));
		System.out.println(t.toString());
	}

}
