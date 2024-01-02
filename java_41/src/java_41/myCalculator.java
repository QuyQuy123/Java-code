package java_41;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myCalculator extends JFrame{
	public myCalculator() {
		this.setTitle("MyCalculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField();
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		
		JPanel jPanel_bottom = new JPanel();
		jPanel_bottom.setLayout( new GridLayout(5,3,10,10));
		
		for (int i = 0; i <= 9; i++) {
			JButton  jButtom = new JButton(i +"");
			jPanel_bottom.add(jButtom);
		}
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		
		jPanel_bottom.add(jButton_cong);
		jPanel_bottom.add(jButton_tru);
		jPanel_bottom.add(jButton_nhan);
		jPanel_bottom.add(jButton_chia);
		jPanel_bottom.add(jButton_bang);
		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_bottom, BorderLayout.CENTER);
		
		
		this.setVisible(true);


		
	}
	public static void main(String[] args) {
		new myCalculator();
	}
	
	
	
}
