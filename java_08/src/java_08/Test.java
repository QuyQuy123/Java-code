package java_08;

public class Test {
	public static void main(String[] args) {
		ngay  ngay1 = new ngay(04,5,2004);
		ngay  ngay2 = new ngay(28,8,2004);
		ngay  ngay3 = new ngay(24,11,2004);
		
		TacGia tacgia1 =  new TacGia("QuyQuy", ngay1);
		TacGia tacgia2 =  new TacGia("PhuongAnh", ngay2);
		TacGia tacgia3 =  new TacGia("Linh", ngay1);
		
		
		sach sach1 = new sach("LaptrinhC", 5, 2003, tacgia1);
		sach sach2 = new sach("Laptrinhjava", 15, 2004, tacgia2);
		sach sach3 = new sach("LaptrinhPhP", 25, 2004, tacgia3);
		
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		System.out.println("so sanh sach 1 va 3:"+sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("so sanh sach 2 va 3:"+sach2.kiemTraCungNamXuatBan(sach3));

		System.out.println("Sach 1 giam con:"+sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam con:"+sach2.giaSauKhiGiam(10));
		System.out.println("Sach 3 giam con:"+sach3.giaSauKhiGiam(10));

		

		
	}
}
