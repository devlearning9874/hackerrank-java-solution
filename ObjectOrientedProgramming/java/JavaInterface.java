package hackerrank.ObjectOrientedProgramming.java;


import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
//Implemented Interface AdvancedArithmetic
class MyCalculator implements AdvancedArithmetic{

    public int divisor_sum(int n){

        int sum = 0;

        for(int i=1; i<=n; i++){

            if(n%i == 0){
                sum = sum + i;
            }

        }
        return sum;
    }

}

public class JavaInterface {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        MyCalculator my_calculator = new MyCalculator();

//        System.out.println("I implemented : "+ my_calculator.getClass());
        System.out.println(my_calculator.divisor_sum(n));
    }
}

// Sample Input
// 6
// Sample Output:  12