package OOPHomeworksByKulik.Homework4;

import java.util.Comparator;

public class OOPHmw4_1 {
    public static void main(String[] args) {

        System.out.print("Коллекция строк: ");
        TreasureChest<String> stringChest = new TreasureChest<String>(new String[] { "piastri", "piastri" });
        stringChest.addTreasure("diamond");
        stringChest.addTreasure("cursedGold");
        stringChest.showTreasures();
        stringChest.addTreasure(12, "rum");
        stringChest.addTreasure(2, "rum");
        stringChest.removeTreasure(2);
        stringChest.removeTreasure(0);

        stringChest.insertTreasureSort(Comparator.naturalOrder());
        stringChest.showTreasures();
        System.out.printf("Сумма строк:\n %s\n", stringChest.treasureSum());
        System.out.print("Произведение: ");
        System.out.printf("%s\n", stringChest.multiplyTreasures());

        System.out.print("Коллекция чисел: ");
        TreasureChest<Double> doubleChest = new TreasureChest<Double>(
                new Double[] { 200D, 65D, 0D, -18D, 65.88, -18.12, 0D });
        doubleChest.addTreasure(6.44);
        doubleChest.addTreasure(-6.44);
        doubleChest.showTreasures();
        doubleChest.addTreasure(12, 999D);
        doubleChest.addTreasure(2, 777D);
        doubleChest.removeTreasure(2);
        doubleChest.removeTreasure(2);
        doubleChest.removeTreasures(0D);

        doubleChest.insertTreasureSort(Comparator.naturalOrder());
        doubleChest.showTreasures();
        System.out.printf("Сумма чисел:\n %s\n", doubleChest.treasureSum());
        System.out.printf("Произведение:\n %s\n", doubleChest.multiplyTreasures());

        System.out.print("Коллекция картин: ");
        TreasureChest<Masterpiece> artChest = new TreasureChest<Masterpiece>();
        artChest.addTreasure(new Masterpiece("Les Femmes d’Alger", "Пабло Пикассо", 210));
        artChest.addTreasure(new Masterpiece("Спаситель мира", "Леонардо да Винчи", 507));
        artChest.addTreasure(new Masterpiece("Игроки в карты", "Поль Сезанн", 307));
        artChest.addTreasure(0, new Masterpiece("Водяные змеи II", "Густав Климт", 222));
        artChest.addTreasure(2, new Masterpiece("Крик", "Эвард Мунк", 120));
        artChest.showTreasures();
        System.out.printf("\nСамая дорогая в коллекции: %s", artChest.largestTreasure(Comparator.naturalOrder()));
        System.out.printf("\nСамая дешевая в коллекции: %s", artChest.smallestTreasure(Comparator.naturalOrder()));

    }

}
