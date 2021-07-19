package hackerrank.DataStructure.Java;

import java.util.Scanner;

public class Java2DArrayHourglass {

        public static void main(String args[]){
            Scanner in = new Scanner(System.in);

            int m = 6;
            int n  = 6;

            int arr[][] = new int[6][6];

            for(int i=0; i<m; i++){

                for(int j=0; j<n; j++){
                    int val = in.nextInt();
                    arr[i][j] = val;
                }
            }
//            System.out.println("print");
//
//            for(int i=0; i<m; i++){
//
//                for(int j=0; j<n; j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//
//                System.out.println();
//            }


            int p = 4;
            int q = 4;
            int hourGlassSum = 0;

            int firsRow = 0, middle = 0, lasRow = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0; i<p; i++){

                    for(int j=0; j<q; j++) {

                        firsRow = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        middle = arr[i + 1][j + 1];
                        lasRow = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                        hourGlassSum = firsRow + middle + lasRow;
                        System.out.print(hourGlassSum+ " ");
                        if(hourGlassSum > max){
                            max = hourGlassSum;
                        }
                    }
                    System.out.println();
            }

            System.out.println("Finally");
            System.out.println("Maxm Hourglass Sum: "+max);



        }

}

// Sample Input
/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

 */

/*
Houtglass
       1 1 1
       0 1 0
       1 1 1
 */

// Sample Output

/*

19

 */
