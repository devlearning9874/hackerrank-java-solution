package hackerrank.DataStructure.Java;

//We can solve this problem using Brute Force Approach in O(n^2) Time Comlexity
// Time Complexity ---> O(n) using Kadan's Algorithm

import java.util.Scanner;

public class JavaSubArray {

    public static int getMaxSumSubArray(int arr[], int n){

        int maxSum = Integer.MIN_VALUE;
        int sumEnds = 0;
        int count = 0;

        for(int i=0; i <n; i++){
            sumEnds = sumEnds + arr[i];
            if(maxSum < sumEnds){
                maxSum = sumEnds;
            }

            if(sumEnds < 0){
                count++;
                sumEnds = 0;
            }
        }
        System.out.println(count);
        return maxSum;
    }

    public static void main(String args[]){

        Scanner in =  new Scanner(System.in);

        int n = in.nextInt();

        int arr[] =  new int[n];

        for(int i=0; i<n; i++){
            int val = in.nextInt();
            arr[i] = val;
        }

        int result = getMaxSumSubArray(arr,n);

        System.out.println(result);


    }
}

// Sample Input
/*
 5
1 -2 4 -5 1

 */
//output --> 9
