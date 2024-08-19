package lab2;

import javax.sound.sampled.SourceDataLine;

class Car{

    private int year;
    private String make;
    private double speed;

    Car(int year, String make, double speed){
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    public int getYear(){
        return year;
    }

    public double getSpeed(){
        return speed;
    }

    public String getMake(){
        return make;
    }

    public void Accelerate(){
        speed+=1;
    }

    public void Accelerate(int increment){
        speed+=increment;
    }

    public void Break(int b){
        speed-= Math.sqrt(b);
    }
}

public class RaceTrack {
    
    public static void main(String[] args) {

        Car car1 = new Car(2002, "TATA", 50);

        System.out.println("Car1 year : " + car1.getYear());
        System.out.println("Car1 make : " + car1.getMake());
        System.out.println("Car1 speed : " + car1.getSpeed());

        car1.Accelerate();

        System.out.println("Car1 speed : " + car1.getSpeed());

        car1.Accelerate(10);

        System.out.println("Car1 speed : " + car1.getSpeed());

        car1.Break(5);

        System.out.println("Car1 speed : " + car1.getSpeed());








    }
}
