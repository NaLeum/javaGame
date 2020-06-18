package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class room {
public static boolean event14=true;
public static boolean event16=true;
public static boolean event18=true;
	public room(){
		ding ding = new ding();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number=0;
		
		room:while(true) { 
			 Runnable hungrydamage = new hungrydamage();
				
				Thread thread = new Thread(hungrydamage);
			if(hungry.hungrythread==true) {
				thread.start();
			}
			
		
		System.out.println();
		System.out.println("               현재시간은 " + Time.count +"시 입니다."); 
		System.out.println("             현재 " + Student.name + "의 체력은 "+ Student.hp +"/"+Student.maxhp+ " 입니다.");
		new hungry();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		if(Time.count==14||Time.count==16||Time.count==18) {
			if(event14==true&&Time.count==14) {
				event14=false;
		         new roomuh();
		         
		      }else if(event16==true&&Time.count==16) {
		    	  event16=false;
			         new roomuh();
			        
			      }else if(event18==true&&Time.count==18) {
			    	   event18=false;
				         new roomuh();
				      
			      }
		}
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 과제하기");
		System.out.println("2. 발표연습하기");
		System.out.println("3. 잠시 휴식");
		System.out.println("4. 먹는다");
		System.out.println("5. 학원에 가기");
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
				System.out.println("       과제를 충분히 진행하지 않아 연습을 할 수 없습니다.");
				System.out.println();
				System.out.println("-----------------------------------------------------");
				continue room;
			}
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                 발표 연습을 진행합니다.");
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
			/*if(Time.count>18) {
			System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			System.out.println();
			System.out.println("               캐릭터가 밤이되어 잠에 듭니다.");
			System.out.println();
			System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			Date.count++;
			Time.count=9;
			Student.hp+=30;
			if(Student.hp>=100) {
				  Student.hp=100;
			  };
			new index();
		   }else {
			   System.out.println("------------------------------------------------------");
				System.out.println();
				System.out.println("               최소한의 양심으로 인해");
				System.out.println("               18시 이후에 가능합니다");
				System.out.println();
				System.out.println("-----------------------------------------------------");
		   }*/
			new roomeat();
			
			}else if(number==5) {ding.k();
			  if(Time.count<=13) {
				  
				if(Student.hp>20) {        
					Time.count+=2;
			        Student.concentration+=1;
			        Student.hp-=20;
						System.out.println("-----------------------------------------------------");
						System.out.println("                  학원에 도착했습니다.");
						System.out.println("           학원의 기본 버프로 집중력이 올라갑니다.");
						System.out.println("          19시가 되면 자동적으로 집으로 들어갑니다.");
						System.out.println("-----------------------------------------------------");
						
					new samusil();
					}else {
						System.out.println("-----------------------------------------------------");
						System.out.println();
						System.out.println("         체력이 부족하여 학원에 갈 수 없습니다.");
						System.out.println();
						System.out.println("-----------------------------------------------------");
					}
			  }else {
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println("         13시 이후에는 학원에 갈 마음이 안생깁니다.");
					System.out.println();
					System.out.println("-----------------------------------------------------");
				}
		}else {
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                 지원하지 않는 기능입니다.");
			System.out.println("                   다시 입력해주세요.");
			System.out.println();
			System.out.println("-----------------------------------------------------");

			}
					
				
			
		if(Time.count==22) {
			System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			System.out.println();
			System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
			System.out.println();
			System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
			Date.count++;
			Time.count=9;
			Student.hp+=30;
			event14=true;
			event16=true;
			event18=true;
			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
				  Student.hp=80;
			  }
			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
				  Student.hp=120;
			  }
			
			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
				  Student.hp=100;
			  }
			 for (int i = 0; i < 5; i++) {
				   System.out.println("Z...");
				   System.out.println();
				   try {
					   Thread.sleep(500);
					 } catch (InterruptedException e) {
					   Thread.currentThread().interrupt();
					   throw new AssertionError(e);
					 }
				  }
			new index();
	
		}
		
	}
}
}
