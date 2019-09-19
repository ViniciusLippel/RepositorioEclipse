package listaRecursividade;

public class Ex2 {
	
	public static int somatorio(int n) {
		int soma = 0;
		if(n==1)
			return 12;
		soma = 2*(n*n)+2*n+8;
		soma = soma+somatorio(n-1);
		return soma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(somatorio(3));
	}
	
}
