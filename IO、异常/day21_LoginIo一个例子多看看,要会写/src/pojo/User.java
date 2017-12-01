package pojo;

/**
 * 这是用户类
 * 
 * @author Administrator @version1.1
 */
public class User {
	private String username;
	private String password;

	public User() {
		super();
	}

	public User(String uesrname, String password) {
		super();
		this.username = uesrname;
		this.password = password;
	}

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

}
