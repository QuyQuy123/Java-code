package java_07;

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15,5,2025);
		MyDate md2= new MyDate(31,1,2021);
		MyDate md3 = new MyDate(10,1,2025);

		
		System.out.println("md1 so sanh md2:"+md1.equals(md2));
		System.out.println("md1 so sanh md3:"+md1.equals(md3));

		System.out.println("Hashcode md1:"+md1.hashCode());
		
		
	}

}
