package in.co.Oops;

public class TestBusinessmaninterface {
	public static void main(String[] args) {
		Businessmaninterface b = new Businessmaninterface();

		b.setName("ram");
		b.setAddress("bhopal");

		System.out.println(b.getName());
		System.out.println(b.getAddress());

		b.helpToOthers();
		b.earnmoney();
		b.donation();
		b.party();
	}

}
