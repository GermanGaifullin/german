package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class transfer_logo implements ActionListener {
	public static int R=50;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JComboBox box = (JComboBox)e.getSource();
		String item = (String)box.getSelectedItem();
		
	
		if (item=="���������") 
		{
			R=4200;	

		}
		
		if (item=="���������") 
		{
			R=7000;
			
		}
		
		if (item=="�����������") 
		{
			R=10000;
		}
		

		
	}

}
