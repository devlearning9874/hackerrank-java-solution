package hackerrank.DataStructure.Java;

//We can solve this problem using Brute Force Approach in O(n^2) Time Comlexity
// Time Complexity ---> O(n) using Kadan's Algorithm
//Check for optimised Solution

import java.util.Scanner;

public class JavaSubArray {

    public static int getNumerOfNegativeSumSubArray(int arr[], int n) {

        int count = 0;
        int minSum = 0;

//        for(int i=0; i<n; i++) if(arr[i] < 0) count++;

// 1 -2 4 -5 1
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                minSum = minSum + arr[j];
                if (minSum < 0) {
                    count++;
//                    System.out.println("True"+i);
                }
                ;
            }
            minSum = 0;
        }

        return count;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            arr[i] = val;
        }

        int result = getNumerOfNegativeSumSubArray(arr, n);

        System.out.println(result);


    }
}

// Sample Input
/*
 5
1 -2 4 -5 1

 */
//output --> 9
