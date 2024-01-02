package java_03;

import java.util.Iterator;
import java.util.Scanner;

public class tvmath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * double a,b; System.out.println("Nhap vao so a:"); a = sc.nextDouble();
		 * System.out.println("Nhap vao b:"); b = sc.nextDouble();
		 * System.out.println("|a| ="+Math.abs(a)); System.out.println("a ^2 :"+
		 * Math.pow(a, 2)); System.out.println("Can bac 2 cua a:"+ Math.sqrt(a));
		 * 
		 * System.out.println("Min:"+ Math.min(a, b)); System.out.println("Max:"+
		 * Math.max(a, b));
		 * 
		 * System.out.println("ceil(a)="+ Math.ceil(a));// lam tron len
		 * System.out.println("floor (a):"+ Math.floor(a));// lam tron xuong
		 * 
		 * 
		 * 
		 * // nhap ban kinh , tinh chu vi va dien tich
		 * 
		 * float r; System.out.println("Nhap vao ban kinh:"); r = sc.nextFloat(); float
		 * chuvi =(float)(2*r*Math.PI); float dientich =(float)(Math.pow(r,2)*Math.PI);
		 * System.out.println("Chu vi :"+Math.round(chuvi*100.0)/100.0);
		 * System.out.println("---------------");
		 * System.out.println("dien tich:"+Math.round(dientich*100.0)/100.0);
		 * 
		 * 
		 * System.out.println("Nhap vao gia tri:"); int a = sc.nextInt(); switch (a) {
		 * case 1: System.out.println("Day la so 1"); break; case 2:
		 * System.out.println("Day la so 2"); break; case 3:
		 * System.out.println("Day la so 3"); break; default:
		 * System.out.println("Day la 1 so khac"); }
		 * 
		 * 
		 * for(int i=0;i<10;i++) { System.out.println("Tớ Nhớ Cậu lần "+i); }
		 * 
		 * 
		 * 
		 * // in bảng cửu chương
		 * 
		 * for(int i=2;i<=10;i++) { for(int j =1;j<=10;j++) { System.out.println(i
		 * +" * "+j+" = "+i*j ); } System.out.println("\n"); }
		 * 
		 * 
		 * 
		 * // chuyen thap phan sang nhi phan
		 * System.out.println("Nhap vao so chuyen doi"); int a = sc.nextInt(); String
		 * nhiphan = ""; while(a >0) { nhiphan = (a % 2)+nhiphan; a = a/2; }
		 * System.out.println("Nhi phan la:"+nhiphan);
		 * 
		 */

		int a=0;
		try {
			System.out.println("Nhap vao so a");
			a = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		}
		System.out.println("So vua nhap:"+a);
		System.out.println("Ket thuc chuong trinh");
		

	}

}
