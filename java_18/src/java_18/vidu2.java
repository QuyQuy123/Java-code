package java_18;

public class vidu2 {
	public static void main(String[] args) {
		String s1 ="ga mo";
		String s2 = " hoc lap trinh";
		
		String s3 = s1 +s2;
		
		// => noi 2 chuoi dung ham concat;
		String s4 = s1.concat(s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
		
		// ham replace thay the
		
		String s5 = "quyquy";
		
		String s6= s5.replaceAll("quy", "vanquy");
		System.out.println(s6);
		
		// tolowercase // touppercase
		// strim=> xoa khoang trang 2 dau
		// substring : cat chuoi con;
		
		 String s10 = "Nguyen van quy";
		 String s11= s10.substring(6);
		 String s12= s10.substring(6,10);

		 System.out.println(s11);
		 System.out.println(s12);

		
		
	}
}
