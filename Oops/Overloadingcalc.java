package in.co.Oops;

public class Overloadingcalc {
	public static void main(String[] args) {
		Add(20,10);
		Add(5,15,100);
		Add("apple","mango","grapes");
	}
	private static void Add(int i,int k) {
		System.out.println(i-k);
	}
	
	private static void Add(String a, String b, String c) {
		System.out.println(a+b+c);
	}
	
	private static void Add(int i, int j,int k) {
		System.out.println(i*j*k);
		}

}
