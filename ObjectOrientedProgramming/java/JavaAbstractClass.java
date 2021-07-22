package hackerrank.ObjectOrientedProgramming.java;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

class MyBook extends Book{

    public void setTitle(String s){
        this.title = s;
    }
}

public class JavaAbstractClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String title = in.nextLine();

        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);

        System.out.println("The title is: "+ new_novel.getTitle());
    }
}

// Sample Input
// A Tale of Two Cities

//Output: The title is: The Tale of Two Cities
