package quadrado;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		
		q.setLado(10);
		q.setLado(-10);
		
		System.out.println(q.getLado());
		
		System.out.println(q.area());
	}

}
