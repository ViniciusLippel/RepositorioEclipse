package generalizacao;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Vinicius", "Jardim Am�rica");
		System.out.println(p);
		
		Pessoa p2 = new Pessoa("Nome2");
		p2.setEndereco("Endere�o 2");
		System.out.println(p2);
		
		
		Pessoa p1 = new Pessoa("Nome", "endereco");
		System.out.println(p1);
		
		PessoaFisica pf = new PessoaFisica("Vinicius", "Jardim Am�rica", "06453707977", "Solteiro");
		System.out.println(pf);
	}

}
