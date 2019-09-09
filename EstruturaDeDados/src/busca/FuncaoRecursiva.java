package busca;

public class FuncaoRecursiva {

	public static int fatorial(int x) {
		if (x==0)
			return 1;
		else
			return x * fatorial(x-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(fatorial(x));
	}

}
