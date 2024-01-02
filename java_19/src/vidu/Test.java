package vidu;

public class Test {
	public static void main(String[] args) {
		sinhVien sv1 = new sinhVien(120, "Nguyen Van Quy", "Lop 1", 9);
		sinhVien sv2 = new sinhVien(100, "Nguyen Van Auy", "Lop 2", 10);
		
		System.out.println(sv1.compareTo(sv2));
	}
	

	
}
