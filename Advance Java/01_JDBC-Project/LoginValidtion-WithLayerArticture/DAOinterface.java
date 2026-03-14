package Com.dao;

import Com.bean01.User;

public interface DAOinterface {

	public void insertuser(User u);

	public boolean retriveUser(String userName);
}
