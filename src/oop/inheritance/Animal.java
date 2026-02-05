package oop.inheritance;

public class Animal extends Object{

    private String name;
    private String types; //domestic or wild

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }


    //functions


    public void eat(){
        System.out.println("Animal is Eating");
    }

    public void producSound(){
        System.out.println("Animal is Producing Sounds");
    }
}
