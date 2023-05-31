package OOPHomeworksByKulik.Homework5.presenter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import OOPHomeworksByKulik.Homework5.models.ComplexNumber;
import OOPHomeworksByKulik.Homework5.models.operations.MathOperation;
import OOPHomeworksByKulik.Homework5.view.ConsoleMenu;


public class OOPHmw5_1 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, -1);
        ComplexNumber b = new ComplexNumber(1, -8);

        System.out.printf("%s + %s = %s\n", a, b, MathOperation.minus(a, b));
        ConsoleMenu d = new ConsoleMenu();
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("-", "++", "/"));
        
        Scanner s = new Scanner(System.in);
        d.showOptions("введите действие из списка:", list);
        System.out.println(d.getChoise("", s, list ));


        // d.showOptions("введите действие из списка:", list);
        // System.out.println(d.getChoise("", s, list ));
        // System.out.println(d.getChoise("", s, list ));


    }
    
}
