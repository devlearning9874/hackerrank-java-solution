package hackerrank.DataStructure.Java;

// V.V.I Solution Check & Understand core concept why looping testcases time not working but looping studentList.size() is working
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Solution code
//class SortByCGPA implements Comparator<Student>{
//
//    public int compare(Student st1, Student st2){
//        return st1.getCgpa() - st2.getCgpa();
//    }
//
//
//}
//ends

public class JavaSort {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //Solution Code

//         Collections.sort(studentList,new SortByCGPA());

        for(int i=0; i<studentList.size(); i++){

            for(int j=i+1; j<studentList.size(); j++){

                Student st1 = studentList.get(i);
                Student st2 = studentList.get(j);

//                double cgpa1 = st1.getCgpa();
//                double cgpa2 = st2.getCgpa();
//
//                if(cgpa1 < cgpa2){
//
//                   studentList.set(i,st2);
//                   studentList.set(j,st1);
//                }

                if(st1.getCgpa() == st2.getCgpa()){

                    if(st1.getFname().equals(st2.getFname())){
                           if(st1.getId() < st2.getId()){
                               studentList.set(i, st2);
                               studentList.set(j, st1);
                           }else{
                               studentList.set(i,st1);
                               studentList.set(j, st2);
                           }
                    }else{
                           int check = st1.getFname().compareTo(st2.getFname());
                           if(check > 0){
                               studentList.set(i, st2);
                               studentList.set(j, st1);
                           }else{
                               studentList.set(i, st1);
                               studentList.set(j, st2);
                           }
                    }
                }else if(st1.getCgpa() < st2.getCgpa()){
                   studentList.set(i,st2);
                   studentList.set(j,st1);
                }
            }
        }

        //ends



//        for (Student st : studentList) {
//            System.out.println(st.getFname());
//        }

        for(int i=0; i<studentList.size(); i++){

            System.out.println(studentList.get(i).getFname());
        }
    }
}

// Sample Input
/*
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76


 */

// Sample Output

/*

Ashis
Fahim
Samara
Samiha
Rumpa

 */
