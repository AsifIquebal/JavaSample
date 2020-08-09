package com.company;

class Course {
    String subject1;
    String subject2;
    public Course(String sub1, String sub2) {
        this.subject1 = sub1;
        this.subject2 = sub2;
    }
}

class Student implements Cloneable {
    int id;
    String name;
    Course course;
    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    @Override
    //Default version of clone() method. It creates shallow copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopyDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Physics", "Chemistry");
        Student student1 = new Student(111, "John", c1);
        Student student2 = null;
        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student1.course.subject2);//Output : Chemistry
        // changing the subject2 of student 2, it reflects in student 1 too
        student2.course.subject2 = "Maths";
        System.out.println(student1.course.subject2);//Output : Maths
        // checking
        System.out.println(student1==student2);//false
        System.out.println(student1.equals(student2));//false
        System.out.println(student1.id==student2.id);//true
        System.out.println(student1.name==student2.name);//true
        System.out.println(student1.name.equals(student2.name));//true
    }
}