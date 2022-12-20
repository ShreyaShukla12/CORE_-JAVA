package in.co.Oops;

public class Addconst2 {
	private int A;
	private int B;
	private int C;

	public Addconst2() {
		System.out.println("I am default constructor");
	}

	public Addconst2(int i) {
		this();
		this.C=i;
		System.out.println("I am a parameterised constructor");
	}
	public Addconst2(int j, int k) {
		this(100);
		this.A=j;
		this.B=k;
		System.out.println("I am two parameterised constructor");
	}

	
	public int getA() {
		return A;
	}
//this program is constructor overloading
	public int getB() {
		return B;
	}

	public int getC() {
		return C;
	}

	
}
