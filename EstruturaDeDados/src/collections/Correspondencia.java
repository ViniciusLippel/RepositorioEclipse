package collections;

public class Correspondencia {
	private String destinatario;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String tipoDeEnvio;
	
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTipoDeEnvio() {
		return tipoDeEnvio;
	}
	public void setTipoDeEnvio(String tipoDeEnvio) {
		this.tipoDeEnvio = tipoDeEnvio;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Correspondencia [destinatario=");
		builder.append(destinatario);
		builder.append(", rua=");
		builder.append(rua);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", cep=");
		builder.append(cep);
		builder.append(", tipoDeEnvio=");
		builder.append(tipoDeEnvio);
		builder.append("]");
		return builder.toString();
	}
	
	
}
