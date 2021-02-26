package com.company;

public class UsualCar extends Car implements IVehicle{
    public UsualCar(int horsePower){
        super(horsePower);
    }

    @Override
    public void move() {
        System.out.println("Hooray! We started to move with speed " + getHorsePower() + "km/h");
    }

    @Override
    public void stop() {
        System.out.println("Thanks God we stopped");
    }
}
