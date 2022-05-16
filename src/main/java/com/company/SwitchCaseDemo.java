package com.company;

import org.testng.annotations.Test;

public class SwitchCaseDemo {

    @Test
    public void test01_generalUseCase() {
        int month = 3;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }

    @Test
    public void test02_brealFallThrough() {
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
        int month = 2;
        switch (month) {
            case 1:
                futureMonths.add("January");
            case 2:
                futureMonths.add("February");
            case 3:
                futureMonths.add("March");
                break;
            default:
                break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }

    @Test
    public void test03() {
        int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }

    @Test
    public void withStringJava7onwards() {
        String s = "B";
        int i = 0;
        switch (s.toLowerCase()) {
            case "a":
                System.out.println("A for Apple");
                i = 1;
                break;
            case "b":
                System.out.println("B for Ball");
                i = 2;
                break;
            case "c":
                System.out.println("C for Cat");
                i = 3;
                break;
            default:
                System.out.println("No input");
                break;
        }
        System.out.println("i: " + i);
    }

    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    @Test
    public void usingEnum() {
        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }

}
