package Four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class computerstore {
	int number=0;
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	ding ding = new ding();


	
	public computerstore() {
	while(true) {
		System.out.println("-----------------------------------------------------");
		System.out.println("                                   돈 : "+ Student.money);
		System.out.println("                 허수아비 : 어서오세요~ ");
		System.out.println("                  무엇을 사시겠습니까?");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		if(computer.cpu==false) {
		System.out.println("1. CPU : 400000");
		}else {
			System.out.println("1. CPU : Sold out");
		}
		if(computer.mb==false) {
			System.out.println("2. 메인보드 : 200000");
			}else {
				System.out.println("2. 메인보드 : Sold out");
			}
		if(computer.gpu==false) {
			System.out.println("3. 그래픽카드 : 300000");
			}else {
				System.out.println("3. 그래픽카드 : Sold out");
			}
		if(computer.ram==false) {
			System.out.println("4. Ram : 100000");
			}else {
				System.out.println("4. Ram : Sold out");
			}
		if(computer.ssd==false) {
			System.out.println("5. 하드디스크 : 100000");
			}else {
				System.out.println("5. 하드디스크 : Sold out");
			}
		if(computer.power==false) {
			System.out.println("6. 파워서플라이 : 100000");
			}else {
				System.out.println("6. 파워서플라이 : Sold out");
			}
		if(computer.toong==false) {
			System.out.println("7. 케이스 : 50000");
			}else {
				System.out.println("7. 케이스 : Sold out");
			}
		System.out.println("8. 나가기");
		try {
			number=scanner.nextInt();
		
		}catch(InputMismatchException e) {

			scanner = new Scanner(System.in);}
		if(number==1){
			if(computer.cpu==false) {
				if(Student.money>=400000) {
					Student.money-=400000;
					computer.cpu=true;
					Student.hope+=4;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("         CPU를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
					
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==2){
			if(computer.mb==false) {
				if(Student.money>=200000) {
					Student.money-=200000;
					computer.mb=true;
					Student.hope+=2;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("         메인보드를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==3){
			if(computer.gpu==false) {
				if(Student.money>=300000) {
					Student.money-=300000;
					computer.gpu=true;
					Student.hope+=3;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("       그래픽카드를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==4){
			if(computer.ram==false) {
				if(Student.money>=100000) {
					Student.money-=100000;
					computer.ram=true;
					Student.hope+=1;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("         Ram를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==5){
			if(computer.ssd==false) {
				if(Student.money>=100000) {
					Student.money-=100000;
					computer.ssd=true;
					Student.hope+=1;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("       하드디스크를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==6){
			if(computer.power==false) {
				if(Student.money>=100000) {
					Student.money-=100000;
					computer.power=true;
					Student.hope+=1;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("       파워서플라이를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==7){
			if(computer.toong==false) {
				if(Student.money>=100000) {
					Student.money-=100000;
					computer.toong=true;
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("       케이스를 구매했습니다.");
					System.out.println(" ________________________________");
					 ding.abc();
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("          돈이 부족합니다.");
					System.out.println(" ________________________________");
				}
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          이미 보유중입니다.");
				System.out.println(" ________________________________");
			}
		}else if(number==8) 
		{ ding.k();
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
	}
}
