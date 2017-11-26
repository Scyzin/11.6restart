package czs.dao.impl;

import java.util.ArrayList;

import czs.dao.UserDao;
import czs.uesr.User;
/**
 * 这是用户操作的具体实现类
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{
	
	//为了多个方法都能使用到集合，将集合定义为成员变量
	private static ArrayList<User> array = new ArrayList<User>();
	@Override
	public boolean isLogin(String userName, String password) {
		// 遍历集合，获取每个用户，并判断该用户的用户名和密码是否正确 
		boolean flag = false;
		for(User u :array) {
			if(u.getUserName().equals(userName) && u.getPassword().equals(password)) {
				flag = true;
				break;
			}		
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		// 把用户信息存入集合
		
		array.add(user);
		
	}
	
}
