package Main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();
		// stackChuoi.push ("Gia tri")=> dua gia tri vao stack
		// stackChuoi.pop()=> lay gia tri ra va xoa khoi stack
		// stackChuoi.peek()=>lay gia tri ra nhg khong xoa khoi stack
		
		// stackChuoi.clear()=> xoa all phan tu trong stack
		
		// stackChuoi.contains("Gia tri")=> xac dinh gia tri co ton tai trong stack hay khong
		
		// lay ra do lon cua stack dubg
		// dao nguoc chuoi dung stack
		
		System.out.println("Nhap vao 1 chuoi:");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
		System.out.println("Chuoi Dao Nguoc:");
		for(int i=0;i<s.length();i++) {
			System.out.print(stackChuoi.pop());
		}
		// chuyen thap phan sang nhi phan
			
		Stack<String> stacksoDu = new Stack<String>();
		System.out.println("\nNhap vao 1 so nguyen duong:");
		int x = sc.nextInt();
		while(x>0) {
			int soDu = x % 2;
			stacksoDu.push(soDu+"");
			x =x/2;
		}
		System.out.println("So nhi phan la:");
		int n = stacksoDu.size();
		for(int i=0;i<n;i++) {
			System.out.print(stacksoDu.pop());
		}
		
		
		
	}
}
