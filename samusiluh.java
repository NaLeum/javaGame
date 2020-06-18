package Four;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class samusiluh {
	
	public samusiluh() {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			Random rn = new Random();
        	int event = rn.nextInt(2);
        	int uh=0;
        	if(event==0) {
        		while(true) {
        		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        		System.out.println();
        		System.out.println("         캐릭터가 집에 가고싶은 유혹이 찾아왔습니다.");
        		System.out.println("          19시에 캐릭터는 자동적으로 집에 갑니다.");
        		System.out.println("                  지금 가시겠습니까?");
        		System.out.println("              1.예              2.아니오");
        		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        		try {
        		uh=scanner.nextInt();
        			
        		}catch(InputMismatchException e) {
        			scanner = new Scanner(System.in);
        		}
        		if(uh==1) {
        			Time.count+=2;
        			Student.concentration-=1;
        			samusil.junhothread=false;
        			samusil.junhoeventthread=false;
        			if(Student.junho=true) {
	    		
	    				Student.junho=false;
	    			}
        			new room();
        			break;
        			
        		}else if(uh==2){
        			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        			System.out.println();
        			System.out.println("                 유혹을 이겨내려면");
        			System.out.println("           유혹과의 대결에서 이겨야합니다.");
        			System.out.println();
        			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        			new uhblackjack();
        			break;
        		}
        		else {
        			System.out.println("-----------------------------------------------------");
        			System.out.println();
        			System.out.println("                지원하지 않는 기능입니다.");
        			System.out.println("                  다시 입력해주세요.");
        			System.out.println();
        			System.out.println("-----------------------------------------------------");
        			
        		}
        		
        		
	       
        	}
        
			}
		}
	}
	
	

