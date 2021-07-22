package hackerrank.DataStructure.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

        public static void main(String args[]){
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();


            for(int j=0; j <n; j++){
                int val =in.nextInt();
               list.add(val);
            }

            int numberOfQuery = in.nextInt();

            for(int i=0; i<numberOfQuery; i++){

                   String queryType = in.next();

                   if(queryType.equals("Insert")){

                       int pos = in.nextInt();
                      int val = in.nextInt();
                       list.add(pos,val);
                       n++;
                   }

                   if(queryType.equals("Delete")){
                       int pos = in.nextInt();
                       list.remove(pos);
                       n--;
                   }
            }

            for(int i=0; i<n; i++){
                System.out.print(list.get(i)+" ");
            }
        }

}


// Sample Input

/*

5
12 0 1 78 12
2
Insert
5 23
Delete
0


 */

// Sample Output

/*

0 1 78 12 23


 */