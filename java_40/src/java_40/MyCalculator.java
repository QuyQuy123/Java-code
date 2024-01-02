package java_40;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		this.setTitle("My_Calculator");
		
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		////
		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(5,3,10,10));
		
		for (int i = 0; i < 10; i++) {
			JButton jButton = new JButton(i+"");
			jPanel_buttons.add(jButton);
		}
		
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");

		
		jPanel_buttons.add(jButton_cong);
		jPanel_buttons.add(jButton_tru);
		jPanel_buttons.add(jButton_nhan);
		jPanel_buttons.add(jButton_chia);
		jPanel_buttons.add(jButton_bang);

		this.setLayout(new BorderLayout());
		
		this.add(jPanel_head,BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		new MyCalculator();
	}
	
}
