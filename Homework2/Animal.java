package OOPHomeworksByKulik.Homework2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

// .Рост животного
// 2.Вес животного
// 3.Цвет глаз животного
// И методы:
// 1.Издать звук
// 2.Напечатать информацию о животном

public abstract class Animal {
    protected double animalHight;
    protected double animalWeight;
    protected String animalEyeColor;
    protected ArrayList<String> sounds;

    protected Animal(double animalHight, double animalWeight, String animalEyeColor) {
        this.animalHight = animalHight;
        this.animalWeight = animalWeight;
        this.animalEyeColor = animalEyeColor;
        this.sounds = new ArrayList<String>();
    }

    protected Animal(Scanner animalScanner) {
        System.out.print("Введите высоту животного (см) >> ");
        this.animalHight = getDoubleParameter(animalScanner);
        System.out.print("Введите вес животного (кг) >> ");
        this.animalWeight = getDoubleParameter(animalScanner);
        System.out.print("Введите цвет глаз животного >> ");
        this.animalEyeColor = animalScanner.nextLine();
        this.sounds = new ArrayList<String>();
    }

    protected void voice() {
        System.out.printf("%s!\n", this.sounds.get(new Random().nextInt(sounds.size())));
    }

    protected void printAnimalInfo() {
        System.out.printf("Высота: %s см \nВес: %s кг \nЦвет глаз: %s\n", animalHight, animalWeight, animalEyeColor);
    }

    protected double getDoubleParameter(Scanner animalScanner) {
        double parameter;
        String regex = "[0-9]+[\\.]?[0-9]*";
        while (true) {
            String rawString = animalScanner.nextLine();
            if (Pattern.matches(regex, rawString)) {
                parameter = Double.parseDouble(rawString);
                break;
            } else {
                System.out.print("Неверный ввод. Попробуйте снова >>");
            }
        }
        return parameter;
    }

    protected String getDateParameter(Scanner animalScanner) {
        String parameter;
        String regex = "[0-9]{2}[\\.][0-9]{2}[\\.][0-9]{4}";
        while (true) {
            parameter = animalScanner.nextLine();
            if (Pattern.matches(regex, parameter)) {
                break;
            } else {
                System.out.print("Неверный ввод. Попробуйте снова >>");
            }
        }
        return parameter;
    }
    public String animalType(){
        return "";
    }

}
