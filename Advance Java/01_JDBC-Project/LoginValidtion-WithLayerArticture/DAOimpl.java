package Com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.aspect.ConnectionProvider;
import Com.bean01.User;
import Com.dao.DAOinterface;

public class DAOimpl implements DAOinterface {

	Connection con = ConnectionProvider.provideConnection();
	PreparedStatement pst;

	@Override
	public void insertuser(User u) {

		try {
			pst = con.prepareStatement("insert into  users ( userName, password) values (?,?)");
			pst.setString(1, u.getUserName());
			pst.setString(2, u.getPassWord());
			
			
			
			int row = pst.executeUpdate();
			
			if(row > 0) {
				System.out.println("SignUP SucessFull !!!!");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public boolean retriveUser(String userName) {
		
		boolean flag = false;
		try {
			
			pst = con.prepareCall("select * from users whare userName = ? ");
			pst.setString(1, userName);
			
			ResultSet rs = pst.executeQuery();
			
			
			
			if(rs.next()) {
				flag = true;
			}else {
				flag = false;
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}

		return flag;
	}

}
