package Com.serviceImplLayer03;

import Com.bean01.User;
import Com.daoImpl.DAOimpl;
import Com.serviceLayer02.LoginValidationService;

public class LoginValidationServiceImpl implements LoginValidationService {

	User u;
	DAOimpl dao =  new DAOimpl();

	@Override
	public void createUser(String userName, String Password) {

		u = new User(userName, Password);
		dao.insertuser(u);
	}

	@Override
	public boolean validUser(String userName, String Password) {

		boolean flag = dao.retriveUser(userName);
		
		
		

//		if (u.getUserName().equals(userName) && u.getPassWord().equals(Password)) {
//
//			flag = true;
//		}
//
		return false;
	}

}
