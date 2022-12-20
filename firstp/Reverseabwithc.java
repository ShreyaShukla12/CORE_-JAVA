package firstp;

public class Reverseabwithc {
	public static void main(String[]args) {
		int a=10;
		int b=20;
		
		int c=a+b;
		a=c-a;
		b=c-a;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
