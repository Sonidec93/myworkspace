import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String arg[]) {

		Calendar cal = Calendar.getInstance();

		Date date = cal.getTime();
		DateFormat df = DateFormat.getInstance();
		
		System.out.println("Formatting the time"
				+ DateFormat.getTimeInstance().format(date));
		System.out.println(date);
		cal.add(Calendar.DAY_OF_YEAR, 6);
		cal.add(Calendar.YEAR, 2);
		System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		try {
			Date d2=sdf.parse("06/12/1993 12:00:00");
			Calendar cal2=Calendar.getInstance();
			cal2.setTime(d2);
			System.out.println(cal2.getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
