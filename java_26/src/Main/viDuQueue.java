package Main;

import java.util.LinkedList;
import java.util.Queue;

public class viDuQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		danhSachSV.offer("Quy coi ");
		danhSachSV.offer("la");

		danhSachSV.offer(" ga mo ");
		danhSachSV.offer(" hoc lap trinh");
		while(true) {
			String ten = danhSachSV.poll();//=> lay ra va xoa
			if(ten == null) {
				break;
			}
			System.out.print(ten);
		}// peek => lay ra nhung khong xoa
		
	}
}
