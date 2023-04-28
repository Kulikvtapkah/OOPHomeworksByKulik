package OOPHomeworksByKulik.Homework2;

import java.util.Scanner;

// 2.Дикое животное со следующими свойствами:
// 2.1 Место обитания
// 2.2 Дата нахождения

public abstract class WildAnimal extends Animal {
    protected String habitat;
    protected String didcoveryDate;

    protected WildAnimal(String habitat, String didcoveryDate, double animalHight, double animalWeight,
            String animalEyeColor) {
        super(animalHight, animalWeight, animalEyeColor);
        this.habitat = habitat;
        this.didcoveryDate = didcoveryDate;

    }

    protected WildAnimal(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("Введите среду обитания животного >> ");
        this.habitat = animalScanner.nextLine();
        System.out.print("Введите дату обнаружения животного (в формате дд.мм.гггг) >> ");
        this.didcoveryDate = getDateParameter(animalScanner);

    }

    @Override
    protected void printAnimalInfo() {
        System.out.printf("Место обитания: %s \nДата нахождения: %s\n", habitat, didcoveryDate);
        super.printAnimalInfo();
    }

}
