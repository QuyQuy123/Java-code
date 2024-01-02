package java_18;

public class viDu {
	public static void main(String[] args) {
		String s1 = "Xin ô chao tat ca cac ban,Xin chao";
		String s2 = "Xin chao";
		char s3 ='ô';
		// neu cos se tra ve vi tri dau tien cua chuoi s2 trong s1 
		// neu khong tim thay se tra ve kq la =0
		//=> tim từ trái sang phải 
		System.out.println("vi tri cua s2 trong s1:"+s1.indexOf(s2));
		
		// tim tu 1 vi tri bat dau
		
		System.out.println("vi tri cua s2 trong s1:"+s1.indexOf(s2,2));
		System.out.println("vi tri cua s3 trong s1:"+s1.indexOf(s3));
		//=> lastindex => tim kiem tu phai sang trai
		
		
		
		
		
		
		
	}
}
