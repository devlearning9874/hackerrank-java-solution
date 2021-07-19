package hackerrank.DataStructure.Java;
// VVI Revise Again
import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

        public static void main(String args[]){

            Scanner in = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            int node = in.nextInt();

            for(int i=1; i<=node; i++){

                int size = in.nextInt();
                for(int s=0; s<size+1; s++){
                    list.add(new ArrayList<Integer>());
                }
                for(int k=1; k<=size; k++){
                    int val = in.nextInt();
                    list.get(i).add(val);
                }
            }

            // Now Query
            int numberOfQuery = in.nextInt();

            for(int j=0; j<numberOfQuery; j++){

                int row = in.nextInt();
                int col = in.nextInt();

                try {
                    System.out.println(list.get(row).get(col-1));
                }catch (IndexOutOfBoundsException e){
                    System.out.println("ERROR!");
                }
            }
        }

}

// Sample Input
/*

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

 */

// Sample Output
/*

74
52
37
ERROR!
ERROR!

 */