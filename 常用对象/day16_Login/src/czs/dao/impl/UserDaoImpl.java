package czs.dao.impl;

import java.util.ArrayList;

import czs.dao.UserDao;
import czs.uesr.User;
/**
 * �����û������ľ���ʵ����
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{
	
	//Ϊ�˶����������ʹ�õ����ϣ������϶���Ϊ��Ա����
	private static ArrayList<User> array = new ArrayList<User>();
	@Override
	public boolean isLogin(String userName, String password) {
		// �������ϣ���ȡÿ���û������жϸ��û����û����������Ƿ���ȷ 
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
		// ���û���Ϣ���뼯��
		
		array.add(user);
		
	}
	
}
