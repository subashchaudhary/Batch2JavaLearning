package javabasic;



//java file is alway with .java extension as: Main.java

//always the class name should be same as file name, and First letter should be capital
public class HelloWorldProgram extends Object{

    //This is the main method, which tells the JVM, from where the applciation should be started

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Fan fan = new Fan();
        System.out.println(fan);
    }
}

class Fan{

    @Override
    public String toString() {
        return "Fan Object";
    }
}

