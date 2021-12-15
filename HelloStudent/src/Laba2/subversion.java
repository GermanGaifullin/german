package Laba2; //����� Java �������

import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	protected  JFrame main_GUI;
	protected JPanel main_panel;
	
	protected JComboBox combo_student;
	protected JComboBox combo_zak;
	protected JComboBox combo_nap;
	private JTextField lab1=new JTextField();
	private JTextField lab2=new JTextField();
	private JTextField lab3=new JTextField();
	protected JTextField lab4=new JTextField();
	protected JTextField[] ArrData= {lab1,lab2,lab3};

		
	public subversion() {
		
	main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,450,420,320);
	main_GUI.setResizable(true); // ������������� ������ ����
	
	
	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("��� �����: ���"); // ����������� ������ ��� �����������
	laba_info.setBounds(2,2,150,30);
	main_panel.add(laba_info);
	//label ���-�� ������
	JLabel laba_kolvo = new JLabel("������� ���-�� ������: "); // ����������� ������ ��� �����������
	laba_kolvo
	.setBounds(2,32,150,30);
	main_panel.add(laba_kolvo);
	//���� ����� ���������� ������

	lab1.setBounds(152,32,250,30);
	main_panel.add(lab1);
	
	
	//���� ������� �����
	JLabel laba_S = new JLabel("������� ������� ���������: "); // ����������� ������ ��� �����������
	laba_S.setBounds(2,62,250,30);
	main_panel.add(laba_S);
	//���� ����������

	lab2.setBounds(2,92,250,30);
	main_panel.add(lab2);

	JLabel laba_eda = new JLabel("������� "); // ����������� ������ ��� �����������
	laba_eda.setBounds(600,62,250,30);
	main_panel.add(laba_eda);
	
	// ������ �������� �����
	JButton button_exit = new JButton("���������� �����"); // ��������� ������
	button_exit.setBounds(500,200,150,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������");
	button_info.setBounds(300,200,150,40);
	ActionListener info_listener = new info_button();
	button_info.addActionListener(info_listener);
	main_panel.add(button_info);
	
	//Image logo = new Image(); //�������� ��������
	//logo.setSize(180, 100);
	//logo.setLocation(200, 0);
	//main_panel.add(logo);
	
	JMenu menu = new JMenu("�������");
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1= new JMenuItem("���������� ������� �����");
	JMenuItem menu2= new JMenuItem("�����");
	
	menu2.addActionListener(actionListener);
	ActionListener logo_image = new ListenerLogo();
	menu1.addActionListener(logo_image);
	
	
	menu.add(menu1);
	menu.add(menu2);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	
	
	//����� ������
	JLabel laba_rai = new JLabel("�������� �����"); // ����������� ������ ��� �����������
	laba_rai.setBounds(350,62,250,30);
	main_panel.add(laba_rai);
	
	String[] transfer = {"","���������", "���������", "�����������"};
	combo_student = new JComboBox(transfer);
	combo_student.setBounds(350,92,150,30);
	ActionListener logo_transfer = new transfer_logo();
	combo_student.addActionListener(logo_transfer);
	main_panel.add(combo_student);
	
	//����� �������
		String[] transfer1 = {"","��","���"};
		combo_zak = new JComboBox(transfer1);
		combo_zak.setBounds(600,92,50,30);
		ActionListener logo_transfer2 = new transfer_logo2();
		combo_zak.addActionListener(logo_transfer2);
		main_panel.add(combo_zak);
	
	//����� �������
		JLabel laba_water = new JLabel("�������"); // ����������� ������ ��� �����������
		laba_water.setBounds(700,62,100,30);
		main_panel.add(laba_water);
		String[] transfer2 = {"","��", "���"};
		combo_nap = new JComboBox(transfer2);
		combo_nap.setBounds(700,92,50,30);
		ActionListener logo_transfer3 = new transfer_logo3();
		combo_nap.addActionListener(logo_transfer3);
		main_panel.add(combo_nap);
		
		
		//���-�� ����������
		JLabel laba_kolof = new JLabel("������� ���-�� ����������: "); // ����������� ������ ��� �����������
		laba_kolof.setBounds(800,62,250,30);
		main_panel.add(laba_kolof);
		//���� ����� ���������� ������

		lab3.setBounds(800,92,250,30);
		main_panel.add(lab3);
		
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
		
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
    new subversion();

	}
	 public JTextField[] getArray() {
		 return ArrData;
	 }
}
