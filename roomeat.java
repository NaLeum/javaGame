package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

class roomeat {
	public roomeat() {
		ding ding = new ding();
		Scanner scanner = new Scanner(System.in);
		int number=0;
	eat:	while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("무엇을 드시겠습니까?");
			System.out.println("1. 하리보 젤리");
			System.out.println("2. 시켜먹기");
			System.out.println("3. 안먹는다");
			System.out.println("-----------------------------------------------------");
		
		try {
			number=scanner.nextInt();
			
		}catch(InputMismatchException e) {
			scanner = new Scanner(System.in);
		}
			if(number==1) {ding.k();
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("                 하리보를 먹었습니다. ");
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------");
				Student.hungry+=3;
				new room();
			
			}else if(number==2){	ding.k();
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("무엇을 시켜 드시겠습니까?");
				System.out.println("1. 얼큰한 짬뽕");
				System.out.println("2. 돈가스에 쫄면");
				System.out.println("3. 해장국");
				System.out.println("4. 옳다 치킨");
				System.out.println();
				System.out.println("-----------------------------------------------------");
				try {
					number=scanner.nextInt();
					
				}catch(InputMismatchException e) {
					scanner = new Scanner(System.in);
				}
				if(number==1) {ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                 짬뽕을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Student.hungry=21;
					Time.count+=1;
					if(Time.count==22) {
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						System.out.println();
						System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
						System.out.println();
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						Date.count++;
						Time.count=9;
						Student.hp+=30;
						room.event14=true;
						room.event16=true;
						room.event18=true;
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
					}
					new room();
					
				}else if(number==2) {ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("               돈가스와 쫄면을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==22) {
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						System.out.println();
						System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
						System.out.println();
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						Date.count++;
						Time.count=9;
						Student.hp+=30;
						room.event14=true;
						room.event16=true;
						room.event18=true;
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
					}
					new room();
					
				}else if(number==3) {ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                 해장국을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==22) {
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						System.out.println();
						System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
						System.out.println();
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						Date.count++;
						Time.count=9;
						Student.hp+=30;
						room.event14=true;
						room.event16=true;
						room.event18=true;
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
					}
					new room();
					
				}else if(number==4) {ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                  치킨을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==22) {
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						System.out.println();
						System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
						System.out.println();
						System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
						Date.count++;
						Time.count=9;
						Student.hp+=30;
						room.event14=true;
						room.event16=true;
						room.event18=true;
						 if(Student.hp>=100) {
							  Student.hp=100;
						   };
						new index();
					}
					new room();
					
				}else {
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("              지원하지 않는 기능입니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
				}
				
			}else if(number==3) {
				
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("                     돌아갑니다.");
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------");
				if(Student.hungry==0) {
					Student.hp+=5;
					if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
						  Student.hp=80;
					  }
					if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
						  Student.hp=120;
					  }
					
					if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
						  Student.hp=100;
					  }
				}
				new room();
			}else {
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("               지원하지 않는 기능입니다.");
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------");
				continue eat;
			}
			
			
			
			
			
			
			
		}
		
		
		
	}

}
