package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dog extends Pet {

    protected boolean trained;

    protected Dog(String name, String breed, String furColor, String dateOfBirth, double animalHight,
            double animalWeight,
            String animalEyeColor, boolean vaccinated, boolean trained) {
        super(name, furColor, breed, dateOfBirth, animalHight, animalWeight, animalEyeColor, vaccinated);
        this.trained = trained;
        this.sounds.addAll(Arrays.asList("rrrrrrr", "woof, woof!", "пить..."));
    }

    protected Dog(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("Собака дрессирована?\n введите \"1\", если ДА;  любой знак, если нет >> ");
        this.trained = animalScanner.next().equals("1");
        this.sounds.addAll(Arrays.asList("rrrrrrr", "woof, woof!", "пить..."));
    }

    public void dogTraining() {
        if (!trained) {
            System.out.println("Клуб аджилити тренирует пса...");
            if (new Random().nextInt(5) < 3) {
                System.out.println("Ура! Теперь он знает все команды.");
                this.trained = true;
            } else {
                System.out.println("Увы, псу учеба дается с трудом. Пока не получилось, не фортануло(");
            }
        } else {
            System.out.println(
                    "Это гениальное животное и так уже таскает тапки в постель и находит наркотики в аэропорту...\nНет смысла тренировать его.");
        }

    }

    @Override
    public void printAnimalInfo() {
        System.out.println("Собака");
        super.printAnimalInfo();
        if (trained)
            System.out.println("Дрессирован");
        else
            System.out.println("Не дрессирован");

    }
    @Override
    public String animalType(){
        return "Собака";
    }

}
