package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class choice {

	public static boolean bgmthread =false;
	Scanner scanner = new Scanner(System.in);
	public choice() {
		ding ding = new ding();
		Runnable hungrydamage = new hungrydamage();
		Thread thread = new Thread(hungrydamage);
		  
		if(hungry.hungrythread==true) {
			thread.start();
		}
		Runnable bgm = new bgm();
		Thread bgmth = new Thread(bgm);

		if(bgmthread==false) {
			bgmth.start();}

 Start : while(true) {




	    System.out.println();
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 학원에 가서 공부한다.");
		System.out.println("2. 집에서 공부한다.");
		System.out.println("3. 오늘은 쉰다.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int number=0;

	try {
		number=scanner.nextInt();
		
	}catch(InputMismatchException e) {

		scanner = new Scanner(System.in);

		
	}
            thread.interrupt();
		if(number==1) {ding.k();
			if(Student.hp>20) {        
			Time.count+=2;
	        Student.concentration+=1;
	        Student.hp-=20;
				System.out.println("-----------------------------------------------------");
				System.out.println("                  학원에 도착했습니다.");
				System.out.println("           학원의 기본 버프로 집중력이 올라갑니다.");
				System.out.println("          19시가 되면 자동적으로 집으로 들어갑니다.");
				System.out.println("-----------------------------------------------------");
				Student.hungry-=3;
			
			new samusil();
			}else {
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("         체력이 부족하여 학원에 갈 수 없습니다.");
				System.out.println();
				System.out.println("-----------------------------------------------------");
			}
			
		}
		else if(number==2) {ding.k();
			new room();
			
			
		}
		else if(number==3) {ding.k();
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("               파트장님이 하루는 쉬랬어!");
			System.out.println("          " + Student.name + "(이)가 하루를 푹 쉬었습니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Date.count++;
			Student.hungry=21;
			Student.hp=100;
			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
				  Student.hp=80;
			  }
			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
				  Student.hp=120;
			  }
			
			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
				  Student.hp=100;
			  }
			new index();
			
		}else if ( number==888){
			if(bgmthread==false) {
				bgm.run();
				}else {
					Four.bgm.bgmstop();
					bgmth.interrupt();
					bgmthread=false;
				}
		}else {
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                 지원하지 않는 기능입니다.");
			System.out.println("                   다시 입력해주세요.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			continue Start;
			}
		
		
		
 		}
		
	}
}
