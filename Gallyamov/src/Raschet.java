
public class Raschet {
	
	public String[] items0 = {
			"Выбрать",
			"Легковые",
			"Легковые для юр. лиц",
		    "Мотоциклы",
		    "Такси",
		    "Грузовики",	 
		    "Автобусы с числом пассажирских мест до 16",
		    "Троллейбусы",
		    "Трамваи"      
		};
	
	public String[] items = {
			"Выбрать",
		    "Меньше 22 лет",
		    "Больше 22 лет"   
		};
	
	public String[] items2 = {
			"Выбрать",
		    "Менее 3 лет",
		    "Более 3 лет"   
		};
	public String[] items3 = {
			"Выбрать",
		    "До 50 ",
		    "50-70",
		    "70 - 100",
		    "100 - 120",
		    "120 - 150",
		    "Свыше 150"       
		};
	public String[] items4 = {
			"Выбрать",
		    "Ограниченая",
		    "Неограниченная"
		        
		};
	
	public String[] items5 = {
			"Выбрать",
			"9 месяцев",
			"8 месяцев",
			"7 месяцев",
			"6 месяцев",
			"5 месяцев",
			"4 месяца",
		    "3 месяца",
		    "2 месяца",
		    "от 16 дней до 30 дней",
		    "от 5 до 15 дней",
		    "1 год"
		   
		        
		};
	
	public String[] items6 = {
			"Выбрать",
			"класс М",
		    "класс 0",
		    "класс 1",
		    "класс 2",
		    "класс 3",
		    "класс 4",
		    "класс 5",
		    "класс 6",
		    "класс 7",
		    "класс 8",
		    "класс 9",
		    "класс 10",
		    "класс 11",
		    "класс 12", 
		    "класс 13"
		};
	
	
	
	public double answer(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        //вид транспорта
	        case "Легковые":
	            koef = 2471;
	            break;
	        case "Легковые для юр. лиц":
	            koef = 1646;
	            break;
	        case "Мотоциклы":
	        	 koef = 625;
	            break;
	        case "Такси":
	            koef = 2877;
	            break;
	        case "Грузовики":
	        	 koef = 4227;
	            break;
	        case "Автобусы с числом пассажирских мест до 16":
	            koef = 2667;
	            break;
	        case "Троллейбусы":
	        	 koef = 2134;
	            break;
	        case "Трамваи":
	        	 koef = 1331;
	            break;
	            
	   
	          //мощность 
	        case "До 50 ":
	        	 koef = 0.6;
	            break;
	        case  "50-70":
	        	 koef = 1.0;
	            break;
	        case  "70 - 100":
	        	 koef = 1.1;
	            break;
	        case "100 - 120":
	        	 koef = 1.2;
	            break;
	        case "120 - 150":
	        	 koef = 1.4;
	            break;
	        case "Свыше 150":
	        	 koef = 1.6;
	            break;

	            
	            //страховка
	        case "Ограниченая":
	        	 koef = 1;
	            break;
	        case  "Неограниченная":
	        	 koef = 1.87;
	            break;
	        
	            
	            //срок использования 
	        case "9 месяцев":
	        	 koef = 0.95;
	            break;
	        case "8 месяцев":
	        	 koef = 0.9;
	            break;
	        case "7 месяцев":
	        	 koef = 0.8;
	            break;
	        case "6 месяцев":
	        	 koef = 0.7;
	            break;
	        case "5 месяцев":
	        	 koef = 0.65;
	            break;
	        case "4 месяца":
	        	 koef = 0.6;
	            break;
	        case "3 месяца":
	        	 koef = 0.5;
	            break;
	        case "2 месяца":
	        	 koef = 0.4;
	            break;
	        case  "1 год":
	        	 koef = 1;
	            break;
	        case  "от 16 дней до 30 дней":
	        	 koef = 0.3;
	            break;
	        case  "от 5 до 15 дней":
	        	 koef = 0.2;
	            break;
	            
	            
	            //КБМ	    
	        case "класс М":
	        	 koef = 2.45;
	            break;
	        case "класс 0":
	        	 koef = 2.3;
	            break;
	        case "класс 1":
	        	 koef = 1.55;
	            break;
	        case "класс 2":
	        	 koef = 1.4;
	            break;
	        case "класс 3":
	        	 koef = 1;
	            break;
	        case "класс 4":
	        	 koef = 0.95;
	            break;
	        case "класс 5":
	        	 koef = 0.9;
	            break;
	        case "класс 6":
	        	 koef = 0.85;
	            break;
	        case  "класс 7":
	        	 koef = 0.8;
	            break;
	        case   "класс 8":
	        	 koef = 0.75;
	            break;
	        case  "класс 9":
	        	 koef = 0.7;
	            break;
	        case "класс 10":
	        	 koef = 0.65;
	            break;
	        case "класс 11":
	        	 koef = 0.6;
	            break;
	        case  "класс 12":
	        	 koef = 0.55;
	            break;
	        case   "класс 13":
	        	 koef = 0.5;
	            break;
	       
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	

	
	public double formula ( double tb,  double kbc, double km, double ko, double kt, double kp,  double kbm) {
		
		double osago = tb * kbc * km   * ko  * kt  * kp  * kbm  ;
		return osago;	
	}
	
	
	
	
}
