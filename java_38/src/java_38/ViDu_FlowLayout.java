package java_38;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	public ViDu_FlowLayout() {
		this.setTitle("Layout");
		this.setSize(300,300);
		// can giua cua so
		
		this.setLocationRelativeTo(null);
		
		// SETLAYOUT
		
		BorderLayout borderLayout = new BorderLayout(15,15);
		this.setLayout(borderLayout);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		
		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2,BorderLayout.SOUTH);
		this.add(jButton_3, BorderLayout.CENTER);
		this.add(jButton_4, BorderLayout.WEST);
		this.add(jButton_5, BorderLayout.EAST);


		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}
	
}
