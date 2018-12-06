package at.ac.fh_kufstein.uebung_01;

import at.ac.fh_kufstein.uebung_01.Classes.Bike;
import at.ac.fh_kufstein.uebung_01.Classes.Car;

public class Aufruf {
    public static void main(String[] args){
        Car car1 = new Car("rot", 4, 200.0);
        car1.currentSpeed();
        Bike bike1 = new Bike("blau", 2, 20, 40);
        bike1.accelerate(10.0);
        bike1.currentSpeed();

        Bike bike2 = new Bike("yellow", 2, 20, 40);
        bike2.accelerate(100);
        bike2.slowDown(100);
        bike2.currentSpeed();
    }
}
