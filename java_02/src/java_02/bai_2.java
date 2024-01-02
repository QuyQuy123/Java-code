package java_02;

import java.util.Scanner;

public class bai_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Nhap vao a va b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a ==0 && b ==0) {
			System.out.println("Phuong trinh vo so nghiem");
		}else if(a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		}else {
			
			float x = (float) a / b;
			System.out.println("---------------");
			System.out.println("Gia tri cua x:"+a+"/"+ b +"="+x);	
		}	
		
		
		// tim ucln
		System.out.println("Nhap vao a va b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tich = a *b;
		int ucln;
		if(a ==0 || b ==0) {
			ucln = a+b;
		}else {
			while(a !=b) {
				if(a >b) {
					a = a-b;
				}else {
					b = b-a;
				}
			}
			ucln =a;
		}
		System.out.println("UCLN :" + ucln);
		
		int bcnn = tich / ucln;
		System.out.println("BCNN:"+bcnn);
		
		
		
		//giai pt ax^2 +bx +c =0
		
		
		
		System.out.println("Nhap vao a,b,c:");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c= sc.nextFloat();
		float x , x1, x2;
		if(a ==0 && b == 0 && c==0) {
			System.out.println("Phuong trinh vo so nghiem");
			
		}else if(a ==0 && b ==0 && c !=0) {
			System.out.println("Phuong trinh vo nghiem");
		}else if( a ==0 && b != 0) {
			x = -c/b;
			System.out.println("Phuong trinh co nghiem: x="+x);
			
		}else {
			float denta = b*b - 4*a*c;
			if(denta >0) {
				x1 =(float)((-b+Math.sqrt(denta))/(2*a));
				x2 =(float)((-b-Math.sqrt(denta))/(2*a));
				System.out.println("Phuong trinh co 2 ngiem:");
				System.out.println("x1="+x1);
				System.out.println("x2="+x2);
				
			}else if(denta == 0) {
				x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep:");
				System.out.println("x="+x);
			}else {
				System.out.println("Phuong trinh vo nghiem!");
			}
		}
		
		*/
		// kiem tra so chan le
		System.out.println("Nhap vao so can kiem tra:");
		int a = sc.nextInt();
//		if(a % 2 ==0) {
//			System.out.println("Day la so chan");
//		}else {
//			System.out.println("Day  la so le");
//		}
		// toan tu 3 ngoi
		String ketqua = (a % 2 ==0)?"so chan":"so le";
		System.out.println(a + " la " + ketqua);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
