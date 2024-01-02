package java_17;

import java.util.Scanner;import javax.net.ssl.SSLEngine;

public class ViDu {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		String s;
		System.out.println("Nhap vao chuoi:");
		s = sc.nextLine();
		System.out.println("------");
		
		System.out.println("Do dai cua chuoi:"+ s.length());
		
		// charAt: lay ra 1 ki tu o 1 vi tri
		int doDai = s.length();
		for(int i=0;i<doDai;i++) {
			System.out.print(s.charAt(i));
			
		}
		
		// ham getchars
		//(start , stop , mang luu du lieu , vi tri bat dau luu)
		
//		char[] arrayChar = new char[100];
//		s.getChars(2, 5, arrayChar,0);
//		for(int i=0;i<arrayChar.length;i++) {
//			System.out.println("\nGia tri mang tai "+i+" la:"+arrayChar[i]);
//		}
		// ham so sanh chuoi
		
		
		
		
		
		
	}
}
