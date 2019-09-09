package busca;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {1,7,3,8,9,5,6};
		int x = 10;
		boolean v = false;
		for (int i=0; i<vet.length; i++) {
			if (vet[i]==x)
				v = true;
		}
		System.out.println(v);
	}

}
