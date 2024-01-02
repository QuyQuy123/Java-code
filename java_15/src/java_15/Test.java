package java_15;

public abstract class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Hang 2", "Trung Quoc");
		HangSanXuat h3 = new HangSanXuat("Hang 3", "Lao");
		
		MayBay p2 = new MayBay(h3, "xang");
		PhuongTienDiChuyen p1 = new xeOtO(h2,"dau");
		PhuongTienDiChuyen p3 = new XeDap(h1);
		
		System.out.println("Lay Hang sx :"+p1.layTenHangSanXuat());
		
		System.out.println("Bat Dau:");
		p2.batDau();
		System.out.println("Lay van toc:");
		System.out.println("p1:"+p1.layVanToc());
		System.out.println("p2:"+p2.layVanToc());
		System.out.println("p3:"+p3.layVanToc());
		
		
		System.out.println("Cat Canh:");
		
		p2.catCanh();

	}
}
