package in.co.Oops;

public class Businessmaninterface extends PersonInterface implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("helping others");

	}

	@Override
	public void earnmoney() {
		System.out.println("earning money");

	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("giving donation");

	}

	@Override
	public void party() {
		System.out.println("enjoying parties");
		// TODO Auto-generated method stub

	}

}
