package projetoURL;

public class Pessoa {

	private String nome;
	private String posicao;
	private String pais;
	private String universidade;
	private String desde;
	private String pontos;

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	private int resolvido;
	private int tentado;
	private int submissoes;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", posicao=");
		builder.append(posicao);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", universidade=");
		builder.append(universidade);
		builder.append(", desde=");
		builder.append(desde);
		builder.append(", pontos=");
		builder.append(pontos);
		builder.append(", resolvido=");
		builder.append(resolvido);
		builder.append(", tentado=");
		builder.append(tentado);
		builder.append(", submissoes=");
		builder.append(submissoes);
		builder.append("]");
		return builder.toString();
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public int getResolvido() {
		return resolvido;
	}

	public void setResolvido(int resolvido) {
		this.resolvido = resolvido;
	}

	public int getTentado() {
		return tentado;
	}

	public void setTentado(int tentado) {
		this.tentado = tentado;
	}

	public int getSubmissoes() {
		return submissoes;
	}

	public void setSubmissoes(int submissoes) {
		this.submissoes = submissoes;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
