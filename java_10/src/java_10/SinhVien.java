package java_10;

public class SinhVien {
	private double maSinhVien;
	private String hoVaTen;
	private NgaySinh ngayThangNamSinh;
	private float diemTrungBinh;
	private Lop lop;
	
	public SinhVien(double maSinhVien, String hoVaTen, NgaySinh ngayThangNamSinh, float diemTrungBinh, Lop lop) {
		
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	public double getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(double maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public NgaySinh getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}
	public void setNgayThangNamSinh(NgaySinh ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	
	public boolean dauHayKhong() {
		return this.diemTrungBinh >=5;
		
	}
	
	public boolean kiemTraCungNgaySinh(SinhVien svKhac) {
		return this.ngayThangNamSinh.equals(svKhac.ngayThangNamSinh);
		
		
	}
	
	
	
	

}
