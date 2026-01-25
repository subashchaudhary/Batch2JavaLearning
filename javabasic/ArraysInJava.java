package javabasic;

public class ArraysInJava {

   public static void main() {


       System.out.println("learnig Array in Java");

       //Declaration
       //type 1: arary Literal
       int []nums = {2, 4, 5, 11, 20};  //array literal
       System.out.println(nums[1]);



       //Type: using new operator
       String []names = new String[5];

       names[0] = "John";
       names[1] = "Mary";
       names[2] = "Jane";
       names[3] = "Joe";
       names[4] = "Johnson";




       int length = nums.length;

       for(int i = 0; i < length ; i++){
           System.out.println(nums[i]);
       }


       System.out.println("Names list:");
       for(int i = 0; i < names.length ; i++){
           System.out.println(names[i]);
       }



       //two-dimensional array
       int [][]mat = new int[4][4];

       mat[0][0] = 2;
       mat[0][1] = 4;
       mat[0][2] = 7;
       mat[0][3] = 11;
       mat[1][0] = 5;
       mat[1][1] = 6;
       mat[1][2] = 8;
       mat[1][3] = 11;
       mat[2][0] = 9;
       mat[2][1] = 8;
       mat[2][2] = 6;
       mat[2][3] = 11;
       mat[3][0] = 10;
       mat[3][1] = 9;
       mat[3][2] = 6;
       mat[3][3] = 11;


       System.out.println("printing matrix value");

       for(int i = 0; i < 4 ; i++){

           for(int j = 0; j < 4 ; j++){
               System.out.print(mat[i][j]+ " ");  //nums[0][0],  nums[0][1], nums[0][2]....num[1][0]..
           }
           System.out.println();
       }

    }

}
