package hash;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabelaHash tabela = new TabelaHash();
		Comprador comp = new Comprador();
		comp.setNome("Vinicius");
		tabela.add(comp);
		comp = new Comprador();
		comp.setNome("Finicius");
		tabela.add(comp);
		comp = new Comprador();
		comp.setNome("Ainicius");
		tabela.add(comp);
		comp = new Comprador();
		comp.setNome("Binicius");
		tabela.add(comp);
		comp = new Comprador();
		comp.setNome("Cinicius");
		tabela.add(comp);
		
		System.out.println(tabela.getCompradores().get(21).get(0));
	}

}
