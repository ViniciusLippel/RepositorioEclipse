package ex4;

public class Verificador {
	
	
	public static int verificar(int n) {
		
		char[] vetor = Integer.toString(n).toCharArray();
		int[] unidade = new int[vetor.length];
		for (int i=0; i<vetor.length; i++) {
			unidade[i] = Character.getNumericValue(vetor[i]);
		}
		
		int x = 2, soma = 0;
		for (int i=unidade.length-1; i>=0; i--) {
			unidade[i] = unidade[i]*x;
			soma = soma + unidade[i];
			x++;
		}
		
		int verificador = soma%11;
		verificador = 11 - verificador;
		
		if(verificador==10 || verificador==11) {
			verificador=0;
		}
		
		return verificador;
	}
	
}
