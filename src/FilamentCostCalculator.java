import FCC.Filament.PLA;
import FCC.FilamentSpool;

/**
 * Filament Cost Calculator:
 * Gives the user the ability to input the amount of filament that a print
 * will use, and calculate the estimated costs of that print. The user also
 * has the option to compare different filament properties directly, for
 * easier choosing of material for a specific print.
 */
// TODO extend FreshUI and begin setting up User Interface
public class FilamentCostCalculator {

    public static void main(String[] args) {
        PLA myPLA = new PLA(0.07,1.75);
        printSpoolData(myPLA);
    }

    /**
     * Prints out data of a spool to the console.
     * @param material
     */
    public static void printSpoolData(FilamentSpool material){
        print("==========");
        print("Properties of custom " + material.getMaterial() + " filament:");
        print("Diameter: " + material.getDiameter());
        print("Diameter: " + material.getPPM());
        print("Density: " + material.getDensity());
        print("Tensile Strength: " + material.getTensileStrength());
        print("Flexural Strength: " + material.getFlexuralStrength());
        print("==========");
    }

    static void print(String s){
        System.out.println(s);
    }

}
