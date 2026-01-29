package javabasic;

public class ConstructorDemo {


    static void main() {


        Student s1 = new Student(); //default constructor is called

        Student s2 = new Student();

        Student s3 = new Student();

        Student s4 = new Student(12, "Mohit", "Butwal", "07070707070");


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}


class Student {

    private int rollNo;
    private String name;
    private String address;
    private String phone;

    //constructor: default constructor
    public Student(){
        System.out.println("Default Constructor called");
    }

    public Student(int rollNo, String name){

    }
    //parameterized constructor
    public Student(int rollNo, String name, String address, String phone){
        System.out.println("Parameterized constructor called");

        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }




    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}