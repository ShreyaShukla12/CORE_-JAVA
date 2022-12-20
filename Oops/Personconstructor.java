package in.co.Oops;

public class Personconstructor {
	public String getName() {
		return name;
	}

	public String getDOB() {
		return DOB;
	}

	public String getAddress() {
		return address;
	}

	private String name;
	private String DOB;
	private String address;
	
	public Personconstructor() {
		System.out.println("I m default constructor");
	}
	
	public Personconstructor(String n) {
	    this();
		this.name=n;
		
		
		System.out.println("I m parameterised constructor");
	}
	public Personconstructor(String d,String a) {
		this("bhopal");
		this.DOB=d;
		this.address=a;
		System.out.println("I m two parameterised constructor");
	}

	//private void address(String string) {
		// TODO Auto-generated method stub
		
	}


