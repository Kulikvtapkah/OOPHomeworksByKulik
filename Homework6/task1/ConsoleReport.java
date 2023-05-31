package task1;
public class ConsoleReport implements Report  {
    private IUser user;

    public ConsoleReport (IUser user) {
        this.user = user;
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }

}
