package hash;

public class HashCPF {
	
	public static int funcaoHash(long cpf) {
		return (int)(cpf%200);
	}

}
