package Laba2;

import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JTextField;

// класс реализующий слушатель (ожидания нажатия кнопки)
public class ListenerButton implements ActionListener {

	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JTextField[] ArrData=subversion.student.getArray();
		String Textlab1=ArrData[0].getText();
		int KolvoG=Integer.parseInt(Textlab1);
		String Textlab2=ArrData[0].getText();
		int Pl=Integer.parseInt(Textlab2);
		String Textlab3=ArrData[0].getText();
		int KolvoOf=Integer.parseInt(Textlab3);
		System.out.println(transfer_logo.R);
		System.out.println(transfer_logo2.Z);
		System.out.println(transfer_logo3.N);
		int Sum;
		Sum=KolvoOf*1500 + transfer_logo2.Z*KolvoG+ transfer_logo3.N*KolvoG+transfer_logo.R;
		//JLabel Sum = new JLabel(toString(R))); // Отображение текста или изображения
		//Sum.setBounds(1000,1000,250,30);
		//subversion.main_panel.add(Sum);
		//System.exit(1);
		
	}

	
}
