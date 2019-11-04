package hash;

import java.util.List;

public class Ex_2 {
	
	private List<Integer> l0;
	private List<Integer> l1;
	private List<Integer> l2;
	private List<Integer> l3;
	private List<Integer> l4;
	private List<Integer> l5;
	
	public int hash(int num) {
		return num%11;
	}
	
	public void armazenarHash(int num) {
		if(hash(num)==0)
			l0.add(num);
		if(hash(num)==1)
			l1.add(num);
		if(hash(num)==2)
			l2.add(num);
		if(hash(num)==3)
			l3.add(num);
		if(hash(num)==4)
			l4.add(num);
		if(hash(num)==5)
			l5.add(num);
	}
	
//	public String mostrarHash() {
//		StringBuilder s = new StringBuilder();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex_2 ex = new Ex_2();
//		
//		ex.armazenarHash(82);
//		ex.armazenarHash(31);
//		ex.armazenarHash(28);
//		ex.armazenarHash(4);
//		ex.armazenarHash(45);
//		ex.armazenarHash(27);
//		ex.armazenarHash(59);
//		ex.armazenarHash(79);
//		ex.armazenarHash(35);
		
		System.out.println(79%11);
	}

}
