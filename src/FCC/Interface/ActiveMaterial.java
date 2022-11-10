package FCC.Interface;

public interface ActiveMaterial {

    double getTensileStrength();
    double getDensity();
    double getFlexuralStrength();
    double getMeltingTemp();

    String getMaterial();

}
