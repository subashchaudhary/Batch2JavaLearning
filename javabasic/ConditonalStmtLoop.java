package javabasic;

public class ConditonalStmtLoop {

    public static void main(String[] args) {

        //condition statements: if, if-else, switch

        //syntax: (either true or false)
//        if(condition){
//           //if block
//        }else{
//            //else block
//        }

        boolean condition = 10 < 5;

        if(condition){
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }
        //2. if-else if ladder
        boolean condition2 = 10 < 5;
        //syntax:
        if(condition){

        }else if(condition2){

        }else{

        }


        //3. Switch statement
        // syntax:
        int value = 2;
        switch (value){
            case 1:
                //code block
                break;
            case 2:
                //code block
                System.out.println("Value is 2");
                break;
            default:
                //code block
        }

        //loops in Java
        //1. for loop
        for(int i=0; i<5; i++) {
            System.out.println("For loop iteration: " + i);
        }
        //2. while loop
        int j = 0;
        while(j < 5){
            System.out.println("While loop iteration: " + j);
            j++;
        }
        //3. do-while loop
        int k = 0;
        do{
            System.out.println("Do-While loop iteration: " + k);
            k++;
        }while(k < 5);


        //
        int a[] = {1,2,3,4,5}; //array declaration and initialization
        //enhanced for loop
        for(int num : a) {
            System.out.println("Enhanced for loop value: " + num);
        }



        //task for today:
        //1. write a program to find the largest of three numbers using if-else statements
        //2. write a program to print the first 10 natural numbers using for loop
        //3. write a program to print the sum of first 10 natural numbers using while loop

    }
}
