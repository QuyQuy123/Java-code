package java_16;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a:");

		MayTinhCasioFX500 mtfx500 = new MayTinhCasioFX500();
		MayTinhVinaCa500 mtvc500 = new MayTinhVinaCa500();

		System.out.println("5+3 =" + mtfx500.cong(5, 3));
		System.out.println("4/2 =" + mtvc500.chia(4, 2));
		System.out.println("4/0=" + mtfx500.chia(4, 0));

		System.out.println("Test cau b:");

		double[] arr1 = new double[] { 5, 1, 3, 4, 5, 8, 0 };
		double[] arr2 = new double[] { 6, 2, 7, 9, 2, 4, 3 };

		sapxepChen sxchen = new sapxepChen();
		sapXepChon sxchon = new sapXepChon();
		sxchen.sapXepTang(arr1);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");

		}
		System.out.println("-------");
		sxchon.sapXepGiam(arr2);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");


		}
		System.out.println("\n");
		System.out.println("Test cau c:");
		
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		
		System.out.println("3+5="+pmmt.cong(3, 5));
		double[] arr3 = new double[] { 10, 2, 3, 4, 5, 8, 0 };
		pmmt.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");


		}

	}
}
