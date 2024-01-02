package java_11;

public class Test {
	public static void main(String[] args) {
		NgaySanXuat ngaySanXuat1 = new NgaySanXuat(10, 11, 2020);
		NgaySanXuat ngaySanXuat2 = new NgaySanXuat(20, 30, 2021);
		NgaySanXuat ngaySanXuat3 = new NgaySanXuat(11, 12, 2030);
		
		QuocGia quocGia1 = new QuocGia("VN", "VietNam");
		QuocGia quocGia2 = new QuocGia("TQ", "TrungQuoc");
		QuocGia quocGia3 = new QuocGia("TL", "ThaiLan");
		
		HangSanXuat hangsx1 = new HangSanXuat("VietPhat", quocGia1);
		HangSanXuat hangsx2 = new HangSanXuat("GiangAao", quocGia3);
		HangSanXuat hangsx3 = new HangSanXuat("TungCua", quocGia2);

		
		MayTinh mayTinh1 = new MayTinh(hangsx3, ngaySanXuat1, 100, 24);
		MayTinh mayTinh2 = new MayTinh(hangsx1, ngaySanXuat2, 500, 14);
		MayTinh mayTinh3 = new MayTinh(hangsx2, ngaySanXuat3, 120, 20);
		//a
		System.out.println(" Gia MT3 co thap hon MT2:"+mayTinh3.kiemTraGiaCoThapHon(mayTinh2));
		System.out.println(" Gia MT2 co thap hon MT1:"+mayTinh2.kiemTraGiaCoThapHon(mayTinh1));
		System.out.println(" Gia MT3 co thap hon MT1:"+mayTinh3.kiemTraGiaCoThapHon(mayTinh1));

		//b
		
		System.out.println("Ten QGXS may 1 :"+quocGia1.getTenQuocGia());
		System.out.println("Ten QGXS may 2 :"+quocGia2.getTenQuocGia());
		System.out.println("Ten QGXS may 3 :"+quocGia3.getTenQuocGia());

	}
}
