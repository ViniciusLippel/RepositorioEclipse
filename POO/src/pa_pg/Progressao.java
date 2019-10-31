package pa_pg;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Progressao {
	
	private int a1;
	private int razao;
	private int quantidade;
	private TipoProgressao tipo;
	
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getRazao() {
		return razao;
	}
	public void setRazao(int razao) {
		this.razao = razao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public TipoProgressao getTipo() {
		return tipo;
	}
	public void setTipo(TipoProgressao tipo) {
		this.tipo = tipo;
	}
	
	public int[] gerarProgressao() {
		if(tipo==TipoProgressao.PA) {
			int[] pa = new int[quantidade];
			pa[0] = a1;
			for(int i=1; i<quantidade; i++) {
				pa[i] = pa[i-1]+razao;
			}
			return pa;
		}
		
		else {
			int[] pg = new int[quantidade];
			pg[0] = a1;
			for(int i=1; i<quantidade; i++)
				pg[i] = pg[i-1]*razao;
			return pg;
		}
	}
	
	public void gravar(String nome) throws IOException {
		Json json = new Json();
		json.gravar(gerarProgressao(),nome);
	}
	
	public int[] ler(String nome) throws FileNotFoundException {
		Json json = new Json();
		return json.ler(nome);
	}
	
	
	public boolean verificar(int[] vet) {
		if(verificarTipo(vet)==TipoProgressao.PA) {
			int razao = vet[1]-vet[0];
			for(int i=1; i<vet.length-1; i++) {
				if(vet[i+1]-vet[i]!=razao)
					return false;
			}
		}
		
		else if(verificarTipo(vet)==TipoProgressao.PG) {
			int razao = vet[1]/vet[0];
			for(int i=1; i<vet.length-1; i++) {
				if(vet[i+1]/vet[i]!=razao)
					return false;
			}
		}
		
		else
			return false;
		
		return true;
	}
	
	public TipoProgressao verificarTipo(int[] vet) {
		if(vet.length>2) {
			if(vet[1]-vet[0] == vet[2]-vet[1]) 
				return TipoProgressao.PA;
			else if(vet[1]/vet[0] == vet[2]/vet[1])
				return TipoProgressao.PG;
		}
		else if(vet.length==2) {
			if(vet[1]-vet[0]>0)
				return TipoProgressao.PA;
			else if(vet[1]/vet[0] == vet[0]*(vet[1]/vet[0]))
				return TipoProgressao.PG;
		}
		
		return null;
	}
	
	public void construir(int[] vet) {
		if(verificar(vet)) {
			a1 = vet[0];
			quantidade = vet.length;
			tipo = verificarTipo(vet);
			if(tipo==TipoProgressao.PA)
				razao = vet[1]-vet[0];
			else
				razao = vet[1]/vet[0];
		}
		else {
			porcentagemAlteracao(vet);
		}
	}
	
	public int somatoria() {
		int[] vet = gerarProgressao();
		int soma = 0;
		for(int i=0; i<vet.length; i++)
			soma = soma+vet[i];
		return soma;
	}
	
	public int media() {
		return somatoria()/gerarProgressao().length;
	}
	
	public double mediana() {
		int[] vet = gerarProgressao();
		if(gerarProgressao().length%2 == 0)
			return (vet[vet.length/2]+vet[(vet.length/2)-1])/2;
		return vet[(vet.length/2)];
	}
	
	public String strProgressao() {
		int[] vet = gerarProgressao();
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for(int i=0; i<vet.length-1; i++) {
			builder.append(vet[i]);
			builder.append(",");
		}
		builder.append(vet[vet.length-1]);
		builder.append("]");
		return builder.toString();
	}
	
	public int porcentagemAlteracao(int[] vet) {
		
		return 0;
	}
}
