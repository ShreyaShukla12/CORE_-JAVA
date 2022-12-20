package firstp;

public class Stringbuffer {
	public static void main(String[]args) {
		StringBuffer a=new StringBuffer("Shreya");
		a.append("Shukla");
		System.out.println("length:"+a.length());{
			System.out.println("capacity:"+a.capacity());{
				System.out.println("char at:"+a.charAt(2));{
					System.out.println("index of:"+a.indexOf("Shu"));{
						System.out.println("replace:"+a.replace(2,10,"b"));{
							System.out.println("reverse:"+a.reverse());
						}
					}
				}
			}
		}
		}
}
