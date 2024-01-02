package Test1;

public class Thoikb {
	private Ngay thu;
	
	private String cacMonHoc;

	public Thoikb(Ngay thu, String cacMonHoc) {
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}

	public Ngay getThu() {
		return thu;
	}

	public void setThu(Ngay thu) {
		this.thu = thu;
	}

	public String getCacMonHoc() {
		return cacMonHoc;
	}

	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}

	@Override
	public String toString() {
		return "Thoikb [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}
	
	
	
	
	
}
