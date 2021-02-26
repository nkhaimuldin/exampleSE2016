package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IVehicle> cars = new ArrayList<>();
        cars.add(new UsualCar(70));
        cars.add(new TeslaModelS(700));
        moveCars(cars);
        stopCars(cars);
    }
    public static void moveCars(ArrayList <IVehicle> cars){
        System.out.println("________________Cars moving_____________");
        for(IVehicle car : cars){
            car.move();
            if(car instanceof ILuxuryCar){
                ((ILuxuryCar) car).autoPilot();
                ((ILuxuryCar) car).turnOnConditioner();
            }

        }
    }
    public static void stopCars(ArrayList<IVehicle> cars){
        System.out.println("________________Cars stopped_____________");
        for (IVehicle car : cars){
            car.stop();
            if(car instanceof ILuxuryCar){
                ((ILuxuryCar) car).turnOffConditioner();
            }
        }
    }
}
