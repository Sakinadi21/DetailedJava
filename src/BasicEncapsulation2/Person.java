package BasicEncapsulation2;
/*
Protecting data by declaring them as private
 */
public class Person {
    private String name ;
    private   int age ;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
How to do encapsulation?
1.Declare the variables as private
2.Provide public setter and getter method to modify and get the variables value.

Benefits of Encapsulation
1.Provides data hiding
2.Reusability
3.Code can be modified without breaking the code
4.Maintainability : Hiding implementation details reduces complexity .
 */