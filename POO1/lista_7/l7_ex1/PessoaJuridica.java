package l7_ex1;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String tipoEmpresa;
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		this.setCnpj(cnpj);
		this.setTipoEmpresa(tipoEmpresa);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
}
