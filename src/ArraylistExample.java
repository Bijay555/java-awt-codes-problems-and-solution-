
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.*;

import java.util.*;


class Student{
    String name;
    Integer rollno;
    Integer age;

    public Student(String name,Integer rollno,Integer age){
        this.name=name;
        this.rollno=rollno;
        this.age=age;


    }
}

class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
public class ArraylistExample{
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("C:\\Users\\HP\\stu.txt");
        Student st=new Student("Bijay",133,18);
        Student st2= new Student("harry",3246,20);
        Student st3 =new Student("atrip",457,19);
        Teacher t1=new Teacher("Prof.Vadivel","OOPS");
        Teacher t2=new Teacher("Prof.Ragunathan","COA");
        Teacher t3 =new Teacher("Prof.KrishnaPrasad","Algorithm Analysis and Design");

        PrintStream pout =new PrintStream(fw);
        pout.println(st);
        pout.println(st2);
        pout.println(st3);
        pout.print("\n");
        pout.println(t1);
        pout.println(t2);
        pout.println(t3);






        ArrayList<Student> al=new ArrayList<Student>();
        al.add(st);//adding Student class object
        al.add(st2);
        al.add(st3);

        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student stu=(Student)itr.next();
            System.out.println(stu.rollno+" "+stu.name+" "+stu.age);
        }
        System.out.println("\n");

        ArrayList<Teacher> bl=new ArrayList<Teacher>();
        bl.add(t1);
        bl.add(t2);
        bl.add(t3);

        Iterator iter=bl.iterator();
        //traversing elements of ArrayList object
        while(iter.hasNext()){
            Teacher teacher=(Teacher) iter.next();
            System.out.println(teacher.name+" = "+teacher.subject);
        }

        pout.close();
        fw.close();

        Scanner in = new Scanner(System.in);
        String var= in.nextLine();

    }  }