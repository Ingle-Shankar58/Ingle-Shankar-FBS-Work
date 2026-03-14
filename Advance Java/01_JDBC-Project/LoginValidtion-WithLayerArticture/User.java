package Com.bean01;

import java.util.Objects;

// This is POJO Class For Data Carrier 

public class User {

	private String userName;
	private String passWord;

	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public User() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(passWord, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(passWord, other.passWord) && Objects.equals(userName, other.userName);
	}

}
