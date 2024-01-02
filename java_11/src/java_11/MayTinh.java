package java_11;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private int thoiGianBaoHanh;
	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoiGianBaoHanh) {
		
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean kiemTraGiaCoThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
			
	}
	public String layTenQuocGia() {
		return this.hangSanXuat.getQuocGia().getTenQuocGia(); 	
	}
	
	
	
	
}
