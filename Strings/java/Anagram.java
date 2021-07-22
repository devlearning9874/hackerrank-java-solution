package hackerrank.Strings.java;

public class Anagram {

    public static void sortArray(int arr[], int n){

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static boolean isAnagram(String a, String b){

          String s1 = a.toLowerCase();
          String s2 = b.toLowerCase();

          int ns1 = s1.length();
          int ns2 = s2.length();


          if(ns1 == ns2){
              int as1[] = new int[ns1];
              int as2[] = new int[ns2];

              for(int i=0; i<ns1; i++){
                  as1[i] = (int)s1.charAt(i);

              }

              for(int i=0; i<ns2; i++){
                  as2[i] = (int)s2.charAt(i);

              }

              sortArray(as1, ns1);
              sortArray(as2, ns2);

              for(int i=0; i<ns1; i++){
                  if(as1[i] != as2[i]){
                      return false;
                  }
              }
              return true;
          }

          return false;
    }





    public static void main(String args[]){

      boolean isAnagram = isAnagram("Hello", "hello");

          if(isAnagram){
              System.out.println("Anagrams");
          }else{
              System.out.println("Not Anagrams");
          }
    }
}
