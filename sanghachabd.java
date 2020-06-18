package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sanghachabd {

	public sanghachabd() {
		
		int number=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		while(true) {
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println(" 돈 : "+ Student.money);
		System.out.println("        무엇을 시켜드시겠습니까?");
		System.out.println();
		System.out.println(" ________________________________");
		System.out.println("1. 김치찌개(6000)");
		System.out.println("2. 뜨끈~하고 든~든~한 국밥(6000)");
		System.out.println("3. 얼큰한 짬뽕(6000)");
		System.out.println("4. 니글니글 뜨파게틔(6000) ");
		System.out.println("5. 나가기");
		try {
			number=scanner.nextInt();
		
		}catch(InputMismatchException e) {

			scanner = new Scanner(System.in);}
	if(Student.money>=6000) {
		
		if(number==1) {
			Student.money-=6000;
			Time.count+=1;
			System.out.println(" ________________________________");
			System.out.println();
			System.out.println("          김치찌개를 먹습니다. ");
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
			System.out.println("           쭈압....");
			Student.hp+=10;
			if(Student.hp>=Student.maxhp) {
				Student.hp=Student.maxhp;
			}
			
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
			System.out.println("           쭈압...");
			Student.hp+=10;
			if(Student.hp>=Student.maxhp) {
				Student.hp=Student.maxhp;
			}
			Student.hungry=21;
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				  throw new AssertionError(e);
				}
			System.out.println("         김치찌개를 다먹었습니다.");
			System.out.println(" ________________________________");
			break;
		}else if(number==2) {
			Student.money-=6000;
		Time.count+=1;
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println("          국밥을 먹습니다. ");
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
		System.out.println("           뜨끈....");
		Student.hp+=10;
		if(Student.hp>=Student.maxhp) {
			Student.hp=Student.maxhp;
		}
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
		System.out.println("           든든....");
		Student.hp+=10;
		if(Student.hp>=Student.maxhp) {
			Student.hp=Student.maxhp;
		}
		Student.hungry=21;
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			  throw new AssertionError(e);
			}
		System.out.println("         국밥을 다먹었습니다.");
		System.out.println(" ________________________________");
		break;
}else	if(number==3) {
	Student.money-=6000;
	Time.count+=1;
	System.out.println(" ________________________________");
	System.out.println();
	System.out.println("         짬뽕을 먹습니다. ");
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("           얼큰....");
	Student.hp+=10;
	if(Student.hp>=Student.maxhp) {
		Student.hp=Student.maxhp;
	}
	
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("           후룩....");
	Student.hp+=10;
	if(Student.hp>=Student.maxhp) {
		Student.hp=Student.maxhp;
	}
	Student.hungry=21;
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("         짬뽕을 다먹었습니다.");
	System.out.println(" ________________________________");
	break;
}else if(number==4) {
	Student.money-=6000;
	Time.count+=1;
	System.out.println(" ________________________________");
	System.out.println();
	System.out.println("          스파게티를 먹습니다. ");
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("           니글....");
	Student.hp+=10;
	if(Student.hp>=Student.maxhp) {
		Student.hp=Student.maxhp;
	}
	
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("           느글...");
	Student.hp+=10;
	if(Student.hp>=Student.maxhp) {
		Student.hp=Student.maxhp;
	}
	Student.hungry=21;
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		  throw new AssertionError(e);
		}
	System.out.println("         스파게티를 다먹었습니다.");
	System.out.println(" ________________________________");
	break;
}else if(number==5) {
	break;
}else {
	System.out.println("-----------------------------------------------------");
	System.out.println();
	System.out.println("                지원하지 않는 기능입니다.");
	System.out.println("                  다시 입력해주세요.");
	System.out.println();
	System.out.println("-----------------------------------------------------");
}
	}else {
		System.out.println(" ________________________________");
		System.out.println();
		System.out.println("           돈이 부족합니다.");
		System.out.println(" ________________________________");
	
	}
	}
		
	}
}
