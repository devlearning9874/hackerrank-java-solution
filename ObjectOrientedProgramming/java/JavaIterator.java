package hackerrank.ObjectOrientedProgramming.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    static Iterator func(ArrayList myList){

        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object element = it.next();
            if(element.equals("####")){
                break;
            }
        }
        return it;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList myList = new ArrayList();
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i=0; i<n; i++){
           myList.add(in.nextInt());
        }

        myList.add("####");

        for(int i=0; i<m;  i++){
            myList.add(in.next());
        }

        Iterator it = func(myList);

        while (it.hasNext()){
            Object value = it.next();
            System.out.println((String) value);
        }
    }
}

// Sample Input

/*

2 3
5 4
"Ram" "Shyam" "Mohan"

 */

// Sample Output
/*

"Ram"
"Shyam"
"Mohan"

 */