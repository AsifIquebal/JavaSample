package com.company;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatesInJava {

    @Test
    public void simpleDateFormat() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);

        /*Date date = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy|hh_mm_ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd_mm_yyyy:hh_mm_ss");*/

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

        // Named Month MMMM
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : " + strDate);

        // Named Timezone
        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);

        // Timezone
        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);
    }

    @Test
    public void java8_localDate01() {
        System.out.println("Difference in Days："
                + ChronoUnit.DAYS.between(LocalDate.of(2022, 8, 10),
                LocalDate.of(2022, 8, 17)));
    }
}
