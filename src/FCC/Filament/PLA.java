package FCC.Filament;

import FCC.FilamentSpool;
import FCC.Interface.ActiveMaterial;
import FCC.Properties.PLAProperties;

public class PLA extends FilamentSpool implements PLAProperties, ActiveMaterial {


    /**
     * Constructs a new PLA type that extends Filament Spool, and implements PLAProperties
     * @param ppm the price per meter (measured in USD)
     * @param diameter the diameter of the filament (measured in millimeters)
     */
    public PLA(double ppm, double diameter){
        setPPM(ppm);
        setDiameter(diameter);
    }

    @Override
    public double getTensileStrength() {
        return tensileStrength;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public double getFlexuralStrength() {
        return flexuralStrength;
    }

    @Override
    public double getMeltingTemp() {
        return meltingTemp;
    }

    @Override
    public String getMaterial() {
        return type;
    }

}
