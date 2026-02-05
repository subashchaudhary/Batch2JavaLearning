package oop.inheritance;


//inheritance : using extends keyword

public class DomesticAnimal extends Animal{

    @Override
    public void eat(){
        System.out.println("Domestic Animal Eating");
    }

    @Override
    public void producSound(){
        System.out.println("Domestic Animal is Producing Sounds");
    }

}
