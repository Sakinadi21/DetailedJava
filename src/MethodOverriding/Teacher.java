package MethodOverriding;

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
}
/*
What is method overriding?
Declaring  a method in subclass which is already present in superclass is known as Method Overriding.

Run Time polymorphism / dynamic binding -> Method overriding
Why do we need method overriding?
1.Code reuse
2.One interface , multiple implement
3.Run time polymorphism

What are the rules for Method overriding ?
1. Name,signature type,parameter must be same.
2. If a method can't be inherited , then it can't be overridden.
3. A method declared as final or static can't be overridden.
4. Constructor can't be overridden.

Can we override static?
No,static method can't be overridden . Because static method is bound to class , on the other
hand method is bound to object.

Can we override main method?
No,because main method is static.
 */