import FCC.Filament.PLA;
import FCC.FilamentSpool;

public class Main {

    public static void main(String[] args) {
        PLA myPLA = new PLA(0.07,1.75);
        printPLA(myPLA);
    }

    public static void printPLA(PLA myPLA){
        print("==========");
        print("Properties of custom " + myPLA.getMaterial() + " filament:");
        print("Diameter: " + myPLA.getDiameter());
        print("Diameter: " + myPLA.getPPM());
        print("Density: " + myPLA.getDensity());
        print("Tensile Strength: " + myPLA.getTensileStrength());
        print("Flexural Strength: " + myPLA.getFlexuralStrength());
        print("==========");

    }

    static void print(String s){
        System.out.println(s);
    }

}
