package oop.inheritance;

public class InheritanceDemo {



    public static void main() {


        Dog dog = new Dog();
        dog.setName("Harry");
        dog.setTypes("Domestic");


        dog.producSound();

        System.out.println(dog);














        //object of child class
//        DomesticAnimal animal = new DomesticAnimal();
//        animal.setName("Dog");
//        animal.setTypes("Domestic Animal");
//
//
//        //method call
//        animal.producSound();
//
//        WildAnimal wildAnimal = new WildAnimal();
//        wildAnimal.setName("Tiger");
//        wildAnimal.setTypes("Wild Animal");

 //.       animal.eat();



    }
}
