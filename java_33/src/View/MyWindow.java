package View;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public 	MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showIt() {
		this.setVisible(true);
	}
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
	}
	public void showIt(String title , int width, int height) {
		this.setTitle(title);
		this.setSize(300,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showIt("quy quy",300,300);
	}
}
