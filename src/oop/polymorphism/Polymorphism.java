package oop.polymorphism;

//Polymorphism: 1. Overloading , 2. Overriding
public class Polymorphism {


    public static void main() {


        Addition addition = new Addition();

        System.out.println(addition.add(4, 5));

        float restul = addition.add(110.34f, 112.42f);



        DrawCircle drawCircle = new DrawCircle();
        Draw draw = new Draw();
        PlantEatingAnimal plantEatingAnimal = new PlantEatingAnimal();
      //  Animal animal = new Animal(); //cannt create an object of interface
    }

}

//Overriding
class Draw {


    public void draw() {
        System.out.println("Drawing somethng");
    }
}


class DrawCircle extends  Draw {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

interface Animal{
    public void eat();
}

class PlantEatingAnimal implements Animal{

    @Override
    public void eat() {
        System.out.println("Eating only plants");
    }
}






//
class Addition {


    //method overloading(same name but multiple arguments, or data types)
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    float add(float a, float b){
        return a + b;
    }
    float add(float a, float b, float c){
        return  a + b + c;
    }
}
