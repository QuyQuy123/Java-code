package java_04;

import java.util.Iterator;
import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// nhap mang:
		int mang1[];
		
		mang1 = new int[3];
		for(int i=0;i< mang1.length;i++) {
			System.out.println("Nhap phan tu thu:"+i+":");
			mang1[i] = sc.nextInt();
		}
		int tong = 0;
		for(int i=0;i<mang1.length;i++) {
			tong = tong + mang1[i];
		}
		System.out.println("Tong cac phan tu cua mang:"+tong);
		
		
		*/
		
		int mang_2[];
		mang_2= new int[5];
		System.out.println("Nhap vao cac gia tri cua mang:");
		for(int i=0;i<mang_2.length;i++) {
			mang_2[i] = sc.nextInt();
		}
		int lonnhat = mang_2[0];
		for (int i = 0; i < mang_2.length; i++) {
			if(mang_2[i] > lonnhat) {
				lonnhat = mang_2[i];
			}
		}
		System.out.println("Max trong mang:"+lonnhat);
		
		
		
	}
}
