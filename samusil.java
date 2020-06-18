package Four;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class samusil {
	public static boolean samusilevent16;
	public static boolean samusilevent17;
	public static boolean samusilevent18;
	public static boolean junhothread=false;
	public static boolean junhoeventthread=false;
	public samusil(){
		ding ding = new ding();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number=0;
		Runnable junho = new junho();
		Thread junhoth = new Thread(junho);
		Runnable junhoevent = new junhoevent();
		Thread junhobp = new Thread(junhoevent);
       
	 while(true) {
		
samusilstart: while(true) {
	 Runnable hungrydamage = new hungrydamage();
		
		Thread thread = new Thread(hungrydamage);
		
	if(hungry.hungrythread==true) {
		thread.start();
	}
	
			if(Time.count==11 || Time.count==12 || Time.count==13) {
				if(Student.junho==false) {
					Random rn = new Random();
	        	int event = rn.nextInt(3);
	        	if(event==0) {
	        		junhoth.start();
		        	Student.junho=true;
		      
	        	}
	        
	        	
				}
			}
			if(junhothread==true&&junhoeventthread==false) {
				junhobp.start();
			}


			System.out.println();
			System.out.println("               현재시간은 " + Time.count +"시 입니다."); 
			System.out.println("             현재 " + Student.name + "의 체력은 "+ Student.hp +"/"+Student.maxhp+ " 입니다.");
			new hungry();
			System.out.println();
			System.out.println("-----------------------------------------------------");
			if(Time.count==16 || Time.count==17 || Time.count==18) {
				if(samusilevent16==true&&Time.count==16) {
					samusilevent16=false;	
					if(junhoeventthread==true) {
						junhobp.interrupt();}
					if(junhothread==true) {
						junhoth.interrupt();}
					new samusiluh();
			         
			      }else if(samusilevent17==true&&Time.count==17) {
			    	  samusilevent17=false;
						if(junhoeventthread==true) {
							junhobp.interrupt();}
						if(junhothread==true) {
							junhoth.interrupt();}
			    	  new samusiluh();
				        
				      }else if(samusilevent18==true&&Time.count==18) {
				    	  samusilevent18=false;
							if(junhoeventthread==true) {
								junhobp.interrupt();}
							if(junhothread==true) {
								junhoth.interrupt();}
				    	   new samusiluh();
					      
				      }
			}
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 과제하기");
			System.out.println("2. 발표연습하기");
			System.out.println("3. 잠시 휴식");
			System.out.println("4. 멘토에게 질문가기");
			System.out.println("5. 먹는다");
			System.out.println("6. 집으로 퇴근하기");
			System.out.println("-----------------------------------------------------");
		
		try {
			number=scanner.nextInt();
			
		}catch(InputMismatchException e) {
			scanner = new Scanner(System.in);
		}
	  	
		
		if(number==1) {
	
			ding.book();
			new homework();

			
			
		}else if(number==2) {
			if(Student.homework<=70) {
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("        과제를 충분히 진행하지 않아 연습을 할 수 없습니다.");
				System.out.println();
				System.out.println("-----------------------------------------------------");
				continue samusilstart;
			}

			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                  발표 연습을 진행합니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Student.speak+=20;
			Time.count++;
			Student.hp-=10;
			Student.hungry-=3;
			if(Student.speak>=100) {
				Student.speak=100;
			}



			
		}else if(number==3) {
			new relax();

			
		}else if(number==4) {
			ding.k();
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                  멘토와 하브루타를 합니다.");
			System.out.println("                현재 과제의 진행도는 " +Student.homework +" 입니다.");
			System.out.println("                현재 발표준비도는 " +Student.speak +" 입니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Time.count++;
			
		}else if(number==5) {
			ding.k();
			if(junhoeventthread==true) {
			junhobp.interrupt();}
			new samueat();
			
		}else if(number==6) {
			ding.k();
			junhothread=false;
			junhoeventthread=false;
			junhoth.interrupt();
			junhobp.interrupt();
			System.out.println("*****************************************************");
			System.out.println();
			System.out.println("                   집으로 퇴근합니다.");
			System.out.println();
			System.out.println("*****************************************************");
			Student.hungry-=3;
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                       집입니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Time.count+=2;
			Student.concentration-=2;
			samusil.samusilevent16=true;
			samusil.samusilevent17=true;
			samusil.samusilevent18=true;
			if(Student.junho==true) {
			
				Student.junho=false;
			}
			new die();
			new room();
			break;
			
			
		}
		
		else {
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                지원하지 않는 기능입니다.");
			System.out.println("                  다시 입력해주세요.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			continue samusilstart;
		}
		if(Time.count==19) {
			ding.k();
			junhothread=false;
			junhoeventthread=false;
			junhoth.interrupt();
			junhobp.interrupt();
			System.out.println("*****************************************************");
			System.out.println();
			System.out.println("                   집으로 퇴근합니다.");
			System.out.println();
			System.out.println("*****************************************************");
			Student.hungry-=3;
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                       집입니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Time.count+=2;
			Student.concentration-=2;
			samusil.samusilevent16=true;
			samusil.samusilevent17=true;
			samusil.samusilevent18=true;
			if(Student.junho==true) {
			
				Student.junho=false;
			}
			new die();
			new room();
			break;
			
		}

	
			
		}
	 }
	}
}	



