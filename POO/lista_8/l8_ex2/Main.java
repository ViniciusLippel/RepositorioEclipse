package l8_ex2;

public class Main {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.setMarca("VW");
		m.setCilindros(4);
		m.setCombustivel("gasolina");
		m.setPotencia(160);
		
		Pessoa p = new Pessoa();
		p.setNome("Vinícius");
		p.setEndereco("Alameda Bela Aliança, 104");
		
		Carro c = new Carro("VW", "Virtus", "Preto", 2019, p, m);
		System.out.println(c);
	}

}
