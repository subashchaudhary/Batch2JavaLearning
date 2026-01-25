package javabasic;

import java.util.Scanner;

//class definition (using keyword class)
public class ClassObject {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("\n 1. Start Fan");
        System.out.println("\n 2. Stop Fan");

        int choice =  sc.nextInt();// integer type input
        //object creation
        Fan fan = new Fan(); //implict call while creating object
        fan.color = "brown";
        fan.name = "Unity";
        fan.modleNumer = "UN-001";
        fan.noFoBlades = 3;

        Fan fan2 = new Fan();
        fan2.color = "black";
        fan2.name = "Unity";
        fan2.modleNumer = "UN-002";
        fan2.noFoBlades = 4;

        if(choice == 1) {
            fan.start(); //method call

        }else if(choice == 2) {
            fan.stop();
        }

        System.out.println(" fan1: " + fan);
        System.out.println(" fan2: " + fan2);


        //static

        Student student = new Student();
        student.setFullName("Roshan Kafle");
        student.setAddress("Butwal");
        student.setEmail("roshan@gmail.com");
        student.setPhone("0840324820");
        System.out.println(" student name: " + student.getFullName());



    }

}


class Fan {

    //constructor
    Fan(){
        System.out.println("Constructor Called.");
    }

    //variables( charactristics
     String name;
     String modleNumer;
     String color;
     int noFoBlades;



    public int getNoFoBlades() {
        return noFoBlades;
    }
    public String getName() {
        return name;
    }

    //function definition
     void start(){

         //logic that will trigger the motor start
         System.out.println("Fan started");
     }



     //function definiton
     void stop(){
         System.out.println("Fan stopped");
     }

    @Override
    public String toString() {
        return "Fan{" +
                "name='" + name + '\'' +
                ", modleNumer='" + modleNumer + '\'' +
                ", color='" + color + '\'' +
                ", noFoBlades=" + noFoBlades +
                '}';
    }
}


/// static keyword


class Student {


    //Access Modifier
    //public, private, default, protected
   private String fullName;
   private String address;
   private String phone;

   private String email;
   private static String clz_name;

   ///getter and setter methods
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getClz_name() {
        return clz_name;
    }

    public static void setClz_name(String clz_name) {
        Student.clz_name = clz_name;
    }
}