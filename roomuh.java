package Four;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



class roomuh {
	public roomuh() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Random rn = new Random();
	int event = rn.nextInt(4);
	int uh=0;
	while(true) {
	if(event==1) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		System.out.println("             유튜브를 보고싶은 유혹이 찾아왔습니다.");
		System.out.println("                   보시겠습니까?");
		System.out.println("             1.예              2.아니오");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		try {
    		uh=scanner.nextInt();
			
    		}catch(InputMismatchException e) {
    			scanner = new Scanner(System.in);
    		}
    		if(uh==1) {
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			System.out.println();
    			System.out.println("              캐릭터가 유튜브를 보았습니다.");
    			System.out.println();
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			Time.count++;
    			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
  				  Student.hp=80;
  			  }
  			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
  				  Student.hp=120;
  			  }
  			
  			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
  				  Student.hp=100;
  			  }
    			new room();
    		
    			
    		}else if(uh==2){
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			System.out.println();
    			System.out.println("                 유혹을 이겨내려면");
    			System.out.println("             유혹과의 대결에서 이겨야합니다.");
    			System.out.println();
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			new	rock();
    	
    		}
    		else {
    			System.out.println("-----------------------------------------------------");
    			System.out.println();
    			System.out.println("                지원하지 않는 기능입니다.");
    			System.out.println("                  다시 입력해주세요.");
    			System.out.println();
    			System.out.println("-----------------------------------------------------");
    			
    		}
	}else if(event==2) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		System.out.println("              페이스북을 보고싶은 유혹이 찾아왔습니다.");
		System.out.println("                    보시겠습니까?");
		System.out.println("               1.예              2.아니오");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		try {
    		uh=scanner.nextInt();
			
    		}catch(InputMismatchException e) {
    			scanner = new Scanner(System.in);
    		}
    		if(uh==1) {
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			System.out.println();
    			System.out.println("              캐릭터가 페이스북을 보았습니다.");
    			System.out.println();
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			Time.count++;
    			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
  				  Student.hp=80;
  			  }
  			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
  				  Student.hp=120;
  			  }
  			
  			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
  				  Student.hp=100;
  			  }
    			new room();
    		
    			
    		}else if(uh==2){
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			System.out.println();
    			System.out.println("                  유혹을 이겨내려면");
    			System.out.println("            유혹과의 대결에서 이겨야합니다.");
    			System.out.println();
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			new	rock();
    	
    		}
    		else {
    			System.out.println("-----------------------------------------------------");
    			System.out.println();
    			System.out.println("                지원하지 않는 기능입니다.");
    			System.out.println("                  다시 입력해주세요.");
    			System.out.println();
    			System.out.println("-----------------------------------------------------");
    			
    		}
	}else if(event==3) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		System.out.println("              침대에 눕고싶은 유혹이 찾아왔습니다.");
		System.out.println("                    누우시겠습니까?");
		System.out.println("               1.예              2.아니오");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		try {
    		uh=scanner.nextInt();
			
    		}catch(InputMismatchException e) {
    			scanner = new Scanner(System.in);
    		}
    		if(uh==1) {
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			System.out.println();
    			System.out.println("               침대에 누워서 쉬어버렸습니다.");
    			System.out.println();
    			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    			Time.count++;
    			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
  				  Student.hp=80;
  			  }
  			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
  				  Student.hp=120;
  			  }
  			
  			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
  				  Student.hp=100;
  			  }
    			new room();
    		
    			
    		}else if(uh==2){
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			System.out.println();
    			System.out.println("                  유혹을 이겨내려면");
    			System.out.println("            유혹과의 대결에서 이겨야합니다.");
    			System.out.println();
    			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    			new	rock();
    	
    		}
    		else {
    			System.out.println("-----------------------------------------------------");
    			System.out.println();
    			System.out.println("                지원하지 않는 기능입니다.");
    			System.out.println("                  다시 입력해주세요.");
    			System.out.println();
    			System.out.println("-----------------------------------------------------");
    			
    		}
	}else {
		break;
	}

	
	
	
	}
}
}

