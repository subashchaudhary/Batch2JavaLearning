package java8;

public class DefaultStaticInInterface {

    static void main() {

    }
}


interface MyInterface {

    //all the method in interface are public and abstract by default

    void method1();
    void method2();



    //From java 8: we can have default and static method in interface


    //default method

    default void show(){
        System.out.println("This is a default method in interface");
    }

    //static method


    //if all the child class needs common functionality then we can use static method in interface
    static void display(){
        System.out.println("This is a static method in interface");
    }

}