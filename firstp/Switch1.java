package firstp;

public class Switch1 {
	public static void main(String[]args) {
		int s= args.length;
		switch(s) {
		case 0:
			System.out.println("Usage : java Hello All n1 n2 n3....");
			break;
		case 1:
			System.out.println("Hello "+args[0]);
			break;
			default :
				for(int i=0;i<s;i++) {
					System.out.println(i+" Hello "+args[i]);
				}
		}
	}

}
