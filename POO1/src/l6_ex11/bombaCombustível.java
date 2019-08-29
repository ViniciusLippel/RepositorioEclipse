package l6_ex11;

public class bombaCombustível {

	int tipoCombustivel;
	double valorLitro;
	double qtdCombustivel;
	
	
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public double getQtdCombustivel() {
		return qtdCombustivel;
	}

	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public void setQtdCombustivel(double qtdCombustivel) {
		this.qtdCombustivel = qtdCombustivel;
	}

	public void abastecerPorValor(double valor) {
		double valorTotal, quantidadeTotal;
	}
	
	public void abastecerPorLitro(double litro) {
		this.qtdCombustivel = litro;
	}

}
