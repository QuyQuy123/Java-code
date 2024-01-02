package java_06;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten , double gia , double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;		
	}
	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;		
	}
	public boolean KiemTraKhoiLuongLonHon(double kl) {
		return this.khoiLuong > kl;		
	}
	public boolean KiemTraTongTienLonHon() {
		return this.tinhTongTien()> 500000;			
	}
	public double giamGia(double x) {
		if(this.tinhTongTien()>500000) {
			return (x / 100) * this.tinhTongTien();
		}else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien()-this.giamGia(x);
	}
	
	
}









