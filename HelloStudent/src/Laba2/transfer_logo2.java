package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class transfer_logo2 implements ActionListener {
	public static int Z;
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		
		JComboBox box1 = (JComboBox)a.getSource();
		String sak = (String)box1.getSelectedItem();

		if (sak=="Да") 
		{
			Z=200;	
		}
		
		if (sak=="Нет") 
		{
			Z=0;
			
		}
		
	

		
	}

}