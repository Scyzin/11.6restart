package czs.dao;

import czs.uesr.User;

public interface UserDao {
	/**
	 * 这是用户登录功能
	 * @param userName
	 * 			用户
	 * @param password
	 * 			密码
	 * @return 返回登陆是否成功
	 */
	public abstract boolean isLogin(String userName,String password);
	/**
	 * 这是用户注册功能
	 * 
	 * @param user
	 * 		要注册的用户具体信息
	 */
	public abstract void regist(User user);
}
