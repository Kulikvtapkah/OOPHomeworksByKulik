package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Chicken extends Bird implements PetBehaviour {
    protected double flightHight;

    protected Chicken(double animalHight, double animalWeight, String animalEyeColor, double flightHight) {
        super(animalHight, animalWeight, animalEyeColor, flightHight);
        this.sounds.addAll(Arrays.asList("Koooo-ko-ko-ko", "cookadudldoo", "kud-kudah"));
    }

    protected Chicken(Scanner animalScanner) {
        super(animalScanner);
        this.sounds.addAll(Arrays.asList("Koooo-ko-ko-ko", "cookadudldoo", "kud-kudah"));
    }

    @Override
    protected void printAnimalInfo() {
        System.out.println("Курица");
        super.printAnimalInfo();
    }
    @Override
    public String animalType(){
        return "Курица";
    }
}
