package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Note:- Check for Hackerrank solution How did you used RegExe;

public class ValidUserName {

    public static boolean userNameValidator(int n, String userName){

        if (n > 30 || n < 8) {
            return  false;
        }

        char firstIndex = userName.charAt(0);
        boolean checkNumeric = Character.isDigit(firstIndex);
        if(checkNumeric) return false;
        boolean checkChar = (Character.isDigit(firstIndex) || Character.isLetter(firstIndex) || Character.isWhitespace(firstIndex));
        if(!checkChar) return false;
        Pattern pattern = Pattern.compile("[ !,?.'@]+");
        Matcher matcher = pattern.matcher(userName);
        boolean match = matcher.find();
        if(match) return false;

        return true;
    }


    public static void main(String args[]){

        Scanner in = new Scanner( System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){


            String userName = in.nextLine();

            int n  = userName.length();

            boolean result = userNameValidator(n, userName);

            if(result){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }

            testCases--;
        }


    }

}
//Julia
//Samantha
//Samantha_21
//1Samantha
//Samantha?10_2A
//JuliaZ007
//Julia@007
//_Julia007

//Invalid
//Valid
//Valid
//Invalid
//Invalid
//Valid
//Invalid
//Invalid