package timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		
		String s = "2017-12-5 11:50:11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		
		t.schedule(new DeleteFolder(), d);
	}
}
class DeleteFolder extends TimerTask{
	public void run() {
		File srcFolder = new File("Demo");
		deleteFolder(srcFolder);
	}
	public void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if(fileArray != null) {
			for(File file : fileArray) {
				if(file.isDirectory()) {
					deleteFolder(file);
				}else {
					System.out.println(file.getName() + " :" +file.delete());
				}
			}
			System.out.println(srcFolder.getName() + " :" + srcFolder.delete());
		}
	}
}