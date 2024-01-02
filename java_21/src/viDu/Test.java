package viDu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// cat chuoi
		String s= "Xin chao cac ban, minh la quy quy day";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b= s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao , minh la Quy Quy .Minh la ga mo hoc lap trinh";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		
		// lay ra ten
		String s3 = "Nguyen Van Quy";
		String[] d = s3.split(" ");
		System.out.println("Ten:"+d[d.length-1]);
		
		
		
		
		
	}
}
