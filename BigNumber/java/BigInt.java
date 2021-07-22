package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;


public class BigInt {

    public static void main(String args[]){

        Scanner in = new Scanner( System.in);

        BigInteger sum;
        BigInteger mult;

        BigInteger a = in.nextBigInteger();
        BigInteger b  = in.nextBigInteger();

        sum = a.add(b);
        mult = a.multiply(b);

        System.out.println(sum);
        System.out.println(mult);

    }
}

// Sample Input:
// 1234  20
// Sample Output:
// 1254   24680
