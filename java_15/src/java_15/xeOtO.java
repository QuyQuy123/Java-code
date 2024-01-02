package java_15;

public class xeOtO extends PhuongTienDiChuyen {
	private String laoiNhienLieu;

	public xeOtO( HangSanXuat hangSanXuat, String laoiNhienLieu) {
		super("O To", hangSanXuat);
		this.laoiNhienLieu = laoiNhienLieu;
	}

	public String getLaoiNhienLieu() {
		return laoiNhienLieu;
	}

	public void setLaoiNhienLieu(String laoiNhienLieu) {
		this.laoiNhienLieu = laoiNhienLieu;
	}

	@Override
	public double layVanToc() {
		
		return 20;
	}
	
	

	
	
	

}
