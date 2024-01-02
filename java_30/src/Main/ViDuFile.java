package Main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}
	public boolean kiemTraThucThi() {
		//kiem tra file co the thuc thi duoc hay khong
		return this.file.canExecute();
	}
	public boolean kiemTraDoc() {
		//kiem tra file co the doc duoc hay khong
		return this.file.canRead();
	}
	public boolean kiemTraGhi() {
		//kiem tra file co the viet duoc hay khong
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
		
	}
	public void inTen() {
		System.out.println(this.file.getName());
		
	}
	public void kiemTraLaThuMucHayTapTin() {
		if(this.file.isDirectory()) {
			System.out.println("Day la thu muc");
		}else if(this.file.isFile()) {
			System.out.println("Day la tap tin");
		}
	}
	public void inDanhSachCacFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Cac tap tin/ thu muc con :");
			File[] mangCon = this.file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
				
			}
		}else if(this.file.isFile()) {
			System.out.println("Day la tap tin, khong co du lieu");
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhap Ten File:");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		
		
		do {
			
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println(vdf.kiemTraThucThi());
				
				break;
			case 2:
				System.out.println(vdf.kiemTraDoc());
				
				break;
			case 3:
				System.out.println(vdf.kiemTraGhi());
				
				break;
			case 4:
				System.out.println("Duong dan:");
				vdf.inDuongDan();
				break;
			case 5:
				System.out.println("Ten File:");
				vdf.inTen();
				break;
			case 6:
				System.out.println("Kiem Tra:");
				vdf.kiemTraLaThuMucHayTapTin();
				
				break;
				
			case 7:
				vdf.inDanhSachCacFileCon();
				
				break;
			case 8:
				vdf.inDanhSachCacFileCon();
				
				break;
			
			
				
			default:
				break;
			}
			
			
			
		}while(luaChon !=0);
	}
}
