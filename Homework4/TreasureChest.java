package OOPHomeworksByKulik.Homework4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

// Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа). 

// *Так же в случае, если могут произойти ошибки или некорретная работа в конструкторах или методах,
// необходимо использовать механизм исключений для обработки возможных ошибок.

public class TreasureChest<T> {

    // Так же класс должен содержать следующие приватные поля:
    // 1. Сам массив произвольных данных.
    // 2. Длину массива

    private LinkedList<T> chest;
    private int chestSize;

    // Класс будет иметь следующие конструкторы:
    // 1. Конструктор без параметров – конструктор по умолчанию, проводяющий базовую
    // иницаилизацию массива
    // 2. Конструктор с параметром T[] – конструктор, который проводит инициализацию
    // и заполняет массив данными, пришедшими из параметра

    public TreasureChest() {
        this.chest = new LinkedList<T>();
        this.chestSize = 0;
    }

    public TreasureChest(T[] treasures) {
        this();
        this.chest.addAll(Arrays.asList(treasures));
        this.chestSize = treasures.length;
    }

    // Так же класс будет иметь следующие публичные методы:

    // 16. Длина массива
    public int getChestSize() {
        return chestSize;
    }

    // 1. Вставка в массив
    public void addTreasure(int index, T newTreasure) {
        if (index <= chestSize && index >= 0) {
            chest.add(index, newTreasure);
            this.chestSize++;
        } else
            System.out.printf("Не получилось добавить. Объект %s... промахнулся мимо коллекции)\n", newTreasure);
    }

    public void addTreasure(T newTreasure) {
        this.addTreasure(chestSize, newTreasure);
    }

    public void addTreasures(T[] treasures) {
        this.chest.addAll(Arrays.asList(treasures));
        this.chestSize += treasures.length;
    }

    // 2. Удаление элемента по индексу
    public void removeTreasure(int index) {
        if (inChestSize(index)) {
            this.chest.remove(index);
            this.chestSize--;

        }
    }

    private boolean inChestSize(int index) {
        if (index < 0 || index >= chestSize) {
            System.out.printf("\nОбъекта с номером %s нет в коллекции\n", index);
            return false;
        } else
            return true;
    }

    // 3. Удаление всех элементов с заданным значением
    public void removeTreasures(T treasureToRemove) {
        for (int index = chestSize - 1; index >= 0; index--) {
            if (getTreasure(index).equals(treasureToRemove)) {
                this.chest.remove(getTreasure(index));
                this.chestSize--;
            }
        }
    }

    // 9. Проверка наличия элемента в массиве. Возвращает true, если элемент в
    // массиве есть, false – нет.
    public boolean inChest(T treasure) {
        if (this.chest.contains(treasure)) {
            return true;
        } else
            return false;
    }

    // 8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве
    // нет то возвращать -1
    public int treasureIndex(T treasure) {
        return this.chest.indexOf(treasure);
    }

    // 13. Получение элемента массива по индексу
    // 14. Задание значения элементу массива с заданным индексом
    // *Так же массив должен содержать следующие перегруженные операторы:
    // 1. Оператор, получающий элемент по заданному индексу
    // 2. Оператор, позволяющий установить значение элемента по заданному индексу

    public T getTreasure(int index) {
        if (inChestSize(index)) {
            return this.chest.get(index);
        } else
            return null;
    }

    public void setTreasure(int index, T newTreasure) {
        if (inChestSize(index)) {
            this.chest.set(index, newTreasure);
        }
    }

    // 4. Поиск минимума
    // 5. Поиск максимума

    private T specialTreasure(Comparator<? super T> c, int a) {
        if (!chestIsEmpty()) {
            try {
                T specialTreasure = this.chest.get(0);
                for (T t : this.chest) {
                    if (c.compare(t, specialTreasure) * a > 0) {
                        specialTreasure = t;
                    }
                }
                return specialTreasure;
            } catch (Exception e) {
                System.out.println("Что-то пошло не так...Невозможно выполнить операцию");
                return null;
            }
        } else
            return null;
    }

