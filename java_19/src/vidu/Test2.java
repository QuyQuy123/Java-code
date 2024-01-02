package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		sinhVien sv1 = new sinhVien(120, "Nguyen Van Quy", "Lop 1", 9);
		sinhVien sv2 = new sinhVien(150, "Nguyen Van Duy", "Lop 5", 9);
		sinhVien sv3 = new sinhVien(100, "Nguyen Lan Anh", "Lop 2", 10);
		
		sinhVien[] a_sv = new sinhVien[]{sv1,sv2,sv3};
		System.out.print("ban dau:"+Arrays.toString(a_sv));
		
		// ham sap xep:
		Arrays.sort(a_sv);
		System.out.print("Luc sau:"+Arrays.toString(a_sv));
		// tim kiem:
		System.out.println("\nTim Kiem quy:"+Arrays.binarySearch(a_sv, sv1));
		
		
		
	
	}
}
