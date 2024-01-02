package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class ViDu_BorderLayout2 extends JFrame{
	public ViDu_BorderLayout2() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// can giua cua so
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
		
		// set layout
		
//		FlowLayout flowLayout  = new FlowLayout();
//		this.setLayout(flowLayout);
		
		BorderLayout borderLayout_1  = new BorderLayout();
		BorderLayout borderLayout_2  = new BorderLayout(15,15);

		this.setLayout(borderLayout_2);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");

		
		this.add(jButton_1,BorderLayout.NORTH);
		this.add(jButton_2,BorderLayout.WEST);
		this.add(jButton_3,BorderLayout.SOUTH);
		this.add(jButton_4,BorderLayout.EAST);
		this.add(jButton_5,BorderLayout.CENTER);

		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);


		
		
		
	}
	public static void main(String[] args) {
		new ViDu_BorderLayout2();
	}

}
