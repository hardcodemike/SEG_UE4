package at.ac.fh_kufstein.uebung_01.Classes;

public class Car {
    String color;
    int wheels;
    double speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }



    public void currentSpeed(){
        System.out.println("die Geschwindigkeit betraegt: " + getSpeed());
    }

    public Car(){}

    public Car(String color, int wheels, double speed) {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    public void accelerate(double geschwindigkeit){
        setSpeed(geschwindigkeit + getSpeed());
    }

    public void slowDown(double geschwidigkeit){
        setSpeed(getSpeed() - geschwidigkeit);
    }
}
