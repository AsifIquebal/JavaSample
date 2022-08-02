package com.company.immutable;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class App {
    @Test
    public void breakImmutability01() {
        Calendar cal = Calendar.getInstance();
        cal.set(1982, 4, 21);
        Date birthDate = cal.getTime();

        List<Object> hobbies = new ArrayList<>();
        hobbies.add("Painting");
        hobbies.add("Travelling");
        hobbies.add("Fitness");

        Person robin = new Person("Robin", birthDate, hobbies);
        System.out.println("Before");
        System.out.println(robin);

        // if it's immutable you can't change the object
        Date birthday = robin.getBirthday();
        birthday.setTime(System.currentTimeMillis());

        List originalHobbies = robin.getHobbies();
        originalHobbies.remove(0);
        originalHobbies.remove(0);

        System.out.println("After");
        System.out.println(robin);

    }
    @Test
    public void breakImmutability02() {
        Calendar cal = Calendar.getInstance();
        cal.set(1982, 4, 21);
        Date birthDate = cal.getTime();

        List<Object> hobbies = new ArrayList<>();
        hobbies.add("Painting");
        hobbies.add("Travelling");
        hobbies.add("Fitness");

        Person1 robin = new Person1("Robin", birthDate, hobbies);
        System.out.println("Before");
        System.out.println(robin);

        // if it's immutable you can't change the object
        Date birthday = robin.getBirthday();
        birthday.setTime(System.currentTimeMillis());

        List originalHobbies = robin.getHobbies();
        originalHobbies.remove(0);
        originalHobbies.remove(0);

        System.out.println("After");
        System.out.println(robin);

    }
}
