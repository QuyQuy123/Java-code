package viDu;

import java.util.Arrays;

public class Test {
	// tao 1 ham dao nguoc chuoi
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[15];

		System.out.println("a ban dau:" + Arrays.toString(a));

		// ham tim kiem

// sap xep dung binary chi tim kiem duoc sau khi da sap xep

		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));

		// ham dien gia tri:
		Arrays.fill(b, 5);
		System.out.println("Mang b:" + Arrays.toString(b));

		// ham sap xep:
		Arrays.sort(a);// sap xep tu nho den lon
		System.out.println("a sau khi sap xep:" + Arrays.toString(a));
		// sap xep tu lon den be:
		a = Test.reverse(a);
		System.out.println("Sap Xep giam dan:" + Arrays.toString(a));

	}
}
