package Static3;

public class Student {
    static int count = 0;

    Student(){
        count++; //count = 2
    }
    void totalStudent(){
        System.out.println("Total Student = "+count);
    }
}
