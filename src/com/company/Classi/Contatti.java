package com.company.Classi;

import java.util.ArrayList;

public class Contatti {
    ArrayList<Persona> amici = new ArrayList <Persona>();
    ArrayList <Persona> nemici = new ArrayList <Persona>();

    public Contatti(ArrayList<Persona> amici, ArrayList<Persona> nemici) {
        super();
        this.amici = amici;
        this.nemici = nemici;
    }

    public Contatti() {

    }

    public ArrayList<Persona> getAmici() {
        return amici;
    }

    public void setAmici(ArrayList<Persona> amici) {
        this.amici = amici;
    }

    public ArrayList<Persona> getNemici() {
        return nemici;
    }

    public void setNemici(ArrayList<Persona> nemici) {
        this.nemici = nemici;
    }

    @Override
    public String toString() {
        return "Contatti{" +
                "amici=" + amici +
                ", nemici=" + nemici +
                '}';
    }
}
