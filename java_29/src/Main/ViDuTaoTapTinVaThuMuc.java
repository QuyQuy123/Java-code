package Main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		// check thu muc co ton tai hay khong
		File folder_1 = new File("D:\\codejava\\java_29");
		System.out.println("Kiem Tra folder_1 co ton tai hay khong:"+folder_1.exists());
		
		File folder_2 = new File("D:\\codejava\\java_30");
		System.out.println("Kiem Tra folder_2 co ton tai hay khong:"+folder_2.exists());

		// tao thu muc
		// phuong thuc mkdir();=>tao 1 thu muc
		
		File d = new File("D:\\codejava\\java_29\\check_1");
		d.mkdir();

		//mkdirs=> tao nhieu thu muc
		//	File d = new File("D:\\codejava\\java_29\\check_1\\check_2\\check_3");
		//d.mkdir();
		
		// tao tap tin co duoi mo rong
		
		File file1 = new File("D:\\codejava\\java_29\\check_1\\check_1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block// k co quyen truy cap
			// o cung day
			//duong dan sai
			e.printStackTrace();
		}
		
		
		

		
		
		
	}
}
