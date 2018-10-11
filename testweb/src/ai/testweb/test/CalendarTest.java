package ai.testweb.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.apache.naming.java.javaURLContextFactory;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		Locale[] en= Calendar.getAvailableLocales();
		for (Locale locale : en) {
			System.out.println(locale);
		}
		Locale locale=new Locale("en_GB");
		cal=Calendar.getInstance(locale);
		System.out.println(cal.getTime());
		DateFormat df= null;
		for (int i = 0; i < 4; i++) {
			df= DateFormat.getDateInstance(i, Locale.US);
			System.out.println(df.format(cal.getTime()));
		}
		System.out.println(DateFormatStr.CHINA.getDateFormat());
		System.out.println(new SimpleDateFormat(DateFormatStr.CHINA.getDateFormat()).format(cal.getTime()));
		System.out.println(new SimpleDateFormat(DateFormatStr.US.getDateFormat()).format(cal.getTime()));
	}

}
