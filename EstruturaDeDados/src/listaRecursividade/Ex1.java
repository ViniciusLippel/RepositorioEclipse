package listaRecursividade;

public class Ex1 {

	public static int fibonacci(int n) {
		int fib = 0;
		if(n==1)
			fib = 1;
		else if(n>1) {
			int aux = fibonacci(n-2);
			fib = fibonacci(n-1)+aux;
			System.out.println(fib);
		}
			
		return fib;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(7));
	}

}
