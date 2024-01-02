package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame{
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// can giua cua so
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
		
		// set layout
		
//		FlowLayout flowLayout  = new FlowLayout();
//		this.setLayout(flowLayout);
		
		FlowLayout flowLayout  = new FlowLayout(FlowLayout.CENTER,50,50);
		this.setLayout(flowLayout);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);


		
		
		
	}
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}

}
