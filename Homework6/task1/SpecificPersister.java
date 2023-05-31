package task1;
public class SpecificPersister implements AbstractPersister{
	private IUser user;
	
	public SpecificPersister(IUser user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}