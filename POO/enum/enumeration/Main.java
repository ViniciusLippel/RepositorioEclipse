package enumeration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoUsuario tipo = TipoUsuario.CONTROLER;
		System.out.println(tipo.name());
		System.out.println(tipo.toString());
		System.out.println(tipo.ordinal());
		for (TipoUsuario item : TipoUsuario.values()) {
			System.out.println(item.name());
		}
	}

}
