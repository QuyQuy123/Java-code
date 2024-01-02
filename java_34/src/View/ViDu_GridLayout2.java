package View;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout2 extends JFrame{
	public ViDu_GridLayout2() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// can giua cua so
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
		
		// set layout
		
//		FlowLayout flowLayout  = new FlowLayout();
//		this.setLayout(flowLayout);
		
		GridLayout gridLayout_1  = new GridLayout();
		GridLayout gridLayout_2  = new GridLayout(4,4);
		GridLayout gridLayout_3  = new GridLayout(4,4,25,25);


		this.setLayout(gridLayout_3);
		
		for (int i = 1; i < 17; i++) {
			JButton jButton = new JButton(i+"");
			this.add(jButton);
			
		}
		
//		this.add(jButton_1);
//		this.add(jButton_2);
//		this.add(jButton_3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);


		
		
		
	}
	public static void main(String[] args) {
		new ViDu_GridLayout2();
	}

}
