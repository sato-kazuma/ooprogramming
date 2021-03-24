package com.company.Esercizi;

import com.company.Classi.Car;
import com.company.Classi.SDCar;

public class Garage {
    public static void main(String[] args){
        Car[] garage = new Car[4];
        garage[0] = new SDCar(true, "AA123BB", false);
        garage[1] = new Car(true, "BB123CC");
        garage[2] = new SDCar(true, "ZA123BB", true);
        garage[3] = new Car(false, "GF564AB");

    }
}
