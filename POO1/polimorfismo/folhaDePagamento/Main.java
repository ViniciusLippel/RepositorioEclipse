package folhaDePagamento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FolhaDePagamento folha = new FolhaDePagamento();
		Funcionario estagiario = new Estagiario();
		Funcionario desenvolvedor = new Desenvolvedor();
		Funcionario analista = new Analista();
		Funcionario gerente = new GerenteDeProjeto();
		
		folha.setValor(2000);
		folha.setDesconto(350);
		System.out.println(folha.salarioLiquido(estagiario));
	}

}
