package java_08;

public class TacGia {
	private String tenTacGia;
	private ngay ngaySinh;
	
	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public TacGia(String tenTacGia, ngay ngaySinh) {
		
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}
	

}
