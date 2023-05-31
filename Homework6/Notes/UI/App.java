package Notes.UI;

import java.util.Scanner;

import Notes.Config;
import Notes.Core.MVP.Presenter;
import Notes.Core.MVP.View;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            presenter.userInfo("Добро пожаловать в \"Записки\"! \n");
            while (true) {
                presenter.userInfo(
                        "Выберите действие: \n1 - создать запись \n2 - прочитать запись \n3 - прочитать все записи \n4 - редактировать запись \n5 - удалить запись");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.createNote();
                        break;
                    case "2":
                        presenter.showNote();
                        break;
                    case "3":
                        presenter.showAllNotes();
                        break;
                    case "4":
                        presenter.editNote();
                        break;
                    case "5":
                       presenter.deleteNote();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
