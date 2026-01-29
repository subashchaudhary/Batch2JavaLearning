package exception;

public class ExceptionTypes {


    static void main() {

        SomeService someService = new SomeService();

        //1. we have to handle the checked exception (by using try-catch block or by throwing that exception as :throws)
        try {
            someService.doSomething();
        }catch (MyException1 myException1){

        }

        //2. no need to handle the unchecked exception

        someService.printSomething();


    }

}


class SomeService{


    //this is throwing checked exception
    public void doSomething() throws MyException1{



    }

    public void printSomething() throws MyException3{

    }
}


/// checked exception

class MyException1 extends Exception {
}
class MyException2 extends Exception {
}


/// unchecked exception

class MyException3 extends RuntimeException {



}


