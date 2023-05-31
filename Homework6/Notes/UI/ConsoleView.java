package Notes.UI;

import java.util.InputMismatchException;
import java.util.Scanner;

import Notes.Core.MVP.View;
import Notes.Core.Models.Note;

public class ConsoleView implements View {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "CP866");
    }

    @Override
    public String getHeadder() {
        userInfo("Введите заголовок >> ");
        return in.nextLine();
    }

    @Override
    public String getMainText() {
        userInfo("Введите текст записки >> ");
        return in.nextLine();
    }

    @Override
    public int getID() throws InputMismatchException {
        userInfo("Введите номер записки >> ");
        int index = -1;
        try{
            index = in.nextInt();
            in.nextLine();
        }
        catch (Exception e ){
            userInfo("Неверый индекс(");
        }
        return index;
    }

    @Override
    public void showNote(Note note) {
        System.out.printf("Запись %s от %s\n", note.getID(), note.getDate());
        System.out.printf("%s\n %s\n", note.headder, note.mainText);
    }

    public void userInfo(String message) {
        System.out.print(message);
    }

}
