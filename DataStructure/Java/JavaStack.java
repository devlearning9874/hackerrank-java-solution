package hackerrank.DataStructure.Java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static boolean  isBalancedParantheses(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char val = str.charAt(i);
            if(val == '[' || val == '{' || val == '(' ) {
                st.push(val);
                continue;
            }


            if(st.empty()) return false;

            char x;
            switch (val){

                case ')':
                    x = st.pop();
                    if(x == '[' || x == '{')
                        return false;
                    break;
                case '}':
                    x = st.pop();

                    if(x == '[' || x == '(')
                       return false;
                    break;
                case ']':
                    x = st.pop();
                    if(x == '{' || x == '(')
                        return false;
                    break;
            }
        }
        return (st.empty());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        while((str = in.nextLine()) != null){

            boolean check = isBalancedParantheses(str);
            if(check){
                System.out.println("true");
            }else {
                System.out.println("false");
            }


        }
    }
}

// Sample Input

/*


{}()
({()})
{}(
[]
 */

// Sample Output

/*

true
true
false
true

 */