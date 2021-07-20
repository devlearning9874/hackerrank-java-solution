package hackerrank.DataStructure.Java;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String opsName = in.next();

            switch (opsName.charAt(0)) {

                case 'A':
                    if (in.nextInt() == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case 'O':
                    if (in.nextInt() == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case 'X':
                    if (in.nextInt() == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case 'F':
                    if (in.nextInt() == 1) {
                        b1.flip(in.nextInt());
                    } else {
                        b2.flip(in.nextInt());
                    }
                    break;
                case 'S':
                    if (in.nextInt() == 1) {
                        b1.set(in.nextInt());
                    } else {
                        b2.set(in.nextInt());
                    }
                    break;

            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
            if(in.hasNext()){
                in.nextLine();
            }
        }
    }
}

// Sample Input

/*
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1


 */

// Sample Output

/*

0 0
1 0
1 1
1 2

 */