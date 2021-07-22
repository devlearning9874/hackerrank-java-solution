package hackerrank.ObjectOrientedProgramming.java;

class Arithmetic{   // Super Class

    public int Sum(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{

}

public class JavaInheritance2 {

    public static void main(String[] args) {

        Adder obj = new Adder();

        System.out.println("My SuperClass is:"+ obj.getClass().getSuperclass().getName());

        System.out.println(obj.Sum(5,4)+" "+obj.Sum(6,9)+" "+obj.Sum(10,5));
    }
}
