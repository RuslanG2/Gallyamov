

public class Raschet {
	
	public String[] items0 = {
			"�������",
			"��������",
			"�������� ��� ��. ���",
		    "���������",
		    "�����",
		    "���������",	 
		    "�������� � ������ ������������ ���� �� 16",
		    "�����������",
		    "�������"      
		};
	
	public String[] items = {
			"�������",
		    "16-21 ���",
		    "22-24 ���",  
		    "25-29 ���",
		    "30-34 ���",  
		    "35-39 ���",
		    "40-49 ���",  
		    "50-59 ���"
		};
	
	public String[] items2 = {
			"�������",
		    "0 ���",
		    "1 ���",  
		    "2 ���",
		    "3-4 ���",  
		    "5-6 ���",
		    "7-9 ���",  
		    "10-14 ���",
		    "����� 14 ���"
		};
	public String[] items3 = {
			"�������",
		    "�� 50 ",
		    "50-70",
		    "70 - 100",
		    "100 - 120",
		    "120 - 150",
		    "����� 150"       
		};
	public String[] items4 = {
			"�������",
		    "�����������",
		    "��������������"
		        
		};
	
	public String[] items5 = {
			"�������",
			"9 �������",
			"8 �������",
			"7 �������",
			"6 �������",
			"5 �������",
			"4 ������",
		    "3 ������",
		    "2 ������",
		    "�� 16 ���� �� 30 ����",
		    "�� 5 �� 15 ����",
		    "1 ���"
		   
		        
		};
	
	public String[] items6 = {
			"�������",
			"����� �",
		    "����� 0",
		    "����� 1",
		    "����� 2",
		    "����� 3",
		    "����� 4",
		    "����� 5",
		    "����� 6",
		    "����� 7",
		    "����� 8",
		    "����� 9",
		    "����� 10",
		    "����� 11",
		    "����� 12", 
		    "����� 13"
		};
	
