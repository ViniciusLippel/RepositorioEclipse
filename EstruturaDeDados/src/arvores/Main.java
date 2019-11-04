package arvores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvore a = new Arvore();
		Nodo n = new Nodo(2);
		a.Inserir(n);
		System.out.println(a.Pesquisar(2).toString());
		n = new Nodo(3);
		a.Inserir(n);
		n = new Nodo(7);
		a.Inserir(n);
		System.out.println(a.Pesquisar(7));
	}

}
