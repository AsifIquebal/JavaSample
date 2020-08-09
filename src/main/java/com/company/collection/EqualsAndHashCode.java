package com.company.collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsAndHashCode {

    @Test
    public void test01() {
        Student student1 = new Student(1,"amar","commerce");
        Student student2 = new Student(2,"akbar","science");
        Student student3 = new Student(3,"anthony","arts");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Student student = new Student(1,"amar","commerce");

        if(students.contains(student)){
            System.out.println("Already there");
        }else {
            System.out.println("Doesn't exists");
        }
    }


}

class Student {
    int id;
    String name;
    String section;

    public Student(int i, String amar, String commerce) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId();
    }*/

    @Override
    public boolean equals(Object object){
        Student student = (Student)object;
        return getId()==student.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}