	public double answerAge1621(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.93;
	            break;
	        case "1 ���":
	            koef = 1.90;
	            break;
	        case "2 ���":
	            koef = 1.87;
	            break;
	        case "3-4 ���":
	            koef = 1.66;
	            break;
	        case  "5-6 ���":
	            koef = 1.64;
	            break;
	        case "7-9 ���":
	            koef = 1.64;
	            break;
	        case "10-14 ���":
	            koef = 1.64;
	            break;
	        case "����� 14 ���":
	            koef = 1.64;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	public double answerAge2224(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.79;
	            break;
	        case "1 ���":
	            koef = 1.77;
	            break;
	        case "2 ���":
	            koef = 1.76;
	            break;
	        case "3-4 ���":
	            koef = 1.08;
	            break;
	        case  "5-6 ���":
	            koef = 1.06;
	            break;
	        case "7-9 ���":
	            koef = 1.06;
	            break;
	        case "10-14 ���":
	            koef = 1.06;
	            break;
	        case "����� 14 ���":
	            koef = 1.06;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	public double answerAge2529(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.77;
	            break;
	        case "1 ���":
	            koef = 1.68;
	            break;
	        case "2 ���":
	            koef = 1.61;
	            break;
	        case "3-4 ���":
	            koef = 1.06;
	            break;
	        case  "5-6 ���":
	            koef = 1.05;
	            break;
	        case "7-9 ���":
	            koef = 1.05;
	            break;
	        case "10-14 ���":
	            koef = 1.01;
	            break;
	        case "����� 14 ���":
	            koef = 1.01;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	public double answerAge3034(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.62;
	            break;
	        case "1 ���":
	            koef = 1.61;
	            break;
	        case "2 ���":
	            koef = 1.59;
	            break;
	        case "3-4 ���":
	            koef = 1.04;
	            break;
	        case  "5-6 ���":
	            koef = 1.04;
	            break;
	        case "7-9 ���":
	            koef = 1.01;
	            break;
	        case "10-14 ���":
	            koef = 0.96;
	            break;
	        case "����� 14 ���":
	            koef = 0.95;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	public double answerAge3539(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.61;
	            break;
	        case "1 ���":
	            koef = 1.59;
	            break;
	        case "2 ���":
	            koef = 1.58;
	            break;
	        case "3-4 ���":
	            koef = 0.99;
	            break;
	        case  "5-6 ���":
	            koef = 0.96;
	            break;
	        case "7-9 ���":
	            koef = 0.95;
	            break;
	        case "10-14 ���":
	            koef = 0.95;
	            break;
	        case "����� 14 ���":
	            koef = 0.94;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	public double answerAge4049(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.59;
	            break;
	        case "1 ���":
	            koef = 1.58;
	            break;
	        case "2 ���":
	            koef = 1.57;
	            break;
	        case "3-4 ���":
	            koef = 0.95;
	            break;
	        case  "5-6 ���":
	            koef = 0.95;
	            break;
	        case "7-9 ���":
	            koef = 0.94;
	            break;
	        case "10-14 ���":
	            koef = 0.94;
	            break;
	        case "����� 14 ���":
	            koef = 0.94;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }
	
	public double answerAge5059(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        case "0 ���":
	            koef = 1.58;
	            break;
	        case "1 ���":
	            koef = 1.57;
	            break;
	        case "2 ���":
	            koef = 1.56;
	            break;
	        case "3-4 ���":
	            koef = 0.94;
	            break;
	        case  "5-6 ���":
	            koef = 0.94;
	            break;
	        case "7-9 ���":
	            koef = 0.94;
	            break;
	        case "10-14 ���":
	            koef = 0.94;
	            break;
	        case "����� 14 ���":
	            koef = 0.93;
	            break;
	    
	           
	        default:
	            koef=0;
	        }
			return koef;
	    }

	
	
	public double answer(String otvet) {
		 double koef=0;
	        switch (otvet) {
	        //��� ����������
	        case "��������":
	            koef = 2471;
	            break;
	        case "�������� ��� ��. ���":
	            koef = 1646;
	            break;
	        case "���������":
	        	 koef = 625;
	            break;
	        case "�����":
	            koef = 2877;
	            break;
	        case "���������":
	        	 koef = 4227;
	            break;
	        case "�������� � ������ ������������ ���� �� 16":
	            koef = 2134;
	            break;
	        case "�����������":
	        	 koef = 2134;
	            break;
	        case "�������":
	        	 koef = 1331;
	            break;
	            
	   
	          //�������� 
	        case "�� 50 ":
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
	        case "����� 150":
	        	 koef = 1.6;
	            break;

	            
	            //���������
	        case "�����������":
	        	 koef = 1;
	            break;
	        case  "��������������":
	        	 koef = 1.94;
	            break;
	        
	            
	            //���� ������������� 
	        case "9 �������":
	        	 koef = 0.95;
	            break;
	        case "8 �������":
	        	 koef = 0.9;
	            break;
	        case "7 �������":
	        	 koef = 0.8;
	            break;
	        case "6 �������":
	        	 koef = 0.7;
	            break;
	        case "5 �������":
	        	 koef = 0.65;
	            break;
	        case "4 ������":
	        	 koef = 0.6;
	            break;
	        case "3 ������":
	        	 koef = 0.5;
	            break;
	        case "2 ������":
	        	 koef = 0.4;
	            break;
	        case  "1 ���":
	        	 koef = 1;
	            break;
	        case  "�� 16 ���� �� 30 ����":
	        	 koef = 0.3;
	            break;
	        case  "�� 5 �� 15 ����":
	        	 koef = 0.2;
	            break;
	            
	            
	            //���	    
	        case "����� �":
	        	 koef = 2.45;
	            break;
	        case "����� 0":
	        	 koef = 2.3;
	            break;
	        case "����� 1":
	        	 koef = 1.55;
	            break;
	        case "����� 2":
	        	 koef = 1.4;
	            break;
	        case "����� 3":
	        	 koef = 1;
	            break;
	        case "����� 4":
	        	 koef = 0.95;
	            break;
	        case "����� 5":
	        	 koef = 0.9;
	            break;
	        case "����� 6":
	        	 koef = 0.85;
	            break;
	        case  "����� 7":
	        	 koef = 0.8;
	            break;
	        case   "����� 8":
	        	 koef = 0.75;
	            break;
	        case  "����� 9":
	        	 koef = 0.7;
	            break;
	        case "����� 10":
	        	 koef = 0.65;
	            break;
	        case "����� 11":
	        	 koef = 0.6;
	            break;
	        case  "����� 12":
	        	 koef = 0.55;
	            break;
	        case   "����� 13":
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