    public T largestTreasure(Comparator<? super T> c) {
        return specialTreasure(c, 1);
    }

    public T smallestTreasure(Comparator<? super T> c) {
        return specialTreasure(c, -1);
    }

    // 10. Пузырьковая сортировка
    public void bubleTreasureSort(Comparator<? super T> c) {
        if (!chestIsEmpty())
            for (int j = 0; j < chestSize - 1; j++)
                for (int i = 0; i < chestSize - j - 1; i++)
                    if (c.compare(getTreasure(i), getTreasure(i + 1)) > 0)
                        swap(i, i + 1);
    }

    // 11. Сортировка простыми вставками
    public void insertTreasureSort(Comparator<? super T> c) {
        if (!chestIsEmpty())
            for (int i = 1; i < chestSize; i++)
                for (int j = i; j > 0 && c.compare(getTreasure(j), getTreasure(j - 1)) < 0; j--)
                    swap(j - 1, j);
    }

    // 12. Сортировка простым выбором
    public void selectionTreasureSort(Comparator<? super T> c) {
        if (!chestIsEmpty())
            for (int j = 0; j < chestSize - 1; j++) {
                // T localMin = chest.get(j);
                int minIndex = j;
                for (int i = j + 1; i < chestSize; i++)
                    if (c.compare(getTreasure(i), getTreasure(minIndex)) < 0)
                        minIndex = i;
                swap(j, minIndex);
            }
    }

    private void swap(int i1, int i2) {
        T temp = getTreasure(i2);
        setTreasure(i2, getTreasure(i1));
        setTreasure(i1, temp);
    }

    // 6. Поиск суммы элементов массива
    // бред какой-то получился(
    public T treasureSum() {
        if (!chestIsEmpty()) {
            if (getTreasure(0) instanceof String) {
                String stringSum = "";
                for (T treasure : chest) {
                    stringSum += (String) treasure;
                }
                return (T) stringSum;
            } else if (getTreasure(0) instanceof Double) {
                Double doubleSum = 0D;
                for (T treasure : chest) {
                    doubleSum += ((Number) treasure).doubleValue();
                }
                return (T) doubleSum;
            } else if (getTreasure(0) instanceof Float) {
                Float floatSum = 0F;
                for (T treasure : chest) {
                    floatSum += ((Number) treasure).floatValue();
                }
                return (T) floatSum;
            } else if (getTreasure(0) instanceof Integer) {
                Integer intSum = 0;
                for (T treasure : chest) {
                    intSum += ((Number) treasure).intValue();
                }
                return (T) intSum;
            } else if (getTreasure(0) instanceof Long) {
                Long longSum = 0L;
                for (T treasure : chest) {
                    longSum += ((Number) treasure).longValue();
                }
                return (T)longSum;
            }
            else {
                System.out.println("Что-то пошло не так...Невозможно выполнить операцию");
                return null;
            }
        } else
            return null;
    }

    // 7. Поиск произведения элементов массива
    public Double multiplyTreasures() {

        if (!chestIsEmpty()) {
            try {
                Double multiplication = ((Number) getTreasure(0)).doubleValue();
                for (int i = 1; i < chestSize; i++) {
                    multiplication *= ((Number) getTreasure(i)).doubleValue();
                }
                return multiplication;
            } catch (Exception e) {
                System.out.println("Что-то пошло не так...Невозможно выполнить операцию");
                return null;
            }
        } else
            return null;
    }

    private boolean chestIsEmpty() {
        if (chestSize > 0)
            return false;
        else {
            System.out.println("Коллекция пуста. Для начала, добавьте объекты)");
            return true;
        }
    }

    // 15. Печать массива на экран
    public void showTreasures() {
        if (!chestIsEmpty()) {
            System.out.printf("Сейчас в коллекции %s элементов:\n", chestSize);
            for (int i = 0; i < chestSize; i++) {
                System.out.println(getTreasure(i));
            }
            for (T treasure : this.chest) {
                System.out.println(treasure.toString());
            }
        }
    }

}
