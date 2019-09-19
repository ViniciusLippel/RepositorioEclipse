package listaRecursividade;

public class Ex1 {

	public static int fibonacci(int n) {
		int fib = 0;
		if(n<2)
			return n;
		else if(n>1) {
			fib = fibonacci(n-1)+fibonacci(n-2);
		}
			
		return fib;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(8));
	}

}
