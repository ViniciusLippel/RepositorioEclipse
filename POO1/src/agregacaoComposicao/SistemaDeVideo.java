package agregacaoComposicao;

public class SistemaDeVideo extends EquipamentoEletronico {
	
	private String marca;
	private String modelo;
	private String tipo;
	private String resolucao;
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setTipo(String tipo) {
		if(tipo!="")
			this.tipo = tipo;
	}
	public void setResolucao(String resolucao) {
		if(resolucao!="")
			this.resolucao = resolucao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
