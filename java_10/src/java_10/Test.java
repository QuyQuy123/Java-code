package java_10;

public class Test {
	public static void main(String[] args) {
		NgaySinh ngaySinh1 = new NgaySinh(28, 5, 2004);
		NgaySinh ngaySinh2 = new NgaySinh(28, 5, 2004);
		NgaySinh ngaySinh3 = new NgaySinh(22, 11, 2004);
		
		
		Lop lop1 = new Lop("SE1893", "CNTT");
		Lop lop2 = new Lop("HQ1200", "ATTT");
		Lop lop3 = new Lop("BR1880", "CSDL");
		
		
		SinhVien sinhVien1 = new SinhVien(0001, "Nguyen Van Quy", ngaySinh1, 10, lop3);		
		SinhVien sinhVien2 = new SinhVien(0012, "Le Thuy Linh", ngaySinh2, 7, lop1);
		SinhVien sinhVien3 = new SinhVien(0020, "Nguyen Van Quy", ngaySinh3, 2, lop2);
		
		
		
		System.out.println("Ten khoa cua sinh vien 1:"+sinhVien1.layTenKhoa());
		System.out.println("Ten khoa cua sinh vien 2:"+sinhVien2.layTenKhoa());
		System.out.println("Ten khoa cua sinh vien 3:"+sinhVien3.layTenKhoa());
		
		
		System.out.println("Sinh vien 1 co dau hay khong:"+sinhVien1.dauHayKhong());
		System.out.println("Sinh vien 2 co dau hay khong:"+sinhVien2.dauHayKhong());
		System.out.println("Sinh vien 3 co dau hay khong:"+sinhVien3.dauHayKhong());

		System.out.println("Sv1 co trung ngay sinh voi Sv2:"+sinhVien1.kiemTraCungNgaySinh(sinhVien2));


		System.out.println("Sv1 co trung ngay sinh voi Sv3:"+sinhVien1.kiemTraCungNgaySinh(sinhVien3));

		


	}
}
