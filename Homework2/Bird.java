package OOPHomeworksByKulik.Homework2;

import java.util.Scanner;

public abstract class Bird extends Animal {
    protected double flightHight;

    protected Bird(double animalHight, double animalWeight, String animalEyeColor, double flightHight) {
        super(animalHight, animalWeight, animalEyeColor);
        this.flightHight = flightHight;

    }

    protected Bird(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("Введите высоту полета (м) >> ");
        this.flightHight = getDoubleParameter(animalScanner);
    }

    @Override
    protected void printAnimalInfo() {
        super.printAnimalInfo();
        System.out.printf("Высота полета: %s \n", flightHight);

    }

    public void fly() {
        System.out.printf("%s: Я лечу на %s метрах\n", this.animalType(), flightHight);
    }

}
