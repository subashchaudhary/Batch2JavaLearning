package exception;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {


    static void main() throws  NumberFormatException, FileNotFoundException, Exception {


        Scanner sc = new Scanner(System.in);  //
        System.out.println("Enter value");
        String input  = sc.nextLine();


        try {

            Integer.parseInt(input);
            //

            throw new Exception();

        }catch (NumberFormatException e){
            System.out.println("Invalid: Value should be numberic");
            //throw new NumberFormatException();
        }catch (Exception e){
            System.out.println("Exception occurs");
           // throw e;
        }

       // System.out.println("completed");
    }
}


//throw : used inside the function
//thorws : used in the method signature, can be multiple exception (comma separated)
