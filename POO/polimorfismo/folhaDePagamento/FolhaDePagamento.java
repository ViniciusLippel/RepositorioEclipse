package folhaDePagamento;

public class FolhaDePagamento {

	private double valor;
	private double desconto;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double salarioLiquido(Funcionario f) {
		return (valor-desconto)*f.acrescimo();
	}
}
