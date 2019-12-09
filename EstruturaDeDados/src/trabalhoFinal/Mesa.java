package trabalhoFinal;

public class Mesa {
	private Processo processo;
	private Funcionario funcionario;
	private Mesa proxima;
	
	public Mesa getProxima() {
		return proxima;
	}
	public void setProxima(Mesa proxima) {
		this.proxima = proxima;
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public boolean emUso() {
		if(processo != null)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesa [processo=");
		builder.append(processo);
		builder.append(", funcionario=");
		builder.append(funcionario);
		builder.append("]");
		return builder.toString();
	}
	
}
