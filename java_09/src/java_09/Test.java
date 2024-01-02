package java_09;

public class Test {
	public static void main(String[] args) {
		
		Ngay ngay1 = new Ngay(15, 5, 2022);
		Ngay ngay2 = new Ngay(31, 1, 2025);
		Ngay ngay3 = new Ngay(16, 2, 2030);

		HangSanXuat hangsx1 = new HangSanXuat("Hang A","Viet Nam");
		HangSanXuat hangsx2 = new HangSanXuat("Hang B","Thai Lan");
		HangSanXuat hangsx3 = new HangSanXuat("Hang C","Trung Quoc");

		BoPhim boPhim1 = new BoPhim("Bo Gia", 2022, hangsx1, 50000, ngay1);
		BoPhim boPhim2 = new BoPhim("Doremon", 2010, hangsx3, 150000, ngay2);
		BoPhim boPhim3 = new BoPhim("Naruto", 2025, hangsx2, 230000, ngay3);
		
		
		System.out.println("ss phim 1 re hon phim 2:"+boPhim1.kiemTraGiaVeReHon(boPhim2));

		System.out.println("Hang san xuat bo phim 1:"+boPhim1.layTenHang());
		
		System.out.println("Gia ve sau khikhuyen mai cua phim1:"+boPhim1.giaSauKhuyenMai(10));
	}
}
