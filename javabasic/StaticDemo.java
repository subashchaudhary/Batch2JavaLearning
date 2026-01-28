package javabasic;

public class StaticDemo {


    static void main() {


        Employee employee = new Employee(); //creating instance

        //accessing instance methods
        employee.setName("Mohan");
        employee.setAddress("Banglore");
        employee.setPhone("98074927592");

        //accessing static method
        Employee.getDepartment();

    }
}



class Employee {

    // instance variable
    private String name;
    private String address;
    private String phone;

    private static  String department;  //class level variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        department = getDepartment();
    }


    //static methods (class methods)
    public static String getDepartment() {
        return department;

    }

    public static void setDepartment(String department) {
        Employee.department = department;
    }

    //rules
    //1. Inside static block we cannot access not-satic variable or methods
    //2. Inside not static block we can access static variable and functions [look at line: 55]

}
