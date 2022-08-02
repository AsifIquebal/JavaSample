package com.company.immutable;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Person1 {
    private final String name;
    private final Date birthday;
    private final List hobbies;
    public Person1(String name, Date birthday, List hobbies) {
        this.name = name;
        this.birthday = birthday;
        this.hobbies = hobbies;
    }
    public String getName() {
        return name;
    }
    public Date getBirthday() {
        return (Date) birthday.clone();
    }
    public List getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", birthday=" + birthday + ", hobbies="
                + hobbies + "]";
    }
}
