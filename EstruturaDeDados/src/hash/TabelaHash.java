package hash;

import java.util.ArrayList;
import java.util.List;

public class TabelaHash {
	
	@SuppressWarnings("rawtypes")
	private List<List> compradores;
	
	@SuppressWarnings("rawtypes")
	public TabelaHash() {
		compradores = new ArrayList<List>();
		for (int i=0; i<26; i++) {
			compradores.add(new ArrayList<Comprador>());
		}
	}
	
	public int funcaoHash(String nome) {
		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int index = -1;
		for(int i=0; i<26; i++) {
			nome.toLowerCase();
//			System.out.println(nome.toLowerCase().charAt(0)+" "+alfabeto[i]);
			if(nome.toLowerCase().charAt(0) == alfabeto[i])
				index = i;
		}
		System.out.println(index);
		return index;
	}
	
	@SuppressWarnings("unchecked")
	public void add(Comprador comp) {
		System.out.println(funcaoHash(comp.getNome()));
		compradores.get(funcaoHash(comp.getNome())).add(comp);
	}

	@SuppressWarnings("rawtypes")
	public List<List> getCompradores() {
		return compradores;
	}

	@SuppressWarnings("rawtypes")
	public void setCompradores(List<List> compradores) {
		this.compradores = compradores;
	}
	
	
}
