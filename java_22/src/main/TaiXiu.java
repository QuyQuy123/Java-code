package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("vi","VN");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		
		int luaChon =0;
		do {
			System.out.println("-------Mời bạn chọn:-------");
			System.out.println("Chọn(1)để tiếp tục:");
			System.out.println("Nhấn phím bất kì để thoát!");
			luaChon = sc.nextInt();
			
			if(luaChon ==1) {
				System.out.println("***Bắt Đầu***");
				System.out.println("***Tài khoản của bạn:"+numf.format(taiKhoanNguoiChoi));
				double datCuoc = 0;
				do {
					System.out.println("0<= Số tiền cược <= "+numf.format(taiKhoanNguoiChoi));
					System.out.println("***Bạn Muốn Cược Bao Nhiêu:");
					
					datCuoc = sc.nextDouble();
				}while(datCuoc<=0|| datCuoc>taiKhoanNguoiChoi);
				
				int luaChonTaiXiu = 0;
				do {
					System.out.println("***Chọn 1 <-> Tài hoặc 2 <->Xỉu");
					luaChonTaiXiu = sc.nextInt();
					
					
				}while (luaChonTaiXiu!=1 && luaChonTaiXiu!=2);
				
				Random xucxac1 = new Random();
				Random xucxac2 = new Random();
				Random xucxac3 = new Random();
				
				int giaTri_1 = xucxac1.nextInt(6)+1;
				int giaTri_2 = xucxac2.nextInt(6)+1;
				int giaTri_3 = xucxac3.nextInt(6)+1;
				int tong = giaTri_1+giaTri_2+giaTri_3;
				System.out.println("***Kết Qủa: "+giaTri_1+"-"+giaTri_2+"-"+giaTri_3);
				
				if(tong ==3 || tong ==18) {
					taiKhoanNguoiChoi-=datCuoc;
					System.out.println("***Tổng Là: "+tong+"=> Nhà cái ăn hết , bạn đã thua!");
					System.out.println("***Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
						
				}else if(tong >=4&& tong<=10) {
					System.out.println("***Tổng là: "+tong+"=>Xỉu");
					
					if(luaChon ==2) {
						System.out.println("***Bạn đã thắng cược***");
						taiKhoanNguoiChoi+=datCuoc*2;
						System.out.println("***Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
						
					}else {
						System.out.println("***Bạn đã thua cược***");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("***Tài khoản của bạn: "+numf.format(taiKhoanNguoiChoi));
						

					}
				}else {
					System.out.println("***Tổng là: "+tong+"=>Tài");
					if(luaChon ==1) {
						System.out.println("***Bạn Cược Thắng");
						taiKhoanNguoiChoi+=datCuoc*2;
						System.out.println("**Tài Khoản Của Bạn: "+numf.format(taiKhoanNguoiChoi));
						
					}else {
						System.out.println("**Bạn Cược Thua**");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("**Tài Khoản Của Bạn: "+numf.format(taiKhoanNguoiChoi));
						
					}
					
				}

			}
			
			if(taiKhoanNguoiChoi<=0) {
				System.out.println("Số Dư Tài Khoản Của Bạn Hiện Tại Không Thể Tiến Hành Đặt Cược!");
				break;
			}else {
				System.out.println();
				System.out.println("---------------Bạn có muốn tiếp tục chơi không!---------------");
			}
			
			
		}while(luaChon==1);
		
		
		
	}
}
