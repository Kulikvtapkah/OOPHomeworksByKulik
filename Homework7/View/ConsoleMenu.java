package OOPHomeworksByKulik.Homework7.View;

import java.util.Scanner;

public class ConsoleMenu implements Menu {
    public Scanner userAssistent;

    public ConsoleMenu(Scanner userAssistent) {
        this.userAssistent = userAssistent;

    }

    @Override
    public void showOptions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showOptions'");
    }

    @Override
    public int getChoise() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChoise'");
    }

    @Override
    public void userInfo(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'userInfo'");
    }

}
