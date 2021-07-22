package hackerrank.ObjectOrientedProgramming.java;

class Animals{

    void walk(){
        System.out.println("I am Walking.");
    }
}
class Birds extends Animals{
    void fly(){
        System.out.println("I am Flying.");
    }
    void sing(){
        System.out.println("I am Singing.");
    }

}


public class JavaInheritance {

    public static void main(String[] args) {
        Birds obj = new Birds();
        obj.walk();
        obj.fly();
        obj.sing();

    }
}
