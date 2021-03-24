package com.company.Classi;

public class SDCar extends Car{
    boolean isSelfDriving;

    public SDCar(boolean isOn, String licensePlate, boolean isSelfDriving) {
        super(isOn, licensePlate);
        this.isSelfDriving = isSelfDriving;
    }

    public boolean isSelfDriving() { return isSelfDriving; }

    public void setSelfDriving(boolean selfDriving) { isSelfDriving = selfDriving; }

    public void turnOn(){
        turnSDOff();
        super.turnOn();
    }
    public void turnOff(){
        turnSDOff();
        super.turnOff();
    }

    public void turnSDOn(){
        if(this.isSelfDriving == true){
            System.out.println("Sono già in modalità SD!");
        }
        else{
            this.isSelfDriving = true;
        }
    }

    public void turnSDOff(){
        if(this.isSelfDriving == false){
            System.out.println("Sono già in modalità guida normale!");
        }
        else{
            this.isSelfDriving = false;
        }
    }

    public void mystatus(){
        System.out.println("Sono una SDCar");
    }


}
