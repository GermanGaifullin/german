package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


public class ListenerLogo implements ActionListener {

	protected static Image logo;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		logo = new Image();
		logo.setSize(180, 100);
		logo.setLocation(200, 0);
						
		subversion.main_panel.add(logo);
		subversion.student.main_panel.repaint(); //перерисовка JPanel
			
		
	}

}
