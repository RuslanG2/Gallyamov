

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class Zapusk extends JFrame {
	
	public static String whatalog;
	public JLabel log= new JLabel("�����") ;
	public JLabel password = new JLabel("������") ;


	public JLabel tname;
	static public JTextField login;
	static public JPasswordField pass;
	public JButton enter;
	public JPanel panel;

	static int col;
	
	
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
				
				
				
				
					
					int count1 = 0;
					String password = new String(pass.getPassword());
					try {
	//���������� ����� �� �������� ����������� ������
						File file = new File("src/main/resources/pass.txt");
	// ������� ������ FileReader ��� ������� File
						FileReader fr = new FileReader(file);
	// ������� BufferedReader � ������������� FileReader ��� ����������� ����������
						BufferedReader reader = new BufferedReader(fr);
	// ������� ������� ������ ������
						String line = reader.readLine();
						int id = 0;
						String l = "";
						for (int i = 0; i < 6; i++) {
							if (line.startsWith("L:")) {
								String[] logi = line.split(":");
								l = logi[1];
							} 
								
							// ����� ���������� ������ ����� ������������
							if (l.equalsIgnoreCase(login.getText())) {
								id = i;
								break;
							}
							else {
								line = reader.readLine();
							}
						}
						reader.close();

	//���������� ����� �� �������� ����������� ������
						File file1 = new File("src/main/resources/pass.txt");
	// ������� ������ FileReader ��� ������� File
						FileReader fr1 = new FileReader(file1);
	// ������� BufferedReader � ������������� FileReader ��� ����������� ����������
						BufferedReader reader1 = new BufferedReader(fr1);
	// ������� ������� ������ ������
						String line1 = reader1.readLine();

						String p = "";
						int svyaz = 0;
						for (int j = 0; j < 6; j++) {
							if (line1.startsWith("P:")) {
								String[] parol = line1.split(":");
								p = parol[1];
								svyaz = j;
							}
							if ((p.equalsIgnoreCase(password)) && (svyaz == (id + 1))) {
								count1 = 1;
							} else {
	// ��������� ��������� ������ � �����
								line1 = reader1.readLine();
							}
							// ����� ���������� ������ ����� ������������

						}
						reader1.close();
						whatalog=login.getText();
						if (count1 == 1) {
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
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
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