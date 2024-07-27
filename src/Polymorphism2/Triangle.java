package Polymorphism2;

public class Triangle {
    //area
    double base, height;

    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        System.out.println("Areas for triangle : ");
        return 0.5*base*height;
    }
}
