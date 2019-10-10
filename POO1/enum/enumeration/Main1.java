package enumeration;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpcoesMenu tipo = OpcoesMenu.ABRIR;
		switch (tipo) {
			case ABRIR:System.out.println("abrir");
				break;
			case IMPRIMIR:System.out.println("imprimir");
				break;
			default:System.out.println("Error");
				break;
		}
		System.out.println(tipo.getValor());
	}

}
