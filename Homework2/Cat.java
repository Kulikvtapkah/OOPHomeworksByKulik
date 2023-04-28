package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Cat extends Pet {

    protected boolean hasFur;

    protected Cat(String name, String breed, String furColor, String dateOfBirth, double animalHight,
            double animalWeight, String animalEyeColor, boolean vaccinated, boolean hasFur) {
        super(name, furColor, breed, dateOfBirth, animalHight, animalWeight, animalEyeColor, vaccinated);
        this.hasFur = hasFur;
        this.sounds.addAll(Arrays.asList("purr, purr, purr...", "meow, meow",
                "ffffffff"));
    }

    protected Cat(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("У кота есть шерсть?\n введите \"1\", если ДА;  любой знак, если нет >> ");
        this.hasFur = animalScanner.next().equals("1");
        this.sounds.addAll(Arrays.asList("purr, purr, purr...", "meow, meow",
                "ffffffff"));
    }

    @Override
    public void printAnimalInfo() {
        System.out.println("Кот");
        super.printAnimalInfo();
        if (!hasFur)
            System.out.println("Мечта аллергика - лысый кот)");
        else
            System.out.println("Пушистик!");

    }
    @Override
    public String animalType(){
        return "Кот";
    }

}
