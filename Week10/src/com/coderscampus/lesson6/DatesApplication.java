package com.coderscampus.lesson6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

public class DatesApplication {
    public static void main(String[] args) {
       // lesson6();

        //lesson7();

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Seattle"));
        cal.set(2020, 0, 1);
        Date jan1 = cal.getTime();

        System.out.println(jan1);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a z");
        formatter.setTimeZone(TimeZone.getTimeZone("America/Seattle"));
        String formattedDate = formatter.format(jan1);
        System.out.println(formattedDate);

        String dateValue1 = "2020-01-05 5:00 PM";
        String dateValue2 = "2019-01-01 10:00 AM";

        DateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd h:mm");
        Date date1;
        Date date2;
        try {
            date1 = formatter2.parse(dateValue1);
            date2 = formatter2.parse(dateValue2);
            if (date1.before(date2)) {
                System.out.println(date1 + " is before " + date2);
            } else {
                System.out.println(date1 + " is after " + date2);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }

    private static void lesson7() {
        //do not use this method - depreciated. Use calendar instead.
        Date jan012020 = new Date(2020, 1, 1, 0, 0, 0);

        //how to define then? use calendar!
        Calendar cal = Calendar.getInstance();

        Date someOtherDate = cal.getTime();
        cal.set(2020, 1, 1, 15, 1,5);
        someOtherDate = cal.getTime();
        System.out.println(someOtherDate);

        cal.add(Calendar.HOUR, 2 );
        System.out.println(cal.getTime());

        cal.add(Calendar.MINUTE, -1);
        System.out.println(cal.getTime());

        Date now = new Date();
        if (now.after(cal.getTime())) {
            System.out.println(now + " is after " + cal.getTime());
        }

        cal =  Calendar.getInstance(TimeZone.getTimeZone("America/San Francisco"));
        System.out.println(cal.getTime());
    }

    private static void lesson6() {
        Date now = new Date();
        System.out.println(now);

        java.sql.Date alsoNow = new java.sql.Date(0);
        System.out.println(alsoNow);
    }
}
