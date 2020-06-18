package Four;
import java.util.InputMismatchException;
import java.util.Scanner;



public class index {
	public static boolean gamestory2 = false;

	public static void main(String[] args) {
		int number=0;
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	
		System.out.println();
		System.out.println("학생의 이름을 입력해주세요");
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
		
		System.out.println(Student.name+"님 환영합니다.");
		System.out.println("태봉파트장님이 과제를 내줬습니다.");
		System.out.println("일주일동안 과제와 발표를 열심히 준비해주세요.");
		System.out.println();
		System.out.println();
		new index();
		}
	//index메소드 일차가 넘어가서 처음부터 시작할때는 이부분부터 시작한다.
public index() {
	if(gamestory2==false) {
		gamestory2=true;
		System.out.println("_______________________________________________________________________________________");
		System.out.println();
		System.out.println("과제 및 발표 준비를 7일안에 해내셔야 합니다. 완성도만큼 파트장님의 평가가 달라집니다.");
		System.out.println();
		System.out.println("발표 준비는 과제를 일정 수준 했을때 가능합니다.");
		System.out.println();
		System.out.println("과제와 발표 준비도는 사무실의 멘토를 통해 할 수 있습니다. 허나 맹신은 금물입니다.");
		System.out.println();
		System.out.println("과제를 사무실에서 하는 방법과 집에서 하는 방법이 있습니다.");
		System.out.println();
		System.out.println("사무실에서 과제를 하면 집중력이 더 오르게 되지만 오고 가는 시간 및 체력이 깍이게 됩니다.");
		System.out.println();
		System.out.println("집에서 과제를 하면 시간 및 체력 관리가 쉽지만 각종 유혹이 도사랍니다.");
		System.out.println();
		System.out.println("허기스탯이 0이 되면 3초마다 체력이 깍이게 됩니다.");
		System.out.println();
		System.out.println("사무실에 비치된 누네띄네나 집에서 하리보를 먹게되면 시간손해 없이 허기를 채울 수 있습니다.");
		System.out.println();
		System.out.println("나가서 먹거나 시켜 먹을 경우 시간의 손해는 있지만 한번에 허기를 채울 수 있습니다.");
		System.out.println("2탄은 엄마카드로 인해 돈의 관계없이 먹을 수 있습니다.");
		System.out.println();
		System.out.println("888을 눌러 bgm을 on/off 할 수 있습니다.");
		System.out.println("_______________________________________________________________________________________");
		
	}

	while(true) {
		//7일차가 되면 평가받는 메소드를 불러온다
		if(Date.count==7) {
			new ace();
		}
		//평상시 진행할땐 이부분이 출력이 된다.
	    	System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()");
	    	System.out.println();
			System.out.println("                   오늘은 "+ Date.count +"일차 입니다.");
			System.out.println("                  현재시간은 " + Time.count +"시 입니다."); 
			System.out.println("            현재 " + Student.name + "의 체력은 "+ Student.hp +"/"+Student.maxhp+ " 입니다.");
			  new hungry();
			System.out.println();
			System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()");
			new choice();
	
			}
		}
	}


