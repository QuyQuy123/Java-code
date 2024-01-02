package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import View.CounterView;

public class CounterListener implements ActionListener{
	
	private CounterView ctv;	
	
	public CounterListener(CounterView ctv){
		this.ctv =ctv;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String src = e.getActionCommand();
		System.out.println("Bạn Đã Nhấn Nút : "+src);
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}
		
	}

	

}
