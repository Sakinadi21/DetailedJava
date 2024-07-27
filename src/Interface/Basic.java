package Interface;

public class Basic {
    /*
    What is an interface?
    An interface is a collection of abstract methods.

    Why do we need an interface?
    1.For fully abstraction.
    2.It supports multiple inheritance.

    ->The java compiler adds public and abstract keywords before the interface method.
    ->The java compiler adds public,static and final keywords before the interface variable.
    So, we can say that all variables are constant , no instance variables.


    properties:
    .Each method is an interface are implicitly public,so the abstract keyword is not needed.
    .Methods in an interface are implicitly public.
    .A class can inherit from just one superclass,but can implement multiple interfaces!

     class extends class
     interface extends interface (Similar things extends)
     class implements interface

     How interface is similar to a class?
     1.Interface can have many methods
     2.it has same file extension as class(.java)

     How interface is different from a class?
     1.You can't instantiate an interface.
     2.Interface doesn't contain constructor.
     3.All the methods in interface are abstract.
     4.interface can't have instance variables.
     5.An interface can extend multiple interface.

     Interface VS Abstract Class

     Interface:
     1.can only have abstract methods.
     2.It supports multiple inheritance.
     3.Can only have static and final variable.
     4.fully abstract.
     5.Example
     interface Animal{
     void eat();
     }

     Abstract Class:
      1.can have abstract and non-abstract methods.
     2.It doesn't support multiple inheritance.
     3.Can have static,non static,final and non final variable.
     4.Partial abstraction.
     5.Example
     abstract class Animal{
     abstract void eat();
     }

     */
}
