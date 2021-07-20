package hackerrank.DataStructure.Java;

import java.security.KeyPair;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] pair_left = new String[n];
        String[] pair_right = new String[n];

        for(int i=0; i<n; i++){
            pair_left[i] = in.next();
            pair_right[i] = in.next();
        }

        HashSet<String> hs = new HashSet<>();

        for(int i=0; i<n; i++){
            String val = pair_left[i]+" "+pair_right[i];
            hs.add(val);
            System.out.println(hs.size());
        }

    }
}


//Sample Input

/*

5
john tom
john mary
john tom
mary anna
mary anna
 */

// Sample Output
/*
1
2
2
3
3

 */