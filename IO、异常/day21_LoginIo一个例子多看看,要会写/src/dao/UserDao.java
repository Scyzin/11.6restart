package dao;

import pojo.User;

/**
 * ��������û������Ľӿ�
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * �����û���½��
	 * 
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
	 * @return ���ص�½�ɹ�
	 * 
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * �����û�ע�Ṧ��
	 * 
	 * @param user
	 *            ��ע����û���Ϣ
	 */
	public abstract void regist(User user);

}
