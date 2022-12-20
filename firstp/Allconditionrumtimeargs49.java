package firstp;

public class Allconditionrumtimeargs49 {
	public static void main(String[]args) {
		int s= args.length;
	if (s==1) {
		   System.out.println("Usage : java Hello All n1 n2 n3....");}
 else {
			for(int i=0;i<s;i++) {
				System.out.println(i+"=Hello "+args[i]);
			}
				
		}
	}

}
