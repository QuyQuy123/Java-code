package Test;

import java.util.Scanner;

import Main.DanhSachSinhVien;
import Main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon =0;
		do {
			System.out.println("-----MENU-----");
			System.out.println("Vui long lua chon chuc nang:");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "0.   Thoát khỏi chương trình");
			
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon ==1) {
				System.out.println("Nhap Ma Sinh Vien:");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhap Ho Va Ten:");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap Nam Sinh:");
				int  namSinh = sc.nextInt();
				System.out.println("Nhap Diem Trung Binh:");
				float diemTrungBinh = sc.nextFloat();
				
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				


			}else if(luaChon ==2) {
				dssv.inDanhSachSinhVien();
				
			}else if(luaChon ==3) {
				System.out.println("Kiem Tra Danh Sach Rong:"+dssv.kiemTraDanhSachRong());
				
			}else if(luaChon ==4) {
				System.out.println("So Luong Sinh Vien Trong Danh Sach:"+dssv.laySoLuongSinhVien());
				
			}else if(luaChon ==5) {
				dssv.lamRongDanhSach();
			}else if(luaChon ==6) {
				System.out.println("Nhap Ma Sinh Vien:");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem TRa Sinh Vien trong danh sach:"+dssv.kiemTraTonTai(sv));
			
				
			}else if(luaChon ==7) {
				System.out.println("Nhap Ma Sinh Vien can Xoa :");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xoa Sinh Vien Trong danh sach "+dssv.xoaSinhVien(sv));
				
			}else if(luaChon ==8) {
				System.out.println("Nhap Ho Va Ten:");
				String hoVaTen = sc.nextLine();
				System.out.println("Ket Qua Tim Kiem:");
				dssv.timSinhVien(hoVaTen);
				
				
				
			}else if(luaChon ==9) {
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}
		}while(luaChon != 0);
	}
}
