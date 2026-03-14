package Com.aspect;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider {
	
	public static Connection provideConnection() {
		
		Connection con =null;
		
		try {
			
			FileInputStream fis = new FileInputStream("./Resources//dbconfig.properties");
			Properties p = new Properties();
			p.load(fis);
			
			String ClassName = p.getProperty("classname");
			String url = p.getProperty("url");
			String userName = p.getProperty("username");
			String pass = p.getProperty("password");
			
			Class.forName(ClassName);
			con = DriverManager.getConnection(url,userName,pass);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
