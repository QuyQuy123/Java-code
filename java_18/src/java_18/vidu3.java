package java_18;

import java.util.Arrays;

public class vidu3 {
	public static void main(String[] args) {
		int[] mang1 = {1,2,3,4,5};
		
		// coppy mang : c1:co lam thay doi mang ban dau
		int[] mang2 = mang1;
		mang2[0]= 100;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang2));
		
		// cach 2 : dung ham clone:
		
		int[] mang3 =mang1.clone();// khong thay doi mang ban dau
		mang3[0] = 90;
		System.out.println(Arrays.toString(mang3));
		System.out.println(Arrays.toString(mang1));
		// cach 3:dung system .arraycoppy
		
		
		int[] mang4 = new int[mang1.length];
		System.arraycopy(mang1, 0, mang4, 0, mang1.length);
		mang4[0] = 500;
		System.out.println(Arrays.toString(mang4));
		System.out.println(Arrays.toString(mang1));
		
		
		
		

	}
}
