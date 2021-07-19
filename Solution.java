package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void getSmallestAndLargest(String s, int k){

        String smallest = "";
        String largest = "";

//        ArrayList<String> list = new ArrayList<String>();
//
//       for(int i=0; i<=s.length()-k; i++){
//
//           String sub = s.substring(i,i+k);
//
//           list.add(sub);
//       }
//
//        Collections.sort(list);
//
//       int size = list.size();
//
//       smallest = list.get(0);
//       largest = list.get(size-1);
//
//        return smallest+ "\n" +largest;

        int n = s.length() - k;

        String list[] = new String[n+1];

        for(int i=0; i<=s.length()-k; i++){

            String sub = s.substring(i,i+k);

            list[i] = sub;
        }

        for(int i=0; i<n; i++){

            for(int j=i+1; j<=n; j++){

                if(list[i].compareTo(list[j])>0){

                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                }
            }
        }

//        int size = list.size();

//        for(int i=0; i<=n; i++){
//            System.out.println(list[i]);
//        }

        smallest = list[0];
        largest = list[n];

        System.out.println(smallest+" "+ largest);

//        return smallest + "\n" + largest;

    }

    public static void main(String args[]){

        getSmallestAndLargest("welcometojava", 3);

    }


}
