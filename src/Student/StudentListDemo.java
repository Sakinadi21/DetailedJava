package Student;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        //student linked list
        LinkedList<Student> list = new LinkedList<Student>();

        // student create
        Student s1 = new Student (101,"Mashrafi","Bsc");
        Student s2 = new Student (102,"Nadiha","Bsc");
        Student s3 = new Student (103,"Lably","9");
        Student s4 = new Student (104,"Mashra","8");


        //adding student to the studentlist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //information display
        for(Student s : list){
            System.out.println(s.id+"  "+s.name + " "+s.classname);
        }

    }
}
