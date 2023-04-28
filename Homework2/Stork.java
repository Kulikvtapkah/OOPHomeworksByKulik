package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Stork extends Bird {
    protected double flightHight;

    protected Stork(double animalHight, double animalWeight, String animalEyeColor, double flightHight) {
        super(animalHight, animalWeight, animalEyeColor, flightHight);
        this.sounds.addAll(Arrays.asList("Tttt... tttt... ttttt", "T-t-t-t-ttttt"));

    }

    protected Stork(Scanner animalScanner) {
        super(animalScanner);
        this.sounds.addAll(Arrays.asList("Tttt... tttt... ttttt", "T-t-t-t-ttttt"));
    }

    @Override
    protected void printAnimalInfo() {
        System.out.println("Аист");
        super.printAnimalInfo();
    }
    @Override
    public String animalType(){
        return "Аист";
    }
}
