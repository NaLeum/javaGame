package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

class samueat {

	
	
	public samueat(){
		ding ding = new ding();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number=0;
	eat:	while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("무엇을 드시겠습니까?");
			System.out.println("1. 인간사료 누네띠네!");
			System.out.println("2. 나가서 먹기");
			System.out.println("3. 안먹는다");
			System.out.println("-----------------------------------------------------");
		
		try {
			number=scanner.nextInt();
			
		}catch(InputMismatchException e) {
			scanner = new Scanner(System.in);
		}
			if(number==1) {
				ding.k();
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("                 누네띄네를 먹었습니다. ");
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------");
				Student.hungry+=3;
			

			
			
			}else if(number==2){ding.k();	
			
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("무엇을 드시겠습니까?");
				System.out.println("1. 할매 순대국");
				System.out.println("2. 백채 김치찌개");
				System.out.println("3. 싸다 김밥");
				System.out.println("4. 죠스 떡볶이");
				System.out.println();
				System.out.println("-----------------------------------------------------");
				try {
					number=scanner.nextInt();
					
				}catch(InputMismatchException e) {
					scanner = new Scanner(System.in);
				}
				if(number==1) {	
					if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                순대국을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					 if(Time.count==19) {ding.k();
						 samusil.junhothread=false;
						 samusil.junhoeventthread=false;
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
							Student.concentration-=1;
							Student.junho=false;
						}
						new die();
						new room();
						break;
						
					}
					new samusil();
					
				}else if(number==2) {	ding.k();if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("               김치찌개를 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==19) {ding.k();
						samusil.junhothread=false;
						 samusil.junhoeventthread=false;
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
							Student.concentration-=1;
							Student.junho=false;
						}
						new die();
						new room();
						break;
						
					}
					new samusil();
					
				}else if(number==3) {	if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}ding.k();
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                 김밥을 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==19) {
						samusil.junhothread=false;
						 samusil.junhoeventthread=false;ding.k();
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
							Student.concentration-=1;
							Student.junho=false;
						}
						new die();
						new room();
						break;
						
					}
					
					new samusil();
					
				}else if(number==4) {	
					if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}
					System.out.println("-----------------------------------------------------");
					System.out.println();
					System.out.println();
					System.out.println("                떡볶이를 먹었습니다.");
					System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------");
					Student.hungry=21;ding.k();
					Student.hp+=5;
					if(Student.hp>=Student.maxhp) {
						Student.hp=Student.maxhp;
					}
					Time.count+=1;
					if(Time.count==19) {ding.k();
						samusil.junhothread=false;
						 samusil.junhoeventthread=false;
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
							Student.concentration-=1;
							Student.junho=false;
						}
						new die();
						new room();
						break;
						
					}
					new samusil();
					
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
				if(samusil.junhothread==true&&samusil.junhoeventthread==true) {
					samusil.junhothread=true;
					samusil.junhoeventthread=false;
				}ding.k();
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
				
				new samusil();
			}else {
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("              지원하지 않는 기능입니다.");
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------");
				continue eat;
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
