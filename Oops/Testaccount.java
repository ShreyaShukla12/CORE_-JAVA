package in.co.Oops;

public class Testaccount {
	public static void main(String[] args) {
		AccountOop a=new AccountOop();
		a.setNumber("1234567890");
		a.setAccounttype("savings");
		a.setBalance(100000.00);
	  double Withdrawl=5200.25;
	  System.out.println("Account number:"+a.getNumber());
	  System.out.println("Account Type:"+a.getAccounttype());
	  System.out.println("Balance:"+(a.getBalance()-Withdrawl));

		
	}

}
