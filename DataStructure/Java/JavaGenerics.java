package hackerrank.DataStructure.Java;

class Printer{

       static <T> void printArray(T element[]){

           for (T val: element){
               System.out.println(val);
           }
       }

}


public class JavaGenerics {

    public static void main(String[] args) {

        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}
