package oop;

public class Dog extends DomesticAnimal{

    private String name;

    @Override
    public String getName() {
       return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void producSound() {
        //super.producSound();

        System.out.println("Animal is Producing Sounds: Bark");
    }


    //toString()
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
