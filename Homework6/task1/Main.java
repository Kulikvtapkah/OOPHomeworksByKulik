package task1;
public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

		new ConsoleReport(user).report();
		new SpecificPersister(user).save();
		
	}
}