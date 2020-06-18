package Four;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



class trailer {
	 static int hp;
	 static String name;
	 static int money=50000;
}
class bigtrailer extends trailer {
	
	public bigtrailer() {
	hp=200;
	name = "긴 트레일러";

	}
}
class smalltrailer extends trailer {
	
	public smalltrailer() {
	hp=100;
	name = "작은 트레일러";

	}


	
}



public class newstart {


	public static int gion;
	public static boolean storethread = false;
	public static boolean musclethread = false;
	public static boolean bigmusclethread = false;
	public static boolean bksevent = false;
	public static boolean passevent = false;
	public static boolean gamestory = false;
	public static int musclestart=0;
	public static int muscleend=0;
	public static boolean bgmthread=false;
	public static void main(String[] args) {
		ding ding = new ding();

		new openingone();
	
	int number=0;
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println();
	System.out.println("주인공의 이름을 입력해주세요");
	Student.name = scanner.nextLine();
	System.out.println();
	System.out.println(Student.name+"은 어떤 유형이십니까?");
	System.out.println("1. 체력은 없지만 집중을 잘하는 유형");
	System.out.println("2. 집중은 잘 못하지만 체력은 많은 유형");
	System.out.println("3. 평범한 스타일");


	
	
Start:while(true) {
	try {
	number=scanner.nextInt();
	
	}catch(InputMismatchException e) {

	scanner = new Scanner(System.in);

	
	}if(number==1) {
	Student.maxhp-=20;
	Student.hp-=20;
	Student.concentration+=1;
    Student.style="nohp";
    break;
	
	}else if(number==2){
	Student.maxhp+=20;
	Student.hp+=20;
	Student.concentration-=1;
    Student.style="yeshp";
    break;
	}else if(number==3){
	 break;
	}else{
	System.out.println("다시 입력해주세요");
	continue Start;
	}
	}
	
	System.out.println("어디서 부터 시작하시겠습니까?");
	System.out.println("% 1탄의 엔딩은 2탄과 연결 되어 있습니다.%");
	System.out.println("1. 1탄         2. 2탄");
	int choice=0;
	try {
		choice=scanner.nextInt();
		
		}catch(InputMismatchException e) {

		scanner = new Scanner(System.in);

		
		}
	if(choice==1) {
		
		new opening();		
	}else if(choice==2) {
		   Date.count=1;
		   Time.count=9;
		   Student.hp=Student.maxhp;
		   Student.hungry=21;
		   
		   System.out.println("드디어 고된 아르바이트 끝에 컴퓨터를 마춘 " +Student.name+"...");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("첫수업을 마치고 과제가 나가는데....");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("태봉파트장 : 여기서 이번주 과제가 나갑니다!!");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("태봉파트장 : 한주동안 열심히 해서 완성해오시길 바랄게요!");
		   System.out.println();
		   try {
				  Thread.sleep(2000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		new index();
	}
	
//게임 방법 설명
	if(gamestory==false) {
		gamestory=true;
		System.out.println("_______________________________________________________________________________________");
		System.out.println();
		System.out.println("어머니는 학원에 가고싶으면 30일 안에 컴퓨터를 맞춰오라고 하셨습니다.");
		System.out.println();
		System.out.println("1번을 눌러 아르바이트를 갈 수 있습니다. 아르바이트는 7시와 13시에 갈 수 있습니다.");
		System.out.println("     아르바이트는 기본적으로 단시간에 많은 돈을 받을 수 있는 상하차 아르바이트를 합니다.");
		System.out.println();
		System.out.println("2번을 눌러 아이템을 사용할 수 있는데 아이템은 박카스와 파스가 있습니다.");
		System.out.println("    박카스는 일정량의 허기와 체력을 회복시켜주고, 파스는 근육통을 치료해줍니다.");
		System.out.println();
		System.out.println("3번 편의점에서는 박카스와 파스를 팝니다. 랜덤의 확률로 1+1행사를 합니다.");
		System.out.println();
		System.out.println("4번 식사에서는 식사가 가능한데 도시락과 배달음식이 있습니다.");
		System.out.println("   도시락은 돈이 소모되지 않지만 도시락을 미리 싸야하고 그 또한 시간이 흐릅니다.");
		System.out.println("   또한 미리 만들어놓은 도시락은 만든날부터 2일후 아침에 폐기됩니다.");
		System.out.println();
		System.out.println("5번 컴퓨터 가게에서는 컴퓨터 부품을 팝니다. 부품을 사면 캐릭터의 안보이는 희망스탯이 오르고 ");
		
		System.out.println("   이는 알바를 더욱 빠르게 끝낼 수 있게 해줍니다.");
		System.out.println();
		System.out.println("6번을 눌러 컴퓨터 완성 현황를 볼 수 있습니다.");
		System.out.println();
		System.out.println("7번을 눌러 30일이 가기전에 컴퓨터가 완성이 되면 어머니께 검사를 받고 엔딩을 봅니다. 엔딩은 2탄으로 이어집니다.");
		System.out.println();
		System.out.println("8번을 눌러 시간을 스킵할 수 있습니다.");
		System.out.println();
		System.out.println("9번은 다른 행동을 하다가 아르바이트 시간을 놓쳤을 때, 일일 알바를 찾아서 일을 할 수 있습니다.");
		System.out.println("    시급은 더 적습니다.");
		System.out.println();
		System.out.println("888을 눌러 bgm을 on/off 할 수 있습니다.");
		System.out.println("_______________________________________________________________________________________");
		}
	Runnable bgm = new bgm();
	Thread bgmth = new Thread(bgm);
	if(bgmthread==false) {
		bgmth.start();}
Start2:while(true) {
	Runnable temper = new temper();
	Runnable hungrydamage = new hungrydamage();
	Runnable muscle = new muscle();
	Thread muscleth = new Thread(muscle);

	Thread bighung = new Thread(hungrydamage);
	Runnable store = new store();
	Thread storeth = new Thread(store);

	
	
	if(hungry.hungrythread==true) {
	bighung.start();
	}

	if(Time.count==22) {
		
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		System.out.println();
		System.out.println("              캐릭터가 밤이되어 잠에 듭니다.");
		System.out.println();
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
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
		Date.count++;
		Time.count=7;
		Student.hp+=30;
		if(Student.hp>=Student.maxhp) {
			Student.hp=Student.maxhp;
		}
		
	}
	if(Date.count==31) {
		new computer();
		if(computer.cpu==true||computer.gpu==true||computer.ram==true||computer.mb==true||computer.power==true||computer.toong==true||computer.ssd==true) 
		{
			System.out.println("어머니 : 결국 컴퓨터를 다 맞춰왔구나");
			System.out.println();
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}

			System.out.println("어머니: 약속대로 너가 원하는 학원에 보내줄게");
			System.out.println();
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}

			System.out.println("어머니: 학원 다니는 동안에는 엄마카드로 밥먹고 집중해");
			System.out.println();
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}

			System.out.println("어머니: 강사님께 인정 받고 와라.");
			System.out.println();
			System.out.println();
			
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
			  System.out.print("Loading");
			  for (int i = 0; i < 30; i++) {
			   System.out.print("▶");
			   try {
				   Thread.sleep(100);
				 } catch (InterruptedException e) {
				   Thread.currentThread().interrupt();
				   throw new AssertionError(e);
				 }
			  }
			  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				bgmth.interrupt();
		bighung.interrupt();
		   Date.count=1;
		   Time.count=9;
		   Student.hp=Student.maxhp;
		   Student.hungry=21;
		   System.out.println("드디어 고된 아르바이트 끝에 컴퓨터를 마춘 " +Student.name+"...");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("첫수업을 마치고 과제가 나가는데....");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("태봉파트장 : 여기서 이번주 과제가 나갑니다!!");
			System.out.println();
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
		   System.out.println("태봉파트장 : 한주동안 열심히 해서 완성해오시길 바랄게요!");
		   System.out.println();
		   try {
				  Thread.sleep(2000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
			new index();}else {
		System.out.println("어머니 : 결국 못맞췃네???");
		System.out.println();
		try {
			   Thread.sleep(3000);
			 } catch (InterruptedException e) {
			   Thread.currentThread().interrupt();
			   throw new AssertionError(e);}
		System.out.println("어머니 : 무슨 컴퓨터니~ 복학 준비나 해");
		System.exit(0);
		
	}}
	
System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()");
System.out.println();
System.out.println("                   오늘은 "+ Date.count +"일차 입니다.");
System.out.println("                  현재시간은 " + Time.count +"시 입니다."); 
System.out.println("            현재 " + Student.name + "의 체력은 "+ Student.hp +"/"+Student.maxhp+ " 입니다.");
new hungry();
System.out.println();
System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()");
System.out.println();
if(item.dosirockmaxdate==Date.count) {
	
	System.out.println();
	System.out.println("           만들어 놓은 도시락이 상했습니다.");
	System.out.println("                도시락을 버립니다. ");
	System.out.println();
	item.dosirock-=1;
	item.dosirock2=false;
	
}
System.out.println("무엇을 하시겠습니까?");
System.out.println("1. 아르바이트");
System.out.println("2. 아이템 사용");
System.out.println("3. 편의점가기");
System.out.println("4. 식사");
System.out.println("5. 컴퓨터가게");
System.out.println("6. 컴퓨터 완성 현황");
System.out.println("7. 어머니에게 가기");
System.out.println("8. 남은 시간 진행");
System.out.println("9. 일일 알바 찾기");
int manu=0;
	try {
		manu=scanner.nextInt();
	
	}catch(InputMismatchException e) {

		scanner = new Scanner(System.in);

	
	}	

	if(manu==1) {
		 ding.k();
		Thread temperthread = new Thread(temper);
		if(Time.count==7||Time.count==13){
			if(bigmusclethread==true) {
				
				System.out.println();
				System.out.println("xxxxxx근육통이 있어서 아르바이트에 갈 수 없습니다.xxxxxx");
				System.out.println();
				if(muscleend==Date.count) {
					bigmusclethread=false;
					System.out.println("근육통이 2일이 지나 풀렸습니다. 다시 입력해주십쇼.");
				}
			}else {
			Random rn = new Random();
        	if(musclethread==false) {
        		muscleth.start();
        	}
		
		int event = rn.nextInt(2);
		if (event==0) {
			System.out.println("\n" + 
					"\n" + 
					"            .,,,,,,,,-,,,,,,,-,-,,,,,,,,,,,,,,,,~.,,,,,,,,-,,,,,,,-,-,,,,,,,,,,,,,,,,~ \n" + 
					"            .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:\n" + 
					"            .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,~  \n" + 
					"   .,,,,,,, .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					"  --------- .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					"  :~-~:;~~~~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					" -:*;!!*;;;;.,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					" :;,,-~-,,,,.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					" !,--~!~:....,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					" !-~~:!;;,,,.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,;.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:\n" + 
					"-*-~-~::---~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,;.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					",!*~~~~~~~~~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,;.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					" !:~~~:;~~:~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,:.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					".!::::;!::;~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,;.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					".!;;;;:;::::,.,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,;.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
					".!~~~:!!!***;~~:~:~~::~~-:~~,-:,,~~~-~~-,-,,,,,,;;~~:~:~~::~~-:~~,-:,,~~~-~~-,-,,,,,,; \n" + 
					",=!!!!==**;!*!!=!=**!***=*=!!=!;:!**=!;:**!!!!;;;,=!!!!==**;!*!!=!=**!***=*=!!=!;:!**=\n" + 
					"-$=*;$###=*;=!!*!*$=!!*===***!$#==:*;=$=$;;$===*.;=!!*!*$=!!*===***!$#==:*;=$=$;;$===* \n" + 
					"-$==$#**!=#:********!*******!$**!=*=!$***#!!==;***********!*******!$**!=*=!$***#!!==;*  \n" + 
					"-===*=*:;*$!*!!*!!!!!!=******=!;;*#$=*:!;**    !!*!!*!!!!!!=******=!;;*#$=*:!;**    !  \n" + 
					".,::,=~=#*$*$=$#$$$$$$**=$$$$*~*$*$#$=*=;*$    .=#*$*$=$#$$$$$$**=$$$$*~*$*$#$=*=;*$     \n" + 
					"     -!;:*-                  -;!;*.  *!!;=     -!;:*-                  -;!;*.  *!!;=    \n" + 
					"      !**~                    ;**-   -=*!       !**~                    ;**-   -=*! \n" + 
					"");
			System.out.println(" 긴 트레일러의 물품을 다 내려야 합니다.");
			System.out.println();
			new bigtrailer();
		}
	else {
		System.out.println("            .,,,,,,,,-,,,,,,,-,-,,,,,,,,,,,,,,,,~ \n" + 
				"            .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				"            .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,~ \n" + 
				"   .,,,,,,, .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				"  --------- .,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				"  :~-~:;~~~~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				" -:*;!!*;;;;.,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,,,~ \n" + 
				" :;,,-~-,,,,.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				" !,--~!~:....,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				" !-~~:!;;,,,.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,; \n" + 
				"-*-~-~::---~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,; \n" + 
				",!*~~~~~~~~~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,; \n" + 
				" !:~~~:;~~:~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,: \n" + 
				".!::::;!::;~.,,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,; \n" + 
				".!;;;;:;::::,.,,,,,,,,,,.,,,,,,,,,,,.,,,,,,,,,,,; \n" + 
				".!~~~:!!!***;~~:~:~~::~~-:~~,-:,,~~~-~~-,-,,,,,,; \n" + 
				",=!!!!==**;!*!!=!=**!***=*=!!=!;:!**=!;:**!!!!;;; \n" + 
				"-$=*;$###=*;=!!*!*$=!!*===***!$#==:*;=$=$;;$===*. \n" + 
				"-$==$#**!=#:********!*******!$**!=*=!$***#!!==;*  \n" + 
				"-===*=*:;*$!*!!*!!!!!!=******=!;;*#$=*:!;**    !  \n" + 
				".,::,=~=#*$*$=$#$$$$$$**=$$$$*~*$*$#$=*=;*$    .  \n" + 
				"     -!;:*-                  -;!;*.  *!!;=        \n" + 
				"      !**~                    ;**-   -=*!         ");
		System.out.println(" 작은 트레일러의 물품을 다 내려야 합니다.");
		System.out.println();
		new smalltrailer();
		} 

		event = rn.nextInt(5);
		if (event==0) {
			System.out.println(" 종목은 쨔샤이 입니다.");
			System.out.println();
			  System.out.println(" 난이도 : 중");
			  System.out.println();
		}
	else if(event==1){
		    System.out.println(" 종목은 건조기 입니다.");
		    System.out.println();
		    System.out.println(" 난이도 : 중하");
		    System.out.println();
		    trailer.hp-=20;
		} else if(event==2){
		    System.out.println(" 종목은 음료수 입니다.");
		    System.out.println();
		    System.out.println(" 난이도 : 상");
		    System.out.println();
		    trailer.hp+=50;
		} else if(event==3){
		    System.out.println(" 종목은 젤리 입니다.");
		    System.out.println();
		    System.out.println(" 난이도 : 중상");
		    System.out.println();
		    trailer.hp+=20;
		} else if(event==4){
		    System.out.println(" 종목은 나쵸 입니다.");
		    System.out.println();
		    System.out.println(" 난이도 : 하");
		    System.out.println();
		    trailer.hp-=50;
		} 
		temperthread.start();
   while (trailer.hp > 0) {
    	
		Thread thread = new Thread(hungrydamage);
		
	if(hungry.hungrythread==true) {
		thread.start();
	}
        System.out.print("         _________________메뉴_________________\n");
        System.out.println("                 현재 트레일러 적재량:" +	trailer.hp);
        System.out.println("                 현재 나의 남은 체력:" + Student.hp);
    	new hungry();
        System.out.println("        1: 내리기        2: 아이템 사용       3: 도망가기");
    
        int select=0;
       try {
        select = scanner.nextInt();
       }catch(InputMismatchException e) {
    	   scanner = new Scanner(System.in);
       }
        if (select == 1) {
        	ding.box();
        	if(musclethread==true) {
        		System.out.println("근육통으로 인한 딜레이.. 5");
        		try {
 				   Thread.sleep(1000);
 				 } catch (InterruptedException e) {
 				   Thread.currentThread().interrupt();
 				   throw new AssertionError(e);
 				 }
        		System.out.println("근육통으로 인한 딜레이.. 4");
         		try {
  				   Thread.sleep(1000);
  				 } catch (InterruptedException e) {
  				   Thread.currentThread().interrupt();
  				   throw new AssertionError(e);
  				 }System.out.println("근육통으로 인한 딜레이.. 3");
          		try {
   				   Thread.sleep(1000);
   				 } catch (InterruptedException e) {
   				   Thread.currentThread().interrupt();
   				   throw new AssertionError(e);
   				 }System.out.println("근육통으로 인한 딜레이.. 2");
          		try {
   				   Thread.sleep(1000);
   				 } catch (InterruptedException e) {
   				   Thread.currentThread().interrupt();
   				   throw new AssertionError(e);
   				 }System.out.println("근육통으로 인한 딜레이.. 1");
          		try {
   				   Thread.sleep(1000);
   				 } catch (InterruptedException e) {
   				   Thread.currentThread().interrupt();
   				   throw new AssertionError(e);
   				 }
        		
        	}
    		int ram = rn.nextInt(20);
    		if(ram==5) {
    			System.out.println();
    			System.out.println("와장창!!!!");
    			System.out.println();
    			 try {
    				   Thread.sleep(1000);
    				 } catch (InterruptedException e) {
    				   Thread.currentThread().interrupt();
    				   throw new AssertionError(e);
    				 }
    			 System.out.println();
    			System.out.println("사장님 : 야!!!!!!!!");
    			System.out.println();
    			 try {
				   Thread.sleep(1000);
				 } catch (InterruptedException e) {
				   Thread.currentThread().interrupt();
				   throw new AssertionError(e);
				 }
    			System.out.println("실수를 하셨습니다.");
    			Student.mis+=10;
    			System.out.println("현재 벌점 상태 : "+ Student.mis);
    		
    			Student.hp-=2;
    			Student.hungry-=1;
    			new die();
    		}else {
    			System.out.println("                    ..------~~-..      \n" + 
    					"               .,-------~~---------~~~ \n" + 
    					"           ,~------~~~----------~~~~~- \n" + 
    					"           ,,,,,~~~:----------~~~~~~:. \n" + 
    					"           ,,,,,-~~,,,,,-------~~~~~:. \n" + 
    					"           ,,,,,,,-,,,,,,~~---~~~~~~:  \n" + 
    					"           ,,,,,,,,,,,,,,-~--~~~~~~::  \n" + 
    					"           ,,,,,,,,,,,,,,----~~~~~~::  \n" + 
    					"           ,,,,,,,,,,,,,,~~-~~~~~~~::  \n" + 
    					"           ,,,,,,,,,,,,,,---~~~~~~:::  \n" + 
    					"           -,,,,,,,,,,,,,---~~~~~~:::  \n" + 
    					"           --,,,,,,,,,,,,~~~-~~~~~:::  \n" + 
    					"           --,,,,,,,,,,,,----~~~~::::  \n" + 
    					"           ~--,,,,,,,,,,,-~~-~~~~~::;  \n" + 
    					"           ,---,,,,,,,,,,~~~~~~~~:::;  \n" + 
    					"            ----,,,,,,,,,~~~~~~~~::.   \n" + 
    					"            ------,,,,,,,~~~~~~~:.     \n" + 
    					"             ,--~~~,,,,,-~~~~~~.       \n" + 
    					"                .-~,,,,,-~~~-          \n" + 
    					"                     -,,,~-            \n" + 
    					"                        -             ");
    			System.out.println();
    				System.out.println("         으읏 차아");
    				System.out.println();
          trailer.hp -=	Student.hacha();
          new die();
    		}
          //랜덤하게 실수를 하는데 실수를 하면 벌점을 받고 일정 벌점이 쌓이면 일당을 받지 못한다.
          //또한 일정 확률로 근육통에 시달린다. 
          //근육통에 걸리면 체력깍이는 양이 1분동안 늘어난다. 
    		   if (trailer.hp <= 0) {
          if(Student.mis!=30){
        ding.def();
              System.out.println("후... 다내렸다.");
              System.out.println();
              Student.mis=0;
              System.out.println("일당을 받았습니다.");
              System.out.println();
              Student.money += trailer.money;
              temperthread.interrupt();
              muscleth.interrupt();
              if (gion>=32) {
            	  System.out.println("사장님 : 날도 더운데 고생이 많았다.");
            	  System.out.println();
            	  System.out.println("사장님 : 추가 보상을 주마.");
            	  Student.money += 10000;
            	
              }
              System.out.println("현재 가진 돈:" + Student.money);
              if(Time.count==7){
            	  Time.count=12;
              }else {
            	  Time.count=18;
              }
            	  
              
              
        }else {
        	Student.mis=0;
      	  System.out.println("후... 다내렸다.");
      	System.out.println();
          System.out.println("사장님 : 자네 벌점이 너무 많구만 일당을 줄 수 없을것 같네");
          System.out.println();
          temperthread.interrupt();
          muscleth.interrupt();
          if(Time.count==7){
        	  Time.count=12;
          }else {
        	  Time.count=18;
          }
          }
          }
        }
          
        else if (select == 2) {
        	//박카스를 마심으로 인해 체력과 허기를 채운다. 
        	//박카스는 편의점에서 미리 산다. 
        	//박카스를 마실때 꿀꺽꿀껄 하면서 체력과 허기를 보여준다. 
        	//근육통이 발생하면 파스를 붙여 치료한다.
        	while(true) {
        		System.out.println(" ________________________________");
        		System.out.println("    어떤 아이템을 사용하시겠습니까?");
        		System.out.println(" 1. 박카스 : "+item.drink);
        		System.out.println(" 2. 파스 : "+item.pass);
        		System.out.println(" 3. 나가기");
        		try {
        			number=scanner.nextInt();
        		
        		}catch(InputMismatchException e) {

        			scanner = new Scanner(System.in);

        		
        		}
        		if(number==1) {
        			 item.drink();
        			
        		}else if(number==2) {
        			
        			item.use();
        	
        			
        		}else if(number==3){ ding.k();
        			break;
        		}else {
        			System.out.println("-----------------------------------------------------");
        			System.out.println();
        			System.out.println("                지원하지 않는 기능입니다.");
        			System.out.println("                  다시 입력해주세요.");
        			System.out.println();
        			System.out.println("-----------------------------------------------------");
        		}
        		}
        }else if (select==3) {
        	System.out.println("                      살금");
        	System.out.println();
    		try {
  			  Thread.sleep(1000);
  			} catch (InterruptedException e) {
  			  Thread.currentThread().interrupt();
  			  throw new AssertionError(e);
  			}
        	System.out.println("                      살금");
        	System.out.println();
    		try {
  			  Thread.sleep(1000);
  			} catch (InterruptedException e) {
  			  Thread.currentThread().interrupt();
  			  throw new AssertionError(e);
  			}
        	System.out.println("                      살금");
        	System.out.println();
    		try {
  			  Thread.sleep(1000);
  			} catch (InterruptedException e) {
  			  Thread.currentThread().interrupt();
  			  throw new AssertionError(e);
  			}
        	if (Student.run() == true) { ding.k();
        	       try {
        	    	   	Student.mis=0;
        	    	   	Time.count+=2;
        	    	   	temperthread.interrupt();
        	            muscleth.interrupt();
        	    	   	System.out.println("-----------------------------------------------------");
        				System.out.println();
        				System.out.println("                더이상 할게 못돼!!!!!!.");
        				System.out.println("               	성공적으로 도망갔습니다.");
        				System.out.println();
        				System.out.println("-----------------------------------------------------");
					Thread.sleep(500);
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        	       break;

        	}else {
        		Student.mis+=10;
        		System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("                 사장님 : 어림없지!!!!!");
				System.out.println("          도망치기에 실패하셨습니다. 벌점을 받습니다.");
				System.out.println("                현재 벌점 상태 : "+ Student.mis);
				System.out.println();
				System.out.println("-----------------------------------------------------");
        	}

        
        }else {
        	System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                지원하지 않는 기능입니다.");
			System.out.println("                  다시 입력해주세요.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
        }
        
        
//        } else if (select == 3) {
         //도망가면 일당을 받지 못한다.
         //일정확률로 도망에 실패한다. 
         //else문 처리도해준다.
//         if (pl.run() == true) {
//          Thread.sleep(500);
//          break;
//
//         }
//        }
//        pl.hp -= en.atk() - pl.defense;
//}
}
			}
	}else {
		System.out.println("아르바이트는 7시와 13시에만 할 수 있습니다.");
	}
	}  
	
        else if(manu==2) { ding.k();
        	int storenumber=0;
        	while(true) {
        		System.out.println(" ________________________________");
        		System.out.println("    어떤 아이템을 사용하시겠습니까?");
        		System.out.println(" 1. 박카스 : "+item.drink+"개");
        		System.out.println(" 2. 파스 : "+item.pass+"개");
        		System.out.println(" 3. 나가기");
        		try {
        			storenumber=scanner.nextInt();
        		
        		}catch(InputMismatchException e) {

        			scanner = new Scanner(System.in);

        		
        		}
        		if(storenumber==1) {
        			 item.drink();
        			
        		}else if(storenumber==2) {
        			
        			item.use();
        			bigmusclethread=false;
        		}else if(storenumber==3){ ding.k();
        			break;
        		}else {
        			System.out.println("-----------------------------------------------------");
        			System.out.println();
        			System.out.println("                지원하지 않는 기능입니다.");
        			System.out.println("                  다시 입력해주세요.");
        			System.out.println();
        			System.out.println("-----------------------------------------------------");
        		}
        		}


}else if(manu==3){ ding.k();
	int connumber=0;
while(true) {	
	System.out.println("-----------------------------------------------------");
	System.out.println("                                   돈 : "+ Student.money);
	System.out.println("                     nv25 입니다.");
	System.out.println("                무엇을 구매하시겠습니까?");
	System.out.println("      1.박카스(2000)    2.파스(5000)        3.나가기");
	System.out.println("-----------------------------------------------------");
	System.out.println("현재 가진 수량 박카스 : "+item.drink+"개"+"   파스 : " +item.pass+"개");
	if(storethread==false) {
	storeth.start();
	storethread=true;
	}
	try {
		connumber=scanner.nextInt();
	
	}catch(InputMismatchException e) {

		scanner = new Scanner(System.in);}
	if(connumber==1) {
		if(Student.money>=2000) {
			if(bksevent==true) {
			item.drink+=2;}else {
				item.drink+=1;
			}
			System.out.println(" ________________________________");
			System.out.println();
			 ding.abc();
			System.out.println("         박카스를 구매했습니다.");
			System.out.println(" ________________________________");
			Student.money-=2000;
		}else {
			System.out.println(" ________________________________");
			System.out.println();
			System.out.println("          돈이 부족합니다.");
			System.out.println(" ________________________________");
		}
	}else if(connumber==2) {
		if(Student.money>=5000) {
			if(passevent==true) {
				item.pass+=2;}else {
					item.pass+=1;
				}
			System.out.println(" ________________________________");
			System.out.println();
			 ding.abc();
			System.out.println("          파스를 구매했습니다.");
			System.out.println(" ________________________________");
			Student.money-=5000;
		}else {
			System.out.println(" ________________________________");
			System.out.println();
			System.out.println("          돈이 부족합니다.");
			System.out.println(" ________________________________");
		}
	}else if(connumber==3) { ding.k();
		storethread=false;
		passevent=false;
		bksevent=false;
		storeth.interrupt();
		break;
	}else{
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("                지원하지 않는 기능입니다.");
		System.out.println("                  다시 입력해주세요.");
		System.out.println();
		System.out.println("-----------------------------------------------------");
	}
	//편의점에서 일할때 마실 박카스를 살 수 있다.
	//박카스와 파스를 살수있다.
}
	
}else if(manu==4){ ding.k();
	//식사 도시락 싸기 , 도시락 먹기 , 식사하기 
	while(true) {	
		System.out.println("-----------------------------------------------------");
		System.out.println("                                   돈 : "+ Student.money);
		System.out.println("                    식사 메뉴입니다.");
		System.out.println("                 무엇을 하시겠습니까??");
		System.out.println("         1. 도시락 싸기    2. 먹기    3. 나가기");
		System.out.println("-----------------------------------------------------");
		int boobnumber=0;
		try {
			boobnumber=scanner.nextInt();
		
		}catch(InputMismatchException e) {

			scanner = new Scanner(System.in);}
		
			if(boobnumber==1) {
				if(item.dosirock2==false) {
					item.dosirock2=true;
				item.dosirock+=1;
				Time.count+=1;
				Student.hp-=5;
				
				item.dosirockdate=Date.count;
				item.dosirockmaxdate=item.dosirockdate+2;
				item.dosirocktime=Time.count;
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          도시락을 만들었습니다!.");
				System.out.println(" ________________________________");
				new die();	
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("         이미 도시락이 있습니다.");
					System.out.println(" ________________________________");
				}
			
		}else if(boobnumber==2) {
			int eatnumber=0;
			while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("                                   돈 : "+ Student.money);
			System.out.println("                    먹기 메뉴입니다.");
			System.out.println("                 무엇을 하시겠습니까??");
			System.out.println("         1. 도시락 먹기    2. 시켜먹기    3. 나가기");
			System.out.println("-----------------------------------------------------");
			System.out.println(" 현재 도시락 수량 : " + item.dosirock +"개");
			if(item.dosirock==1) {
			System.out.println(" 도시락의 남은 유통기한 : " + (item.dosirockmaxdate - Date.count)+"일");
			 if((item.dosirockmaxdate - Date.count)==1) {
				 System.out.println(" 도시락이 내일 아침 폐기됩니다.");
			 }
			}
			try {
				eatnumber=scanner.nextInt();
			
			}catch(InputMismatchException e) {

				scanner = new Scanner(System.in);}
			if(eatnumber==1) {
		          	item.eat();
				}else if(eatnumber==2){
					
					new sanghachabd();
					
					
					
				}else if(eatnumber==3){ ding.k();
					break;
				}else {
					System.out.println("-----------------------------------------------------");
        			System.out.println();
        			System.out.println("                지원하지 않는 기능입니다.");
        			System.out.println("                  다시 입력해주세요.");
        			System.out.println();
        			System.out.println("-----------------------------------------------------");
				}	}
		}else if (boobnumber==3) { ding.k();
			break; 
		}else {
			System.out.println("-----------------------------------------------------");
			System.out.println();
			System.out.println("                지원하지 않는 기능입니다.");
			System.out.println("                  다시 입력해주세요.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
		}
		}
	
}else if(manu==5){ ding.k();
	//컴퓨터 가게에서 컴퓨터 부품을 살 수 있는데 cpu,ram,mainboard,ssd,power,gpu,case를 구매할수있다.
	//컴퓨터 부품을 구매할수록 Student의 hope이 높아지는데 희망이 높아질수록 아르바이트 작업효율이 증가한다.
	if(Time.count<=20) {
	Time.count+=1;
	new computerstore();
	}else {
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("          컴퓨터 가게는 20시 이후에는 문을 닫습니다.");
		System.out.println();
		System.out.println("-----------------------------------------------------");
	}
	
	
	
	
}else if(manu==6){ ding.k();
	new computer();
	//컴퓨터의 완성 현황 보여준다. 
	continue Start2;
	 
}else if(manu==7){ ding.k();
	//어머니한테 갔을때 컴퓨터가 완성이 되었으면 대사와 함께 팀노바 과제 페이지로 이동한다. 
	// 완성이 안되었으면 빠꾸 

	if(computer.cpu==true&&computer.gpu==true&&computer.ram==true&&computer.mb==true&&computer.power==true&&computer.toong==true&&computer.ssd==true) 
	{	new computer();
		System.out.println("어머니 : 결국 컴퓨터를 다 맞춰왔구나");
		System.out.println();
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}

		System.out.println("어머니: 약속대로 너가 원하는 학원에 보내줄게");
		System.out.println();
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}

		System.out.println("어머니: 학원 다니는 동안에는 엄마카드로 밥먹고 집중해");
		System.out.println();
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}

		System.out.println("어머니: 강사님께 인정 받고 와라.");
		System.out.println();
		System.out.println();
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
		  System.out.print("Loading");
		  for (int i = 0; i < 30; i++) {
		   System.out.print("▶");
		   try {
			   Thread.sleep(100);
			 } catch (InterruptedException e) {
			   Thread.currentThread().interrupt();
			   throw new AssertionError(e);
			 }
		  }
		  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			bgmth.interrupt();
	bighung.interrupt();
	   Date.count=1;
	   Time.count=9;
	   Student.hp=Student.maxhp;
	   Student.hungry=21;
	   System.out.println("드디어 고된 아르바이트 끝에 컴퓨터를 마춘 " +Student.name+"...");
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
	   System.out.println("첫수업을 마치고 과제가 나가는데....");
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
	   System.out.println("태봉파트장 : 여기서 이번주 과제가 나갑니다!!");
		System.out.println();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
	   System.out.println("태봉파트장 : 한주동안 열심히 해서 완성해오시길 바랄게요!");
	   System.out.println();
	   try {
			  Thread.sleep(2000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
		new index();
	}else {
		Time.count+=1;
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println("        어머니 : 아직 안맞췄니?.");
		System.out.println(" ________________________________");
		
		continue Start2;
	}
	
	
	
	

}else if(manu==8) { ding.k();
	new killingtime();
	
}else if(manu==9) { ding.k();
	if(Time.count<=16) {
	new oneonealba();
	}else {
		System.out.println("16시 이후는 일일 알바를 찾기에 늦었습니다.");
	}
	
}
else if(manu==888) { ding.k();
if(bgmthread==false) {
	bgm.run();
	}else {
		Four.bgm.bgmstop();
		bgmth.interrupt();
		bgmthread=false;
	}
}else if(manu==777) { ding.k();
	Date.count=30;
}
	else{
	System.out.println("-----------------------------------------------------");
	System.out.println();
	System.out.println("                지원하지 않는 기능입니다.");
	System.out.println("                  다시 입력해주세요.");
	System.out.println();
	System.out.println("-----------------------------------------------------");
	continue Start2;
	}
	}
}
	
}

