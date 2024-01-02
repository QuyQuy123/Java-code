package Test;

import Model.CounterModel;
import View.CounterView;

public class Test {
	public static void main(String[] args) {
		
		CounterModel ct = new CounterModel();
		
		System.out.println(ct.getValue());
		CounterView ctv = new CounterView();
		
		
	}
}
