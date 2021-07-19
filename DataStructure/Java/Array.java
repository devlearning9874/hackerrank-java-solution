package hackerrank.DataStructure.Java;

import java.util.Scanner;

public class Array {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int arr[]  = new int[n];

        for(int i=0;  i<n; i++) arr[i] = in.nextInt();
        for(int i=0; i<n; i++) System.out.println(arr[i]);
    }

}
// Sample Input
/*
5
10
20
30
40
50
 */

// Sample Output
/*
10
20
30
40
50
 */