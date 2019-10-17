package l8_ex3;

public class CartaoDeCredito {
	
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartao;
	
	public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
		super();
		this.setNumero(numero);
		this.setOperadora(operadora);
		this.setLimite(limite);
		this.setTipoDeCartao(tipoDeCartao);
	}
	public int getNumero() {
		return numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public double getLimite() {
		return limite;
	}
	public String getTipoDeCartao() {
		return tipoDeCartao;
	}
	
	public void setNumero(int numero) {
		if(numero>0)
			this.numero = numero;
	}
	public void setOperadora(String operadora) {
		if(operadora!="")
			this.operadora = operadora;
	}
	public void setLimite(double limite) {
		if(limite>0)
			this.limite = limite;
	}
	public void setTipoDeCartao(String tipoDeCartao) {
		if(tipoDeCartao!="")
			this.tipoDeCartao = tipoDeCartao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartaoDeCredito [numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", tipoDeCartao=");
		builder.append(tipoDeCartao);
		builder.append("]");
		return builder.toString();
	}
	
}
