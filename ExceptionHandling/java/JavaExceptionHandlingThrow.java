package hackerrank.ObjectOrientedProgramming.java;


import java.util.Scanner;

class MyCalculators {

    public static long power (int n, int p) throws Exception{

        if(n==0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }else if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        else{
            return (long)Math.pow(n,p);
        }

    }
}


public class JavaExceptionHandlingThrow {



        public static void main(String[] args) {

       MyCalculators my_calculator = new MyCalculators();
       Scanner in = new Scanner(System.in);
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }


}

//    Sample Input 0
//
//        3 5
//        2 4
//        0 0
//        -1 -2
//        -1 3
//        Sample Output 0
//
//        243
//        16
//        java.lang.Exception: n and p should not be zero.
//        java.lang.Exception: n or p should not be negative.
//        java.lang.Exception: n or p should not be negative.