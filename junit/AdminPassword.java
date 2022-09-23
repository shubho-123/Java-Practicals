package junit;

public class AdminPassword {
	
	private String username, password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkAdminPassword()
	{ 
		if(getUsername().equals("admin") && getPassword().equals("admin123"))   //never use == for String; use equals()
			return true;
		else 
			return false;
	}
}
