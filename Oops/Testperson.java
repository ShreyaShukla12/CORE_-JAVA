package in.co.Oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Testperson {
	public static void main(String[] args) throws Exception {
		PersonOops s =new PersonOops();
		s.setName("Ram");
		s.setAddress("Indore");
		s.setDOB("02/05/1972");
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getDOB());
		Date d= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		Date d1= format.parse("02/05/1972");

		//System.out.println(d.getDay()-d1.getDay());
		//System.out.println(d.getMonth()-d1.getMonth());
		//System.out.println(d.getYear()-d1.getYear());
		
		{LocalDate today=LocalDate.now();
		LocalDate doi=LocalDate.of(1972,5,02);
		Period diff =Period.between(today, doi);
		System.out.println("Age:"+diff);
		
	}
	}
}
