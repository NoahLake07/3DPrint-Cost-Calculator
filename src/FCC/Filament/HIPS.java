package FCC.Filament;

import FCC.FilamentSpool;
import FCC.Interface.ActiveMaterial;
import FCC.Properties.HIPSProperties;

public class HIPS extends FilamentSpool implements HIPSProperties, ActiveMaterial {

    /**
     * Constructs a new HIPS type that extends Filament Spool, and implements HIPSProperties
     * @param ppm the price per meter (measured in USD)
     * @param diameter the diameter of the filament (measured in millimeters)
     */
    public HIPS(double ppm, double diameter){
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
