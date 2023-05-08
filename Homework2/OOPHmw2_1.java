package OOPHomeworksByKulik.Homework2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OOPHmw2_1 {
    /*
     * На языке Java реализовать интерфейс "Животное" со следующими полями:
     * 1.Рост животного
     * 2.Вес животного
     * 3.Цвет глаз животного
     * И методы:
     * 1.Издать звук
     * 2.Напечатать информацию о животном
     * Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
     * 1.Домашнее животное со следующими свойствами:
     * 1.1 Кличка
     * 1.2 Порода
     * 1.3 Наличие прививок
     * 1.4 Цвет шерсти
     * 1.5 Дата рождения
     * И методами:
     * 1.5 Проявлять ласку
     * 2.Дикое животное со следующими свойствами:
     * 2.1 Место обитания
     * 2.2 Дата нахождения
     * Реализовать классы следующих животных, реализующих интерфейсы домашнего
     * животного или дикого животного(надеюсь сами поймёте какое животное домашнее,
     * а какое - дикое):
     * 1.Кот со свойством:
     * 1.1 Наличие шерсти(доступным только для чтения внешним классам)
     * 2.1 Тигр
     * 3.Собака со свойством:
     * 3.1 Наличие дрессировки(доступным только для чтения внешним классам)
     * и методом:
     * 3.2 Дрессировать
     * 4.Волк со свойством:
     * 4.1 Вожак стаи(доступным только для чтения внешним классам)
     * Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное,
     * у которого будет защищённое поле:
     * 1.Высота полёта
     * и метод:
     * 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота
     * полёта
     * и защищённый конструктор:
     * 3.Конструктор принимающий высоту полёта
     * И следующие классы-наследники:
     * 1.Курица
     * 2.Аист
     * Для всех классов реализовать методы издавать звук, чтобы он печатал на
     * консоль звук, примерно похожий на звук, который издаёт животное в реальном
     * мире,
     * а метод напечатать информацию, печатающий на экран все свойства, которые есть
     * у данного животного.
     * Так же для всех классов реализовать набор конструкторов, которые необходимы
     * для задания всех свойств объекта, которые они у него есть.
     * 
     * Так же реализовать класс "Зоопарк", в котором будет храниться любая структура
     * данных животных(массив, стек, очередь),
     * в котором организовать приватный массив объектов-животных со следующими
     * методами:
     * 1.Добавить животное в зоопарк(добавляет новое животное в структуру данных,
     * для массива использовать следующий алгоритм
     * https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека
     * и очереди вы алгоритмы уже знаете)
     * 2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм
     * https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.
     * html для удаления из массива, для удаления из стека и очереди вы алгоритмы
     * знаете)
     * 3.Посмотреть информацию о животном с номером i
     * 4.Заставить животное с номером i издать звук
     * 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
     * 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать
     * звук
     * Предоставить пользователю консольный интерфейс(консольное меню), который
     * позволяет пользователю добавлять
     * новых животных в зоопарк, убирать животных из зоопарка, печатать информацию о
     * конкретном животном(вводя его номер),
     * печатать информацию о всех животных в зоопарке на данный момент, заставлять
     * животное издавать звук(введя номер животное),
     * заставлять издавать звук всех животных, которые на данный момент есть в
     * зоопарке)
     * Задание под звёздочкой(необязательное, но плюсы к карме и к оценкам): Сделать
     * возможность у животных летать,
     * если это животное птица, проявлять ласку, если это домашнее животное и
     * дрессировать, если это животное собака.
     */
    public static void main(String[] args) {
        Scanner animalScanner = new Scanner(System.in);

        Zoo uenoZoo = new Zoo();
        uenoZoo.addNewAnimal(new Cat("barsik", "siamese", "black", "01.12.2020", 20,
                5.5, "blue", false, true));

        uenoZoo.addNewAnimals(
                Arrays.asList(new Dog("Hachiko", "akita-inu", "brown", "01.12.2020", 30, 7.8, "green", false, false),
                        new Tiger("savanna", "01.01.20", 100, 200, "yellow"),
                        new Wolf("forest", "18.05.2009", 35, 80, "silver", true),
                        new Chicken(20, 3, "black", 1),
                        new Stork(70, 25, "black", 5000)));

        uenoZoo.printZooAllAnimalsInfo();
        consoleMenu(animalScanner, uenoZoo);

    }

    public static void consoleMenu(Scanner animalScanner, Zoo uenoZoo) {
        String choise;
        System.out.println("\nДобро пожаловать в меню управления зоопарком!");
        while (true) {
            if (uenoZoo.zooSize() > 0) {
                System.out.println(
                        "\nВыберите действие: \n1 - добавить животное; \n2 - управлять одним животным; \n3 - управлять всеми животными.");
                System.out.print("Введите число из списка выше >> ");
                choise = animalScanner.next();
            } else {
                System.out.println("Зоопарк пуст! Добавьте животное!");
                choise = "1";
            }
            switch (choise) {
                case "1":
                    addNewAnimalMenu(animalScanner, uenoZoo);
                    uenoZoo.printZooAnimalInfo(uenoZoo.zooSize());
                    break;
                case "2":
                    manageSingleAnimal(animalScanner, uenoZoo);

                    break;
                case "3":
                    manageAllAnimals(animalScanner, uenoZoo);
                    break;

                default:
                    System.out.println("Зоопарк - дело непростое, понимаю... Так что, соберитесь! Еще раз...");
                    break;
            }
        }
    }

    private static void manageAllAnimals(Scanner animalScanner, Zoo uenoZoo) {
        System.out.print("Рулим целым зоопарком! Шикарно! ");
        System.out.println(
                "Определите действие:\n1 - узнать информацию;\n2 - услышать голоса животных");
        System.out.print("Введите число из списка выше или любой другой знак для отмены >> ");
        String choise = animalScanner.next();
        switch (choise) {
            case "1":
                uenoZoo.printZooAllAnimalsInfo();
                ;
                break;
            case "2":
                uenoZoo.allZooAnimalsVoice();
                break;
            default:
                System.out.println("Точно! Есть и другие дела...");
                break;
        }

    }

    public static void addNewAnimalMenu(Scanner animalScanner, Zoo uenoZoo) {
        System.out.println(
                "Ура! Новый жилец! Кто это будет?\n1 - кошка;\n2 - собака;\n3 - тигр;\n4 - волк;\n5 - аист;\n6 - курица");
        System.out.print("Введите число из списка выше или любой другой знак для отмены >> ");
        String choise = animalScanner.next();
        animalScanner.nextLine();

        switch (choise) {
            case "1":
                System.out.println("Кошка, здорово! Уточним параметры...");
                uenoZoo.addNewAnimal(new Cat(animalScanner));
                break;
            case "2":
                System.out.println("Собака, отлично! Уточним параметры...");
                uenoZoo.addNewAnimal(new Dog(animalScanner));
                break;
            case "3":
                System.out.println("Оооо, тигр! Уточним параметры...");
                uenoZoo.addNewAnimal(new Tiger(animalScanner));
                break;
            case "4":
                System.out.println("Волк, круто! Уточним параметры...");
                uenoZoo.addNewAnimal(new Wolf(animalScanner));
                break;
            case "5":
                System.out.println("Аист, супер! Уточним параметры...");
                uenoZoo.addNewAnimal(new Stork(animalScanner));
                break;
            case "6":
                System.out.println(
                        "Как говорит известный многим человек, \"внезапно\" это курица! Ок! Уточним параметры...");
                uenoZoo.addNewAnimal(new Chicken(animalScanner));
                break;

            default:
                System.out.println("Ок, в другой раз добавим зверюшку)");
                break;
        }

    }

    public static void manageSingleAnimal(Scanner animalScanner, Zoo uenoZoo) {

        int animalNumber;
        String rawString;
        while (true) {
            if (uenoZoo.zooSize() > 0) {
                System.out.printf("Сейчас в зоопарке %s животных. Выберите одного.", uenoZoo.zooSize());
                System.out.printf("\nВведите число от 1 до %s или нечисловой символ для отмены >> ", uenoZoo.zooSize());
                rawString = animalScanner.next();
            } else {
                break;
            }

            if (Pattern.matches("[0-9]+", rawString)) {
                animalNumber = Integer.parseInt(rawString);

                if (animalNumber > 0 && animalNumber <= uenoZoo.zooSize()) {
                    System.out.printf("%s - отличный выбор!\n", uenoZoo.animalType(animalNumber));
                    System.out.println(
                            "Определите действие:\n1 - узнать информацию;\n2 - услышать голос;\n3 - приласкать;\n4 - дрессировать;\n5 - отправить в полет;\n6 - убрать из зоопарка");
                    System.out.print("Введите число из списка выше или любой другой знак для отмены >> ");
                    String choise = animalScanner.next();
                    switch (choise) {
                        case "1":
                            uenoZoo.printZooAnimalInfo(animalNumber);
                            break;
                        case "2":
                            uenoZoo.zooAnimalVoice(animalNumber);
                            break;
                        case "3":
                            uenoZoo.zooAmimalAffection(animalNumber);
                            break;
                        case "4":
                            uenoZoo.zooAmimalTraining(animalNumber);
                            break;
                        case "5":
                            uenoZoo.zooAmimalFly(animalNumber);
                            break;
                        case "6":
                            uenoZoo.removeAnimal(animalNumber);
                            break;
                        default:
                            System.out.println("Попробуем другое животное...");
                            break;
                    }

                } else {
                    System.out.print("Такого номера животного нет. Попробуем снова.");
                }
            } else {
                System.out.println("Ладно, займемся чем-то другим...");
                break;
            }

        }

    }

}
