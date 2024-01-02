package java_06;

public class main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("TRUNGNGUYEN",100000,1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("TRUNGNGUYEN",100000,5.5);
		System.out.println("Tong tien can tra hd: "+hd.tinhTongTien());
		System.out.println("Tong tien can tra hd2: "+hd2.tinhTongTien());

		
		System.out.println("Kiem Tra kl > 2kg: "+ hd.KiemTraKhoiLuongLonHon(2));
		
		System.out.println("Kiem Tra kl > 2kg: "+ hd.KiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem tra tong tien >500k:"+hd.KiemTraTongTienLonHon());
		
		System.out.println("Giam gia cua hd:"+hd.giamGia(10));
		System.out.println("Giam gia cua hd2:"+hd2.giamGia(10));
		
		System.out.println("Gia sau khi giam cua hd:"+hd.giaSauKhiGiam(10));
		System.out.println("Gia sau khi giam cua hd2:"+hd2.giaSauKhiGiam(10));

		
		
	}

}
