import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Window extends JFrame {
	//����
	private double tb; //������� ����� 
	private double kbc;// ����������� �������� � ����� 
	private double km;// ����������� �������� 
	private double ko;// ����������� ���������� ��������� 
	private double kt;//  ��������������� ����������� 
	private double kp;// ����������� ������� ������������� ���������� 
	private double kbm;//  ����������� �����-�����

	Raschet r = new Raschet();
	
	
	JComboBox comboBox0 = new JComboBox(r.items0);
	JComboBox comboBox = new JComboBox(r.items);
	JComboBox comboBox2 = new JComboBox(r.items2);
	JComboBox comboBox3 = new JComboBox(r.items3);
	JComboBox comboBox4 = new JComboBox(r.items4);
	JComboBox comboBox5 = new JComboBox(r.items5);
	JComboBox comboBox6 = new JComboBox(r.items6);
	
	//������
	private JButton button = new JButton ("���������");
	private JLabel label0 = new JLabel ("���������");
	private JLabel label = new JLabel ("�������");
	private JLabel label1 = new JLabel ("������������ ����");
	private JLabel label2 = new JLabel ("�������� ��������� � �.�.");
	private JLabel label3 = new JLabel ("��������� ");
	private JLabel label4 = new JLabel ("���� ���������� ");
	private JLabel label5 = new JLabel ("���� �������������� ");
	
	private JLabel cost = new JLabel (" ");
	private JLabel cost_t = new JLabel ("��������� �����: ");
	
	//�����������
	public Window () {
		super("����������� �����");
		this.setBounds(100, 150, 350, 400); // ��������� ����������; ������ ������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �������==��������� 
		
		//���������
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(10, 2, 2, 10));//���� ������� ������� ���� ���
		
		cont.add(label0);
		cont.add(comboBox0);
		cont.add(label);
		cont.add(comboBox);
		cont.add(label1);
		cont.add(comboBox2);
		cont.add(label2);
		cont.add(comboBox3);
		cont.add(label3);
		cont.add(comboBox4);
		cont.add(label4);
		cont.add(comboBox5);
		cont.add(label5);
		cont.add(comboBox6);
		
		cont.add(cost_t);
		cont.add(cost);//
		cont.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String item0 = (String) comboBox0.getSelectedItem();// �������� �����
                String item = (String) comboBox.getSelectedItem();// �������� �����
                String item2 = (String) comboBox2.getSelectedItem();// �������� �����
                String item3 = (String) comboBox3.getSelectedItem();// �������� �����
                String item4 = (String) comboBox4.getSelectedItem();// �������� �����
                String item5 = (String) comboBox5.getSelectedItem();// �������� �����
                String item6 = (String) comboBox6.getSelectedItem();// �������� �����
                
              kbc=0;
         if(item=="������ 22 ���") {
        	 if(item2 == "����� 3 ���") {
        		 kbc =1.8;
        	 } 
        	 if(item2 == "����� 3 ���") {
         		kbc= 1.6;}
   
         } 
        
       
         if(item=="������ 22 ���") {
        	 if(item2 == "����� 3 ���") {
        		 kbc =1.7;}
        	 if(item2 == "����� 3 ���") {
        	  kbc =1.0;}   
         } 
                
                
                tb=r.answer(item0);
                km=r.answer(item3);
                ko=r.answer(item4);
                kt=1.8;
                kp=r.answer(item5);
                kbm=r.answer(item6);
                

             
				
				double result =r.formula(tb, kbc, km, ko, kt, kp,  kbm);
				String s_result = String.format("%.2f   ������", result );
				cost.setText(s_result);
				
				if(result==0) 
			JOptionPane.showMessageDialog(null, "��������� ��������� ������", "������ ��� ����� ������", JOptionPane.PLAIN_MESSAGE);
				
			
			
			
			}});
		
		
	
		
	}

	
  
	
	
}