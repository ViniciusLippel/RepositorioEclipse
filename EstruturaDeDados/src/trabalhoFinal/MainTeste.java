package trabalhoFinal;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila f = new Fila();
		Pilha pilhaA = new Pilha(), pilhaB = new Pilha(), pilhaC = new Pilha();
		Processo p = new Processo();
		p.setDescricao("Primerito");
		p.setFinalidade(Finalidade.A);
		f.add(p);
		p = new Processo();
		p.setDescricao("Segundito");
		p.setFinalidade(Finalidade.B);
		f.add(p);
		p = new Processo();
		p.setDescricao("Tercerito");
		p.setFinalidade(Finalidade.A);
		f.add(p);
		
		System.out.println(f.toString());
		
		int tamanho = f.tamanho();
//		System.out.println(tamanho);
		for(int i=0; i<tamanho; i++) {
//			f.getElemento(i).setProximo(null);
			Processo atual = f.pegarProximo();
			if(atual.getFinalidade() == Finalidade.A)
				pilhaA.add(atual);
			else if(atual.getFinalidade() == Finalidade.B)
				pilhaB.add(atual);
			else if(atual.getFinalidade() == Finalidade.C)
				pilhaC.add(atual);
		}
		System.out.println("Triagem finalizada");
		
		System.out.println(pilhaA.proxima().toStringSimple());
		System.out.println(pilhaA.proxima().toStringSimple());
//		System.out.println(pilhaA.proxima().toStringSimple());
	}

}
