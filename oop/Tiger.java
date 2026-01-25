package oop;

public class Tiger extends WildAnimal{

    private String name;

    //overriding the parent behaviour
    @Override
    public void producSound() {
        System.out.println("Producting Sound : Roar");
    }
}
