package javabasic;

import java.util.Scanner;

public class TakeUserInput {

    public static void main(String[] args) {

        //Taking user input in Java
        //1. Using Scanner class

        Scanner scanner = new java.util.Scanner(System.in); //this is to take input from console
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
