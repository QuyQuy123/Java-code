package Test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		
		// ham thoi gian
		long t1 = System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			System.out.println("Test");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Truoc khi chay for:"+t1);
		System.out.println("Sau khi chay for:"+t2);
		System.out.println("Thoi Gian:"+(t2-t1)+"mls");

		System.out.println("Thoi Gian:"+(t2-t1)/1000+"s");
		
		//TimeUnit:
		System.out.println("25h ="+TimeUnit.HOURS.toSeconds(25)+"s");
		
		// Date
		
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		// calendar
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		// date format
		
		
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		DateFormat df2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

		System.out.println(df2.format(d));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

