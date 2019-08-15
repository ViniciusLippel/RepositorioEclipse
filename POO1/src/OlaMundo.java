import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double numD;
		System.out.print("Digite um valor: ");
		numD = entrada.nextDouble();
		
		entrada.nextLine();
		
		String texto="";
		texto = entrada.nextLine();
		
		char letra=' ';
		letra = entrada.nextLine().toUpperCase().charAt(0);
		
		System.out.println(numD+" "+texto+" "+letra);
		
		entrada.close();
	}

}
