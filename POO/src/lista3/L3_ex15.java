package lista3;

public class L3_ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		double result=0, x;
		
		for (int i=38; i>1; i--) {
			x = i;
			if(i==38)
				System.out.print("("+(i-1)+"*"+i+")/"+n);
			else
				System.out.print(" + ("+(i-1)+"*"+i+")/"+n);
			result=result+(x-1)*x/n;
			n++;
		}
		System.out.println(" = "+result);
	}

}
