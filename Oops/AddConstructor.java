package in.co.Oops;

public class AddConstructor {
  private int A;
  public int getA() {
	return A;
}
public int getB() {
	return B;
}
private int B;

  public AddConstructor () {
	  System.out.println("I am default constructor");
  }
  public AddConstructor(int i, int j) {
	  A=i;
	  B=j;
	  System.out.println("I am parameterised constructor");
  }
}