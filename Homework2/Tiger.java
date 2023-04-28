package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Tiger extends WildAnimal {

    protected Tiger(String habitat, String didcoveryDate, double animalHight, double animalWeight,
            String animalEyeColor) {
        super(habitat, didcoveryDate, animalHight, animalWeight, animalEyeColor);

        this.sounds.addAll(Arrays.asList("PURR, PURR, PURR...", "roar!", "ROARRRRRR"));
    }

    protected Tiger(Scanner animalScanner) {
        super(animalScanner);
        this.sounds.addAll(Arrays.asList("PURR, PURR, PURR...", "roar!", "ROARRRRRR"));
    }

    @Override
    protected void printAnimalInfo() {
        System.out.println("Тигр");
        super.printAnimalInfo();
    }
    @Override
    public String animalType(){
        return "Тигр";
    }
}
