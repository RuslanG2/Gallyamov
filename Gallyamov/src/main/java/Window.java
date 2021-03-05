
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Window extends JFrame {

	 
	
	//поля
	private double tb; //базовый тариф 
	private double kbc;// коэффициент возраста и стажа 
	private double km;// коэффициент мощности 
	private double ko;// коэффициент допущенных водителей 
	private double kt;//  территориальный коэффициент 
	private double kp;// коэффициент периода использования транспорта 
	private double kbm;//  коэффициент бонус-малус

	Raschet r = new Raschet();
	
	
	
	
	JComboBox<String> comboBox0 = new JComboBox<String>(r.items0);
	JComboBox<String> comboBox = new JComboBox<String>(r.items);
	JComboBox<String> comboBox2 = new JComboBox<String>(r.items2);
	JComboBox<String> comboBox3 = new JComboBox<String>(r.items3);
	JComboBox<String> comboBox4 = new JComboBox<String>(r.items4);
	JComboBox<String> comboBox5 = new JComboBox<String>(r.items5);
	JComboBox<String> comboBox6 = new JComboBox<String>(r.items6);
	
	//Кнопки
	private JButton button = new JButton ("Расчитать");
	private JLabel label0 = new JLabel ("Категория");
	private JLabel label = new JLabel ("Возраст");
	private JLabel label1 = new JLabel ("Водительский стаж");
	private JLabel label2 = new JLabel ("Мощность двигателя в л.с.");
	private JLabel label3 = new JLabel ("Страховка ");
	private JLabel label4 = new JLabel ("Срок оформления ");
	private JLabel label5 = new JLabel ("Стаж безаварийности ");
	
	private JLabel cost = new JLabel (" ");
	private JLabel cost_t = new JLabel ("Стоимость ОСАГО: ");
	
	//конструктор
	public Window () {
		super("Калькулятор ОСАГО");
		this.setBounds(100, 150, 350, 400); // координты появнления; ширина высота
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// крестик==завершить 
		
		//вставляем
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(10, 2, 2, 10));//ряды колонки отступы верт гор
		
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
                String item0 = (String) comboBox0.getSelectedItem();// получаем выбор
                String item = (String) comboBox.getSelectedItem();// получаем выбор
                String item2 = (String) comboBox2.getSelectedItem();// получаем выбор
                String item3 = (String) comboBox3.getSelectedItem();// получаем выбор
                String item4 = (String) comboBox4.getSelectedItem();// получаем выбор
                String item5 = (String) comboBox5.getSelectedItem();// получаем выбор
                String item6 = (String) comboBox6.getSelectedItem();// получаем выбор
                
              kbc=0;
              
              
            
            
  	
  		    
  		   
  		   
              
         if(item=="16-21 лет") {
        		 kbc =r.answerAge1621(item2);
         } 
              if(item=="22-24 лет") {
         		 kbc =r.answerAge2224(item2);
          } 
              if(item=="25-29 лет") {
         		 kbc =r.answerAge2529(item2);
          } 
              if(item=="30-34 лет") {
         		 kbc =r.answerAge3034(item2);
          } 
              if(item== "35-39 лет") {
         		 kbc =r.answerAge3539(item2);
          } 
              if(item== "40-49 лет") {
         		 kbc =r.answerAge4049(item2);
          } 
              if(item== "50-59 лет") {
          		 kbc =r.answerAge5059(item2);
           } 
         
     
                
                tb=r.answer(item0);
                km=r.answer(item3);
                ko=r.answer(item4);
                kt=1.72;
                kp=r.answer(item5);
                kbm=r.answer(item6);
                

             
				
				double result =r.formula(tb, kbc, km, ko, kt, kp,  kbm);
				String s_result = String.format("%.2f   рублей", result );
				cost.setText(s_result);
				
				if(result==0) 
			JOptionPane.showMessageDialog(null, "Проверьте введенные данные", "Ошибка при вводе данных", JOptionPane.PLAIN_MESSAGE);
				
			
			
			
			}});
		
		
	
		
	}

	
  
	
	
}
