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
 * 这是用户操作的具体实现类
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
			System.out.println("创建文件失败");
		}
	}
	

	public boolean isLogin(String userName, String password) {
		boolean flag = false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				// 用戶名=密碼
				String[] datas = line.split("=");
				if (datas[0].equals(userName) && datas[1].equals(password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("用戶登陸找不到信息所在文件");
		} catch (IOException e) {
			System.out.println("用戶登陸失敗");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("用戶登陸釋放資源失敗");
				}
			}
		}

		return flag;
	}

	public void regist(User user) {
		BufferedWriter bw = null;
		try {
			//追加写入
			bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.flush();

		} catch (IOException e) {
			System.out.println("用戶註冊失敗");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("用戶註冊釋放資源失敗");
				// e.printStackTrace();
			}
		}
	}
}
