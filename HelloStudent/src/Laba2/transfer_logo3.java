package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class transfer_logo3 implements ActionListener {
	public static int N;
	@Override
	public void actionPerformed(ActionEvent b) {
		// TODO Auto-generated method stub
		
		JComboBox box2 = (JComboBox)b.getSource();
		String item1 = (String)box2.getSelectedItem();
	
		if (item1=="Да") 
		{
			N=150;	

		}
		
		if (item1=="Нет") 
		{
			N=0;
			
		}
		
	}

}