package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Wolf extends WildAnimal {

    protected boolean leader;

    protected Wolf(String habitat, String didcoveryDate, double animalHight, double animalWeight, String animalEyeColor,
            boolean leader) {
        super(habitat, didcoveryDate, animalHight, animalWeight, animalEyeColor);
        this.leader = leader;
        this.sounds.addAll(Arrays.asList("Auuuuuuuf...", "rrrrrr!"));
    }
    protected Wolf(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("Волк вожак стаи?\n введите \"1\", если ДА;  любой знак, если нет >> ");
        this.leader = animalScanner.next().equals("1");
        this.sounds.addAll(Arrays.asList("Auuuuuuuf...", "rrrrrr!"));
    }

    @Override
    protected void printAnimalInfo() {
        System.out.println("Волк");
        super.printAnimalInfo();
        if (leader)
            System.out.println("Вожак стаи");

    }
    @Override
    public String animalType(){
        return "Волк";
    }
}