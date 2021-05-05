package com.company.Classi;

    public class Car {
        boolean isOn;
        String licensePlate;

        public Car(boolean isOn, String licensePlate) {
            this.isOn = isOn;
            this.licensePlate = licensePlate;
        }

        public boolean isOn() { return isOn; }

        public void setOn(boolean on) { isOn = on; }

        public String getLicensePlate() { return licensePlate; }

        public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

        public void turnOn(){
            this.isOn = true;
            System.out.println("Sono accesa!");
        }
        public void turnOff(){
            this.isOn = false;
            System.out.println("Sono spenta!");
        }

        public void mystatus(){
            System.out.println("Sono una Car");
        }

        @Override
        public String toString() {
            return "Car{" +
                    "isOn=" + isOn +
                    ", licensePlate='" + licensePlate + '\'' +
                    '}';
        }
}
