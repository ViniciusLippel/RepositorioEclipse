package l8_ex3;

public class ContaEspecial extends ContaBancaria {
	
	private int diasSemJuros;
	private double limite;
	private CartaoDeCredito cartao;
	
	public ContaEspecial(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista,
			int diasSemJuros, double limite, CartaoDeCredito cartao) {
		super(banco, agencia, numeroDaConta, saldo, correntista);
		this.setDiasSemJuros(diasSemJuros);
		this.setLimite(limite);
		this.setCartao(cartao);
	}
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	
	public void setDiasSemJuros(int diasSemJuros) {
		if(diasSemJuros>=0)
			this.diasSemJuros = diasSemJuros;
	}
	public void setLimite(double limite) {
		if(limite>0)
			this.limite = limite;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
