package OOPHomeworksByKulik.Homework2;

import java.util.Scanner;

// 1.Домашнее животное со следующими свойствами:
// 1.1 Кличка
// 1.2 Порода
// 1.3 Наличие прививок
// 1.4 Цвет шерсти
// 1.5 Дата рождения
// И методами:
// 1.5 Проявлять ласку

public abstract class Pet extends Animal implements PetBehaviour {
    protected String furColor;
    protected boolean vaccinated;
    protected String breed;
    protected String name;
    protected String dateOfBirth;

    protected Pet(String name, String furColor, String breed, String dateOfBirth, double animalHight,
            double animalWeight,
            String animalEyeColor, boolean vaccinated) {
        super(animalHight, animalWeight, animalEyeColor);
        this.furColor = furColor;
        this.breed = breed;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.vaccinated = vaccinated;
    }

    protected Pet(Scanner animalScanner) {
        super(animalScanner);
        System.out.print("Введите кличку животного >> ");
        this.name = animalScanner.nextLine();
        System.out.print("Введите цвет животного >> ");
        this.furColor = animalScanner.nextLine();
        System.out.print("Введите породу животного >> ");
        this.breed = animalScanner.nextLine();
        System.out.print("Введите дату рождения животного (в формате дд.мм.гггг) >> ");
        this.dateOfBirth = getDateParameter(animalScanner);
        System.out.print("Животное вакцинировано?\n введите \"1\", если ДА;  любой знак, если нет >> ");
        this.vaccinated = animalScanner.next().equals("1");
    }

    @Override
    protected void printAnimalInfo() {
        System.out.printf("Имя: %s \nЦвет: %s \nПорода: %s \nДата роджения: %s\n", name, furColor, breed, dateOfBirth);
        if (vaccinated)
            System.out.println("Вакцинирован");
        else
            System.out.println("Не вакцинирован");

        super.printAnimalInfo();

    }

   
}
