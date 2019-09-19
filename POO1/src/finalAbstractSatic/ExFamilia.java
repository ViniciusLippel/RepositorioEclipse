package finalAbstractSatic;

public class ExFamilia {

	public static void main(String[] args) {
		Familia rodrigo = new Familia();
		rodrigo.setNome("Rodrigo");
		Familia.setSobrenome("Curvello");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		Familia.setSobrenome("Outra Familia");
		
		System.out.println(rodrigo.getNome()+" "+Familia.getSobrenome());
		System.out.println(iran.getNome()+" "+Familia.getSobrenome());
	}

}
