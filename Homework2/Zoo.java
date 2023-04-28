package OOPHomeworksByKulik.Homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Zoo {

    private LinkedList<Animal> zooAnimals;

    protected Zoo() {
        this.zooAnimals = new LinkedList<Animal>();
        System.out.println("Зоопарк открыт! Улыбаемся и машем)");
    }

    public void addNewAnimal(Animal newAnimal) {
        zooAnimals.addLast(newAnimal);
        System.out.println("В зоопарке новый обитатель! Привет!");
    }

    private boolean animalNumberIsOK(int animalNumber) {
        if (animalNumber - 1 < 0 || animalNumber - 1 >= zooAnimals.size()) {
            System.out.println("\nНомер животного указан неверно");
            return false;
        } else {
            return true;
        }

    }

    public void removeAnimal(int animalNumber) {
        if (animalNumberIsOK(animalNumber)) {
            String freeAnimal = animalType(animalNumber);
            zooAnimals.remove(animalNumber - 1);
            System.out.printf("%s теперь живет в естественной среде!\n", freeAnimal );
        }
    }

    public void addNewAnimals(Collection<Animal> zooNewcomers) {
        zooAnimals.addAll(zooNewcomers);
        System.out.printf("В зоопарке еще %s новых обитателей! Привет!\n", zooNewcomers.size());
    }

    public void printZooAllAnimalsInfo() {
        System.out.println("\nСейчас в зоопарке:");
        for (int i = 0; i < zooAnimals.size(); i++) {
            System.out.printf("\n%s.", i + 1);
            zooAnimals.get(i).printAnimalInfo();
        }
    }

    public void printZooAnimalInfo(int animalNumber) {
        if (animalNumberIsOK(animalNumber)) {
            System.out.printf("\nЖивотное № %s: ", animalNumber);
            zooAnimals.get(animalNumber - 1).printAnimalInfo();
        }
    }

    public void zooAnimalVoice(int animalNumber) {
        if (animalNumberIsOK(animalNumber))
            System.out.printf("%s: ", animalType(animalNumber));
        zooAnimals.get(animalNumber - 1).voice();

    }

    public void allZooAnimalsVoice() {
        System.out.println("\nЗвероПой:");
        for (int i = 0; i < zooAnimals.size(); i++) {
            System.out.printf("\n%s. %s:", i + 1, animalType(i + 1));
            zooAnimals.get(i).voice();
        }
    }

    public void zooAmimalFly(int animalNumber) {
        if (animalNumberIsOK(animalNumber))
            if (zooAnimals.get(animalNumber - 1) instanceof Bird)

                ((Bird) zooAnimals.get(animalNumber - 1)).fly();
            else {
                System.out.printf(
                        "%s - не птица. Как говорится, \"рожденный ползать...\"\n",
                        animalType(animalNumber - 1));
            }
    }

    public void zooAmimalTraining(int animalNumber) {
        if (animalNumberIsOK(animalNumber))
            if (zooAnimals.get(animalNumber - 1) instanceof Dog)

                ((Dog) zooAnimals.get(animalNumber - 1)).dogTraining();
            else {
                System.out.printf("%s не поддается дрессировке(\n", animalType(animalNumber));

            }
    }

    public void zooAmimalAffection(int animalNumber) {
        if (animalNumberIsOK(animalNumber))
            if (zooAnimals.get(animalNumber - 1) instanceof PetBehaviour) {
                System.out.printf("%s ласкается!\n", animalType(animalNumber));
                ((PetBehaviour) zooAnimals.get(animalNumber - 1)).affection();
            } else {
                System.out.printf("%s не ласкается(\n", animalType(animalNumber));

            }
    }

    public int zooSize() {
        return zooAnimals.size();
    }

    public String animalType(int animalNumber) {
        return zooAnimals.get(animalNumber - 1).animalType();
    }
}
