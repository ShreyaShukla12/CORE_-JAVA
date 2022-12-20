package firstp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Calculateage {
	public static void main(String[]args) throws ParseException {
		Date d= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		Date d1= format.parse("15/08/1947");

		System.out.println(d.getDay()-d1.getDay());
		System.out.println(d.getMonth()-d1.getMonth());
		System.out.println(d.getYear()-d1.getYear());
		
		{LocalDate today=LocalDate.now();
		LocalDate doi=LocalDate.of(1947,8,15);
		Period diff =Period.between(today, doi);
		System.out.println(diff);
	}

}
}