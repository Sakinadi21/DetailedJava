package MethodOverloading;

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
/*
Method Overloading is a process that allows a class to have two or more methods having same name,
as long as their parameter declarations are different.
These methods are called overloaded method.

Compile time polymorphism/static binding -> Method Overloading

1.same method names
2.Parameter lists are different
3.inside the same class.
 */