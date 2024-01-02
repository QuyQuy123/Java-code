package java_17;

public class vidu2 {
	public static void main(String[] args) {
		String s1 = "nguyen van quy";
		String s2 = "nguyen van quy";
		String s3 = "Nguyen Van quy";

		// ham equals => so sanh 2 chuoi , có phân biệt hoa , thường 
		
		
		System.out.println("s1 equals s2:"+s1.equals(s2));
		
		// equalsIgnoreCase khong phan bie hoa va thuong
		System.out.println("s1 equalsIgnoreCase s3:"+s1.equalsIgnoreCase(s3));
		
		// compare to : so sanh
		String sv1 = "Nguyen Van C";
		String sv2 = "Nguyen Van C";
		String sv3 = "Nguyen Van B";
		
		System.out.println("sv1 compare sv2:"+sv1.compareTo(sv2));
		System.out.println("sv1 compare sv3:"+sv1.compareTo(sv3));
		
		// compareIgnoreCase : so sanh khong phan biet chu hoa va thuong
		
		// regionMatches => so sanh 1 doan
		String q1 = "TITV.VN";
		String q2 = "TV.vN";
		boolean check = q1.regionMatches(2, q2, 0, 4);
		System.out.println(check);
		
		// startwith: kiem tra bat dau bang....
		
		String sdt = "0968311853";
		System.out.println(sdt.startsWith("0968"));
		
		
		// ham endWith : kiem tra chuoi ket thuc =
		
		String tenFile = "I LOVE YOU.JPG";
		String tenFile2 = "Xin chao cac ban.PDF";
		if(tenFile.endsWith("JPG")){
			System.out.println("File 1 la hinh anh");
		}else if (tenFile.endsWith("PDF")) {
			System.out.println("file PDF!");
		}

		
		
		
		
		
		
	}
}
