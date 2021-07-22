package hackerrank.DataStructure.Java;

import java.util.*;

class Students {
    private int token;
    private String fname;
    private double cgpa;

    public Students(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getToken() {
        return token;
    }

    public String getName() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public List< Students > getStudents(List < String > events) {
        PriorityQueue < Students > student_queue = new PriorityQueue(Comparator.comparing(Students::getCgpa).reversed().thenComparing(Students::getName).thenComparing(Students::getToken));
        List < Students > students = new ArrayList< Students >();
        for (String e: events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Students student = new Students(token, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                Students first = student_queue.poll();
            } in .close();
        }
        Students first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }

    }
}

 public  class JavaPriorityQueue{



         public static void main(String args[]) {
             Scanner scan = new Scanner(System.in);
             Priorities priorities = new Priorities();
             int totalEvents = Integer.parseInt(scan.nextLine());
             List<String> events = new ArrayList<>();

             while (totalEvents-- != 0) {
                 String event = scan.nextLine();
                 events.add(event);
             }

             List<Students> students = priorities.getStudents(events);

             if (students.isEmpty()) {
                 System.out.println("EMPTY");
             } else {
                 for (Students st: students) {
                     System.out.println(st.getName());
                 }
             }
         }
     }


//Sample Input
/*

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED


 */

// Sample Output

/*

Dan
Ashley
Shafaet
Maria


 */