package com.pm.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderMonth {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		for (int i = 0; i < 30; i++) {
			c.add(Calendar.DATE, 1);

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println(sdf.format(c.getTime()));
		}
		
		
		/*
		 * String customDateStr = "01/01/2024"; // your custom start date
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 * 
		 * Date customDate = sdf.parse(customDateStr); Calendar c =
		 * Calendar.getInstance(); c.setTime(customDate);
		 * 
		 * for (int i = 0; i < 12; i++) { c.add(Calendar.DATE, 30);
		 * System.out.println(sdf.format(c.getTime())); }
		 */
	}

}
