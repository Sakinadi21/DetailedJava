package MethodOverriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Mashu";
        t1.age = 20;
        t1.qualification = "Bsc";
        t1.displayInformation();

        Person p1 = new Person();
        p1.name = "Saku";
        p1.age = 19;
        p1.displayInformation();

        Person t = new Teacher();//super class variable e subclass rakte parbo.
        //bam dike reference variable. dan dike main factor.
        t.displayInformation();
    }
}
