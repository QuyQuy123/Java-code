package java_31;

import java.io.PrintWriter;

public class ghiText {
	public static void main(String[] args) {
		// ghi du lieu vao file
		try {
			PrintWriter pw = new PrintWriter("D:\\codejava\\java_31\\file.txt","UTF-8");
			pw.print("Xin chao tat ca cac ban");
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
