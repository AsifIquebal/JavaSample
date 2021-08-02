package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Optional;

public class OptionalDemo {
    private String data1;
    private String data2 = "Hello World!";

    @Test
    public void test01() {
        // ofNullable Returns an Optional describing the specified value,
        // if non-null, otherwise returns an empty Optional.
        Optional<String> optional = Optional.ofNullable(data1);
        // Check if value is present i.e. value is not null
        if (optional.isPresent()) {
            System.out.println(optional.get().length());
        } else {
            System.out.println("FirstName has no value.");
        }
        // orElse : return a default value if value not present
        System.out.println(Optional.ofNullable(data1).orElse("test1"));
        System.out.println(Optional.ofNullable(data2).orElse("test2"));
    }

}
