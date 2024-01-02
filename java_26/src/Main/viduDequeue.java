package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class viduDequeue {
	public static void main(String[] args) {
		//deque co the tham vao ca 2 dau
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("Quy coi ");
		danhSachSV.offer("la");

		danhSachSV.offer(" ga mo ");
		danhSachSV.offer(" hoc lap trinh");
		danhSachSV.offerFirst(" hoc lap trinh");
		danhSachSV.offerLast(" hoc lap trinh");


		while(true) {
			String ten = danhSachSV.poll();//=> lay ra va xoa
			if(ten == null) {
				break;
			}
			System.out.print(ten);
		}// peek => lay ra nhung khong xoa
		
	
	}
}
