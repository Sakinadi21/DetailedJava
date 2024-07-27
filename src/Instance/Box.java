package Instance;

public class Box {
    double height,width,depth; //instance variable
    Box(double height,double width,double depth) //eikaner height width gula local variable
    // ,eikane local variable gular important besi. but computer bujte pare na th jkn this likhe alada kre
            //identify krte pare.
    {
       this. height = height;
       this. width = width;
        this.depth =depth;

    }
    void displayVol(){
        double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }
}
