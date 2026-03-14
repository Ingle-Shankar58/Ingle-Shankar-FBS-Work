package Com.serviceLayer02;

public interface LoginValidationService {
	
	public void createUser (String userName,String Password);
	public boolean validUser(String userName,String Password);
	

}
