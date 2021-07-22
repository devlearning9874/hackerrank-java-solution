package hackerrank.Strings.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class stringToken {

    public static String[] Token(String str){

        String[] res = str.split("[ !,?._'@]+"); //included blank space in regex
        return res;


    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String!");
        String str = scan.nextLine();

        String[] result = Token(str);
        int n = result.length;
        System.out.println(n);
        for(String i: result){
            System.out.println(i);
        }

        scan.close();
    }

}
