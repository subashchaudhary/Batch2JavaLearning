package javabasic;
//single line comment


public class JavaDataTypes {

    //This is the main method, which tells the JVM, from where the applciation should be started

    public static void main(String[] args){

        System.out.println("Hello World!, I am starting my learning of Java Programming Language");

        //variable declaration rules in Java
        //1. should start with letter (A-Z or a-z) or _ or $
        //2. after first letter, can contain letters, digits(0-9), _
        //3. no spaces allowed
        //4. case sensitive
        //5. cannot use reserved keywords of Java

        String first_name = "Subash";
        String FIRST_NAME = "Kumar"; //case sensitive variable names

       String last_name = "Kumar";


       //varibale data types
         //1. Primitive data types: byte, short, int, long, float, double

        // byte: 1 byte = 8 bits, range: -128 to 127


         byte b = 127;

         System.out.println("Byte value: " + b);


        //2. Non-primitive data types: String, Arrays, Classes, Interfaces

        // expression:
        //1. Arithemetic expressions: +, -, *, /, %
        //2. Relational expressions: ==, !=, >, <, >=, <=
        //3. Logical expressions: &&, ||, !



        String full_name = first_name + " " + last_name;

        System.out.println("My name is: " + first_name + " " + last_name);

    }

}