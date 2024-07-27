package Super4;

public class Car extends Vehicle{
    int gear;
    Car(String c,double w,int g){
        super(c,w);//callling the constructor of vehicle
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Gear :"+gear);
    }
}
