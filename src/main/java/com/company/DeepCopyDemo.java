package com.company;

class Courses implements Cloneable {
    String subject1;
    String subject2;

    public Courses(String sub1, String sub2) {
        this.subject1 = sub1;
        this.subject2 = sub2;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Students implements Cloneable {
    int id;
    String name;
    Courses courses;

    public Students(int id, String name, Courses courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    //Overriding clone() method to create a deep copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        Students students = (Students) super.clone();
        students.courses = (Courses) courses.clone();
        return students;
    }
}

public class DeepCopyDemo {
    public static void main(String[] args) {
        Courses science = new Courses("Physics", "Chemistry");
        Students student1 = new Students(111, "John", science);
        Students student2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            student2 = (Students) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Printing the subject2 of 'student1'
        System.out.println(student1.courses.subject2);//Output : Chemistry
        //Changing the subject2 of 'student2'
        student2.courses.subject2 = "Maths";
        //This change will not be reflected in original student 'student1'
        System.out.println(student1.courses.subject2); //Output : Chemistry
        System.out.println(student1==student2);//false
        System.out.println(student1.equals(student2));//false
        System.out.println(student1.id==student2.id);//true
        System.out.println(student1.name==student2.name);//true
        System.out.println(student1.name.equals(student2.name));//true
    }
}
