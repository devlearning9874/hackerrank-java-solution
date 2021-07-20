package hackerrank.DataStructure.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        HashMap<String, Integer> hm = new HashMap<String,Integer>();

        for(int i=0; i < n; i++){
            String name = br.readLine();
            int phoneNumber = Integer.valueOf(br.readLine());
            hm.put(name, phoneNumber);

        }


                   String key;
                while ((key = br.readLine()) != null){

                   if(hm.containsKey(key)){
                       System.out.println(key+"="+hm.get(key));
                    }else{
                        System.out.println("Not found");
                    }
                }

                br.close();

    }
}

// Sample Input

/*

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

 */

// Sample Output

/*

uncle sam=99912222
Not found
harry=12299933

 */
