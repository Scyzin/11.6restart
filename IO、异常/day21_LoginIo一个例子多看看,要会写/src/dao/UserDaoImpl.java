package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import pojo.User;

/**
 * �����û������ľ���ʵ����
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {
	private static File file = new File("user.txt");
	static {
		try {
			file.createNewFile();
		}catch(IOException e ){
			System.out.println("�����ļ�ʧ��");
		}
	}
	

	public boolean isLogin(String userName, String password) {
		boolean flag = false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				// �Ñ���=�ܴa
				String[] datas = line.split("=");
				if (datas[0].equals(userName) && datas[1].equals(password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("�Ñ�����Ҳ�����Ϣ�����ļ�");
		} catch (IOException e) {
			System.out.println("�Ñ����ʧ��");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("�Ñ����ጷ��YԴʧ��");
				}
			}
		}

		return flag;
	}

	public void regist(User user) {
		BufferedWriter bw = null;
		try {
			//׷��д��
			bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.flush();

		} catch (IOException e) {
			System.out.println("�Ñ��]��ʧ��");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("�Ñ��]��ጷ��YԴʧ��");
				// e.printStackTrace();
			}
		}
	}
}
