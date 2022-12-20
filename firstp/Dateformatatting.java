package firstp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformatatting {
	public static void main(String[]args) throws ParseException{
		Date d= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		String s=format.format(d);
		System.out.println("Date:-"+s);
		String s1="15/08/1947";
		Date d1= format.parse(s1);
		System.out.println(d1);
				}
}
