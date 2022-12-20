package in.co.Oops;

public class TestAutomobile {
	public static void main(String[] args) {
		AutomobileOops a=new AutomobileOops();
		a.setColor("Black");
		System.out.println("Colour:"+a.getColor());
		
			int gears=args.length;
		switch(gears) {
		case 0:
			a.setSpeed(20);
			System.out.println("gear 1:"+a.getSpeed());
			break;
		case 1:
			a.setSpeed(40);
			System.out.println("gear 2:"+a.getSpeed());
			break;
		case 2:
			a.setSpeed(60);
			System.out.println("gear 3:"+a.getSpeed());
			break;
			default:
		 {for(int i=5;i<=gears;i++)
				a.setSpeed(100);
				System.out.println("gear 4:"+a.getSpeed());
		
		
		
		//for(int gear=1;gear<5;gear++) {
			//if (gear>=1 && gear<2) {
				//a.setSpeed(20);
				//System.out.println(a.getSpeed());}
			//else if(gear>=2 && gear<3 )
			//{	a.setSpeed(40);
			//System.out.println(a.getSpeed());}
		//else if (gear>=3 && gear<4) {
			//a.setSpeed(60);
			//System.out.println(a.getSpeed());}
		//else {a.setSpeed(100);
		//System.out.println(a.getSpeed());
			
			
		}
		}}}


