package com.company;

public abstract class Car implements IVehicle{
    private int horsePower;
    public Car(int horsePower){
        setHorsePower(horsePower);
    }
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
