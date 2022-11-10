package FCC;

import FCC.Interface.ActiveMaterial;

public abstract class FilamentSpool implements ActiveMaterial {

    double ppM; // price per meter
    double fD; // filament diameter

    public void setPPM(double pricePerMeter){
        ppM = pricePerMeter;
    }

    public double getPPM(){
        return ppM;
    }

    public void setDiameter(double d){
        fD = d;
    }

    public double getDiameter(){
        return fD;
    }

}
