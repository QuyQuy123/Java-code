package Main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {
	public static void main(String[] args) {
//		File f = new File("D:\\codejava\\java_32\\file.txt");
//		try {
//			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//			
//			String line = null;
//			while(true) {
//				line = br.readLine();
//				if(line == null) {
//					break;
//				}else {
//					System.out.println(line);
//				}
//			}
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// cach 2 :
		File f2 = new File("D:\\codejava\\java_32\\file.txt");
		try {
			List<String > allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			for ( String Line : allText) {
				System.out.println(Line);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
