

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Zapusk extends JFrame {
	

	public JLabel log= new JLabel("�����") ;
	public JLabel password = new JLabel("������") ;


	public JLabel tname;
	static public JTextField login;
	static public JPasswordField pass;
	public JButton enter;
	public JPanel panel;

	static int col;
	private Scanner sc;
	
	public static void main(String[] args) throws FileNotFoundException {
		new Zapusk();
	}
	
	public Zapusk() throws FileNotFoundException {
		setTitle("���� � ����������"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ��������� �������
		setBounds(100, 150, 350, 200);// ��������� ����������; ������ ������
		Container panel = this.getContentPane();
		panel.setLayout(new GridLayout(4, 2, 21, 10));//���� ������� ������� ���� ���
		

		

		tname = new JLabel("Gallyamov");
		login = new JTextField("������� �����");
	
		
		sc = new Scanner(new File("src/pass.txt"));
		String slogin, spass;
		slogin = sc.nextLine();
		spass = sc.nextLine();
		
		String hintlogin = "������� �����";
		login.addFocusListener(new FocusAdapter() {
	        @Override
	        public void focusGained(FocusEvent e) {
	            if (login.getText().equals(hintlogin)) {
	            	login.setText("");
	            }
	        }
	        @Override
	        public void focusLost(FocusEvent e) {
	            if (login.getText().isEmpty()) {
	            	login.setText(hintlogin);
	            }
	        }
	    });
		
		String hintpass = "������� ������";
		pass = new JPasswordField(hintpass);
		pass.setEchoChar((char)0);
		
		pass.addFocusListener(new FocusAdapter() {
	        @Override
	        public void focusGained(FocusEvent e) {
	            if (pass.getText().equals(hintpass)) {
	            	pass.setText("");
	            	pass.setEchoChar('�');
	            }
	        }
	        @Override
	        public void focusLost(FocusEvent e) {
	            if (pass.getText().isEmpty()) {
	            	pass.setText(hintpass);
	            	pass.setEchoChar((char)0);
	            }
	        }
	    });
		
		enter = new JButton("�����");

		log.setHorizontalAlignment(JLabel.CENTER);
		panel.add(log);
		panel.add(login);
		
		password.setHorizontalAlignment(JLabel.CENTER);
		panel.add(password);
		panel.add(pass);
		panel.add(enter);

		ProgressBarRotating progressBarRotating=new ProgressBarRotating();
		enter.addActionListener(new ActionListener() {                                                         
			public void actionPerformed(ActionEvent e) {  
				if (login.getText().equals(slogin) && pass.getText().equals(spass)) {		
						dispose();//��������� ����
						Window click = new Window();
						click.setVisible(true);
				} else {
					login.setBackground(Color.PINK);
					pass.setBackground(Color.PINK);
					pass.setText("������� ������");
					pass.setEchoChar((char)0);	
					if (!progressBarRotating.isAlive())
				    progressBarRotating.start();
					else {
						if (col > 5) {
							col = 0;
						}
					}
				}
			} 	    	                             
		}); 
		
		setVisible(true);
		enter.transferFocus(); 
		enter.grabFocus();	
	}
}

class ProgressBarRotating extends Thread {
	boolean showProgress = true;
	public void run() {
	Boolean isVisible = true;
		while (showProgress) {
			isVisible=!isVisible;
			if (Zapusk.col <=5) { Zapusk.col++;
				if(isVisible) {
					Zapusk.login.setBackground(Color.PINK);
					Zapusk.pass.setBackground(Color.PINK);
				}
				else
				{
					Zapusk.login.setBackground(new Color(240, 240, 240));
					Zapusk.pass.setBackground(new Color(240, 240, 240));
				}
			} else {
				Zapusk.login.setBackground(new Color(240, 240, 240));
				Zapusk.pass.setBackground(new Color(240, 240, 240));
			}
            try { Thread.sleep(70); }
            catch (Exception e) {};
		}
	}
}











/*


�� - ������� ����� 
�� - ��������������� ����������� 
��� - ����������� �����-�����
��� - ����������� �������� � ����� 
�� - ����������� ���������� ��������� 
�� - ����������� �������� 
�� - ����������� ������� ������������� ���������� 
�� - ����������� ���������  ����� (����������� ��� ������ ���������� ������� ���������)


*/