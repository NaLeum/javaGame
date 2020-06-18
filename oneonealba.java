package Four;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class oneonealba {
	public int albastarttime;
	public int albafinishtime;
	public int albaingtime;
	public int hongbo;
	public int paper=150;
	public static int tempercount=0;
	public static boolean children = true;
	public int watercount=0;
	public static boolean childrenevent=false;
	public static boolean waterthead=false;
 	Scanner scanner = new Scanner(System.in);
	
	public oneonealba() {
		Time.count+=1;
		System.out.println();
		System.out.print(" 일일알바를 검색합니다");
		for (int i = 0; i < 5; i++) {
			   System.out.print("...");

			   try {
				   Thread.sleep(500);
				 } catch (InterruptedException e) {
				   Thread.currentThread().interrupt();
				   throw new AssertionError(e);
				 }
			  }
		System.out.println();
		
		Random rn = new Random();
    	int event = rn.nextInt(2);
    	albastarttime = Time.count;
    	albaingtime = rn.nextInt(3)+3;
    	albafinishtime = albastarttime + albaingtime;
    	if(event==0){
    		//못찾음
    		System.out.println();
    		System.out.println(" 일일알바를 찾지 못했습니다.");
    		System.out.println();
    		
    		
    		
    	}else if(event==1) {
    		ding ding = new ding();
    		//인형탈알바
    		hongbo=0;
    		Runnable hungrydamage = new hungrydamage();
    		Runnable water = new water();
    		Thread waterth = new Thread(water);
    		Runnable temper = new temper();
    		Thread temperthread = new Thread(temper);
    		temperthread.start();
    		
    		
    		tempercount=0;
    		System.out.println();
    		System.out.println(" 인형탈 알바가 잡혔습니다.");
    		System.out.println();
    		System.out.println("사장님 : " + albaingtime + "시간 동안 일해주세요.");
    		System.out.println();
    	event2:	while(true) {
    			Thread thread = new Thread(hungrydamage);
    			
    			if(hungry.hungrythread==true) {
    				
    				thread.start();
    			} 
    			
    			if(tempercount==1&&childrenevent==false) {
    				childrenevent=true;
    				
    				
    	event:	while(true) {
    		if(waterthead==false) {
				waterthead=true;
				try {
					   Thread.sleep(1000);
					 } catch (InterruptedException e) {
					   Thread.currentThread().interrupt();
					   throw new AssertionError(e);
					 }
				  
			   waterth.start();
		
			}
    				System.out.print("         ____________________________________\n");
    				System.out.println("");
        	        System.out.println("          계속되는 고온으로 인해 탈수증상이 왔습니다."	);
        	        System.out.println("            아이들 몰래 물을 3번 마셔야 합니다. ");
        	        System.out.println("                    1. 물마시기 ");

        	        int number=0;
        	        try {
        	    		number=scanner.nextInt();
        	    		
        	    		}catch(InputMismatchException e) {

        	    		scanner = new Scanner(System.in);

        	    		}
        	   		

        	        if (number==1) {
        	        	if(children==true) {
        	        		waterth.interrupt();
        	        		 System.out.println("        아이들의 동심을 지켜주지 못했습니다.");
        	        		 System.out.println("         아이가 울고 부모가 항의합니다.");
        	        		 Student.mis+=10;
        	        		 System.out.println("          벌점을 받습니다. : "+ Student.mis);
        	        		
        	        		 continue event2;
        	        		 
        	        		
        	        		 
        	        	}else {
        	        		 System.out.println("                     꿀꺽!.");
        	        		 watercount++;
        	        		
        	        		 if (watercount==3) {
        	        			 waterth.interrupt();
        	        			 System.out.println();
        	        			 System.out.println("         무사히 물을 마셨습니다.");
        	        		
        	        			
        	        			 continue event2;
        	        		 }
        	        		 continue event;
        	        	}
        	        }
        	        }
        	        
    			}
    			System.out.print("         _________________메뉴_________________\n");
    	        System.out.println("                 현재 홍보량 : " + hongbo+"/150"	);
    	        System.out.println("                  현재 나의 남은 체력:" + Student.hp);
    	    	new hungry();
    	        System.out.println("     1: 홍보하기        2: 아이템 사용       3: 도망가기");
    	    	
    	        int albaone=0;
    	        
    	        try {
    	    		albaone=scanner.nextInt();
    	    		
    	    		}catch(InputMismatchException e) {

    	    		scanner = new Scanner(System.in);

    	    		}
    	        if(albaone==1) {
    	        	
    	    		int ram = rn.nextInt(20);
    	    		if(ram==5) {
    	    			System.out.println();
    	    			System.out.println("꽈당!!!!!!");
    	    			System.out.println();
    	    			 try {
    	    				   Thread.sleep(1000);
    	    				 } catch (InterruptedException e) {
    	    				   Thread.currentThread().interrupt();
    	    				   throw new AssertionError(e);
    	    				 }
    	    			 System.out.println();
    	    			System.out.println("아이들 : 인형탈이 넘어졌다!!");
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
    	        	
    	    		//인형탈 알바 그림
    	    			System.out.println("                                                                          \n" + 
    	    					"                                                                                \n" + 
    	    					"                                  ,;*==**===;,                                  \n" + 
    	    					"                              .:;*;-,~~~~~,.,:!;~                               \n" + 
    	    					"                             *=. ~##;-,.,-:=@*, -#~                             \n" + 
    	    					"                           !:.:*:-           .-;*--*~                           \n" + 
    	    					"                         -*,~*~   -~;!****;:~-   ;!,;;                          \n" + 
    	    					"                        :! $,   *$-          :#~   *:.=                         \n" + 
    	    					"                       :;-!. .!;,              ~!:  ~!,*                        \n" + 
    	    					"                      ~;~!  -=.                  :*  .;,$                       \n" + 
    	    					"                     ,!-:  ;:                     .$  ,*.!                      \n" + 
    	    					"                     !,!  ;~                       .!  ~:~:                     \n" + 
    	    					"                    ;-*  ~~                         ,$  =,*                     \n" + 
    	    					"                   -!!, -!                           -~  !,;                    \n" + 
    	    					"                   ; ;  !                             *. :~=.                   \n" + 
    	    					"                  .!;, ~~     .,.            .~;:,     *  = :                   \n" + 
    	    					"                  *.#  #    ;!---;!         *~,.,-*,   :  ~ !                   \n" + 
    	    					"                 ~*~- ~-   !~     -;       !-      *,  ,; ,;~!                  \n" + 
    	    					"                !~ ;  ;   -~       ::     .:        !   @  @ .#                 \n" + 
    	    					"              .*;  !  *   #         =     -,        ;   ;, !, .=.               \n" + 
    	    					"              =!,  !  *   =   ,@-   !     ~,   @!   :   .~ .:  *$               \n" + 
    	    					"             .!#  :~ -:   *    -    *     --        ;    ~  :  :-,              \n" + 
    	    					"             ,;#  *. :-   $.       ,! ;!*,.:        !    ;  ;  ;,-              \n" + 
    	    					"             .*$  $  !,   .!       * *-..!.!-      :~    !  ;  ;:,              \n" + 
    	    					"              -#  =  !.    -$,   :#.:-... #,;*   ,$-     !  ;  ;-               \n" + 
    	    					"               $. !  !.      :;;;~:!~  ..  :!*!;;:.      !  ;  !                \n" + 
    	    					"                !,;  !.         ,=- ,;$**$:.  =          !  !,=,                \n" + 
    	    					"                .*:  !.         =~!=!=-  :#;$;$.         ;  !~                  \n" + 
    	    					"                 .~  ;-         .~~!,.:;;- ~!-.          :  !                   \n" + 
    	    					"                 .~  -:             =*-,-:#:             ~  !                   \n" + 
    	    					"                 .~   *              .,,,.              =.  !                   \n" + 
    	    					"              ;!!*:   ~:                               ;;   !                   \n" + 
    	    					"             !,  .!    :;                            ,#.    ;                   \n" + 
    	    					"             ;    :;*;  ,!!.                      .!!-      ;                   \n" + 
    	    					"             :     * =    ,*!~-.              .-~!!.        ;                   \n" + 
    	    					"             ~       ;        ,*#@$!:----~;=#@=-           #:                   \n" + 
    	    					"             :       $;            .,-----,.           ,!!:.;                   \n" + 
    	    					"             !       *-=*~-.                      .,-;=;    ;                   \n" + 
    	    					"             ~;      -;  .,;$#*~,.          .,:*#$;,.       ,=                  \n" + 
    	    					"              !       ;.      .-~::::;;;:::::~-.             *                  \n" 
    	    					
    	    					);
    	        	  hongbo +=	Student.hacha();
    	        	  new die();}
    	        }else if(albaone==2){
    	        	int number=0;
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
            	
            			
            		}else if(number==3){
            			
            		}else {
            			System.out.println("-----------------------------------------------------");
            			System.out.println();
            			System.out.println("                지원하지 않는 기능입니다.");
            			System.out.println("                  다시 입력해주세요.");
            			System.out.println();
            			System.out.println("-----------------------------------------------------");
            		}
            		}else if(albaone==3) {
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
                    	if (Student.run() == true) {
                    	       try {
                    	    	   	Student.mis=0;
                    	    	   	Time.count+=2;
                    	    	    temperthread.interrupt();
                    	    	    waterthead=false;
                    	    	    childrenevent=false;
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
    	  		   if (hongbo >= 150) {
    	  	          if(Student.mis!=30){
    	  	        	  childrenevent=false;
    	  	            waterthead=false;
    	  	          ding.def();
    	  	        	 temperthread.interrupt();
    	  	              System.out.println("후... 홍보 다했다.");
    	  	              System.out.println();
    	  	              Student.mis=0;
    	  	              System.out.println("일당을 받았습니다.");
    	  	              System.out.println();
    	  	              Student.money = Student.money+(albaingtime*8000);
    	  	              
    	  	              System.out.println("현재 가진 돈:" + Student.money);
    	  	              Time.count=albafinishtime;
    	  	              break;
    	  	              
    	  	              
    	  	        }else {
    	  	        	Student.mis=0;
    	  	          childrenevent=false;
    	  	        	 temperthread.interrupt();
    	  	      	  System.out.println("후... 홍보 다했다.");
    	  	      	System.out.println();
    	  	          System.out.println("사장님 : 자네 벌점이 너무 많구만 일당을 줄 수 없을것 같네");
    	  	          System.out.println();
    	  	        Time.count=albafinishtime;
    	  	        break;
    	  	          }
    	  	          }	
            	
    	        
    	        
    	        
    	        }
    		}
    		
    	else if(event==2) {
    		//전단지알바
    		System.out.println();
    		System.out.println(" 전단지 알바가 잡혔습니다.");
    		System.out.println();
    		System.out.println("사장님 : " + albaingtime + "시간 동안 일해주세요.");
    		System.out.println();
    		while(true) {
    			
    			System.out.print("         _________________메뉴_________________\n");
    	        System.out.println("               	  현재 남은 전단지:" + paper	);
    	        System.out.println("                현재 나의 남은 체력:" + Student.hp);
    	    	new hungry();
    	        System.out.println("   1: 전단지 돌리기        2: 아이템 사용       3: 도망가기");
    	    
    			
    			
    		}
    		
    		
    	}else if(event==3) {
    		//하객대행알바
    		System.out.println();
    		System.out.println(" 하객대행 알바가 잡혔습니다.");
    		System.out.println();
    		System.out.println("사장님 : " + albaingtime + "시간 동안 일해주세요.");
    		System.out.println();
    		while(true) {
    			
    			System.out.print("         _________________메뉴_________________\n");
    	        System.out.println("                   현재 호응도:" + hongbo	);
    	        System.out.println("               현재 나의 남은 체력:" + Student.hp);
    	    	new hungry();
    	        System.out.println("     1: 박수치기        2: 아이템 사용       3: 도망가기");
    	    
    			
    			
    		}
    		
    		
    	}
    	
		
		
		
		
		
		
		
	
		
		
		
	}

}
