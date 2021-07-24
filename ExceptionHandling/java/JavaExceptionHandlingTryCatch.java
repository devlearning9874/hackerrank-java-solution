package hackerrank.ObjectOrientedProgramming.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            try{
                int x = in.nextInt();

                int y = in.nextInt();
                int res = x/y;
                System.out.println(res);
            }catch(ArithmeticException | InputMismatchException e){

                if(e instanceof ArithmeticException){
                    System.out.println("java.lang.ArithmeticException: / by zero");
                }else if(e instanceof  InputMismatchException ){
                    System.out.println("java.util.InputMismatchException");
                }
            }
    }
}


//    Sample Input 0:
//
//        10
//        3
//        Sample Output 0:
//
//        3
//        Sample Input 1:
//
//        10
//        Hello
//        Sample Output 1:
//
//        java.util.InputMismatchException
//        Sample Input 2:
//
//        10
//        0
//        Sample Output 2:
//
//        java.lang.ArithmeticException: / by zero
//        Sample Input 3:
//
//        23.323
//        0
//        Sample Output 3:
//
//        java.util.InputMismatchException