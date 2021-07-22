package hackerrank.DataStructure.Java;

import java.util.Scanner;

public class Java1DArrayPart2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfQuery = in.nextInt();

        for(int i=0; i < numberOfQuery; i++){
            boolean check = false;
            int n = in.nextInt();  // Array Size
            int leap = in.nextInt();

            int array[] = new int[n];

            for(int j=0; j < n; j++){
                int value = in.nextInt();
                array[j]  = value;
            }
            int looping =  0;
            int ik = 0;
            while(looping < n){

                if(array[ik+1] == 0 && ik <n){
                    if(looping+leap >= n){
                        check = true;
                        break;
                    }
                    ik++;
                    looping++;
                }else{
                    break;
                }

            }
            if(check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

}

//Sample Input

/*

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0

 */

//Sample Output

/*

YES
YES
NO
NO


 */