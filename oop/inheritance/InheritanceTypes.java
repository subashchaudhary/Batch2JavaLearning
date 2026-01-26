package oop.inheritance;

public class InheritanceTypes {


   public static void main() {


       //start applicaiton

    }



}

//Interface

//interface A{
//    public void method1();
//}
//
//class B implements A{
//
//}

class Vehicle {

    public void start(){
        //
    }
}


interface PertrolVehicle  {

    public void startByPetrol();
}

interface EVVehicle{

    public void startByBattery();
}


class WifiVehicle implements PertrolVehicle, EVVehicle{


    @Override
    public void startByBattery() {

    }

    @Override
    public void startByPetrol() {

    }
}


