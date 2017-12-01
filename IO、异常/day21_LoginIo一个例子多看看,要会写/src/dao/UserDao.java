package dao;

import pojo.User;

/**
 * 这是针对用户操作的接口
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 这是用户登陆泪
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 返回登陆成功
	 * 
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * 这是用户注册功能
	 * 
	 * @param user
	 *            用注册的用户信息
	 */
	public abstract void regist(User user);

}
