package Com.aspect;

import java.io.FileInputStream;
import java.util.Properties;

import Com.serviceLayer02.LoginValidationService;

public class ObjectCreater {

	public static LoginValidationService CreateObject() {

		String ClassName = null;
		LoginValidationService login = null;

		try {
			
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			Properties p = new Properties();
			p.load(fis);
			
			ClassName= p.getProperty("businessClass");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			login = (LoginValidationService) Class.forName(ClassName).newInstance();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return login;
	}

}
