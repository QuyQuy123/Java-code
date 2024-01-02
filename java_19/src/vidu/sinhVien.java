package vidu;

public class sinhVien implements Comparable<sinhVien> {
	private int maSinhVien;
	private String HoVaTen;
	private String tenLop;
	private double diemTrungBinh;

	public sinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {

		this.maSinhVien = maSinhVien;
		this.HoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return HoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", HoVaTen=" + HoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	/*
	 * public String getTen() { String s= this.HoVaTen.trim(); if(s.indexOf(" ")>=0)
	 * { int vt = s.lastIndexOf(" "); return s.substring(vt+1); }else { return s; }
	 * }
	 * 
	 * @Override public int compareTo(sinhVien o) { // so sanh ten: String tenThis =
	 * this.getTen(); String teno = o.getTen(); return tenThis.compareTo(teno);
	 * 
	 */
	@Override
	// so sanh diem trung binh
	public int compareTo(sinhVien o) {
		if (this.diemTrungBinh < o.diemTrungBinh) {
			return 1;
		} else if (o.diemTrungBinh < this.diemTrungBinh) {
			return -1;
		} else {
			return 0;
		}

	}

}
