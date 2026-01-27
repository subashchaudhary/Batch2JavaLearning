package oop.abstraction;

import java.util.Scanner;

//Abstraction : hiding the internal Implementtion only show the
public class AbstractionDemo {


    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("1. Withdraw Amount \n");

        System.out.println("Enter choice:");
       int choice = sc.nextInt();
       switch (choice) {
           case 1:
               System.out.println("Processing for withdrawl");
       }

        Car car = new CarB();
        car.run();
    }


}


interface Car{


    public void run();
}


class CarA implements Car{


    @Override
    public void run() {
        System.out.println("Car A is  moving");
    }
}

class CarB implements Car{


    @Override
    public void run() {
        System.out.println("Car B is  moving");
    }
}




