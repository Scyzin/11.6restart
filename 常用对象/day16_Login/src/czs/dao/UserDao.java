package czs.dao;

import czs.uesr.User;

public interface UserDao {
	/**
	 * �����û���¼����
	 * @param userName
	 * 			�û�
	 * @param password
	 * 			����
	 * @return ���ص�½�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String userName,String password);
	/**
	 * �����û�ע�Ṧ��
	 * 
	 * @param user
	 * 		Ҫע����û�������Ϣ
	 */
	public abstract void regist(User user);
}
