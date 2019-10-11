package l8_ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Vinicius", "Alameda Bela Aliança");
		Banco b = new Banco(1234, "Banco do Brasil", 25);
		ContaBancaria cb = new ContaBancaria(b, 5, 2432, 1000, p);
		ContaSimples cs = new ContaSimples(b, 7, 1423, 2000, p, 3000);
		CartaoDeCredito c = new CartaoDeCredito(1234, "visa", 5000, "Azul");
		ContaEspecial ce = new ContaEspecial(b, 27, 6345, 3000, p, 5, 2000, c);
		
		System.out.println(cb);
		System.out.println(cs);
		System.out.println(ce);
	}

}
