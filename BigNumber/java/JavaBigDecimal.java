package hackerrank.BigNumber.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        BigDecimal bigArr[] = new BigDecimal[n];

        for(int i=0; i<n; i++){
            BigDecimal val = in.nextBigDecimal();

            bigArr[i] = val;
        }
        System.out.println("Print Big Decimal:");
       for(int i=0; i<n; i++){
           System.out.println(bigArr[i]);
       }

         // Sorting

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if(bigArr[i].compareTo(bigArr[j]) < 0){
                    BigDecimal temp = bigArr[i];
                    bigArr[i] = bigArr[j];
                    bigArr[j] = temp;
                }
            }
        }

             //     After Sorting Printed
        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.println(bigArr[i]);
        } 
    }

}
// Input:
//9
//-100
//50
//0
//56.6
//90
//0.12
//.12
//02.34
//000.000

// After Sorting

//90
//56.6
//50
//02.34
//0.12
//.12
//0
//000.000
//-100
