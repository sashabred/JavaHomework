package lesson6.car;

public class Truck extends Car {
    public int wheelsCount;
    public double maxWeight;

    public void newWheels( int wheels) {

        System.out.println("У грузовика изменилось число колес c " +wheelsCount + " на " +wheels);
        wheelsCount=wheels;
    }

    public Truck (int w, String m, char c, float s, int wc, double mw) {
        super(w,m,c,s);
        wheelsCount=wc;
        maxWeight=mw;
    }
}
