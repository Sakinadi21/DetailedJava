package MethodOverloadVsOverriding;

public class Basic {
    /*
    Method Overloading
    1.Parameter must be different
    2.It occurs within the same class.
    3.Inheritance is not involved.
    4.Return type may or may not be same.
    5.One method does not hide another.

    Example:

public class Overload {
    void add(int a, int b) {
        System.out.println(a+b);
    }
    void add(double a ,double b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Nothing to add");
    }
}

     Method Overriding
    1.Parameter must be different
    2.It occurs between two classes - sub class and super class.
    3.Inheritance is involved.
    4.Return type must be same.
    5.child method hides parent another.


    Example:

    public class Person {
        String name;
        int age;

        void displayInformation(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);

        }
    }
}
public class Teacher extends Person{
    //name,age,displayInformation()
    String qualification;

    @Override
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        System.out.println("\n");
    }
*/
}