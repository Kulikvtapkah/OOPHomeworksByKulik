package OOPHomeworksByKulik.Homework5.view;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CalcMenu {
    private  LinkedList<LinkedList<String>> menu;
    public CalcMenu() {
        this.menu = new LinkedList<LinkedList<String>>();
        this.menu.add(new LinkedList<String>(Arrays.asList("")));
    }

    public void showOptions(String headder, int level) {
        System.out.println(headder);
        for (int index = 0; index < menu.get(level).size(); index++) {
            System.out.printf("%s: %s\n", index, menu.get(level).get(index));
        }
    }

    public int chooseByString(String headder, Scanner choiseScan, int level) {
        System.out.print(headder);
        String input = choiseScan.next();
///проверить валидность!!
        return menu.get(level).indexOf(input);
    }

    public int chooseByIndex(String headder, Scanner choiseScan, int level) {
        System.out.print(headder);
        int input = choiseScan.nextInt();
///проверить валидность!! дописать вообще)
        return menu.get(level).get(input);
    }


    public double getDouble(String headder, Scanner doubleScan) {
        System.out.print(headder);
        while (true)
            if (doubleScan.hasNextDouble())
                return doubleScan.nextDouble();
            else
                System.out.print("Вести подсчеты в символах - такое себе. \n Все же, нужно число >> ");
    }
}
