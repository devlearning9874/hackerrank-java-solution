package hackerrank.DataStructure.Java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int slide = in.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            int val = in.nextInt();
            dq.add(val);
        }
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n-1; i++){

            int first = dq.getFirst();
//            System.out.println(first);
            dq.removeFirst();

            int second = dq.getFirst();
//            System.out.println(second);
           dq.removeFirst();

            int third = dq.getFirst();
//            System.out.println(third);
            dq.removeFirst();

//            System.out.println(first+" "+second+" "+ third);

            if(first != second ){
                count++;
                if(third != first &&  third != second){
                    count++;
                }
            }else if(second != third){
                count++;
            }


            if(count > max){
                max = count;
            }
//            System.out.println(count +" "+ max);
            dq.addFirst(third);
            dq.addFirst(second);
            count = 1;



        }
        System.out.println(max);

    }
}

// Sample Input
/*

6 3
5 3 5 2 3 2

 */

// Sample Output

/*

3


 */