package Four;

import java.util.Random;
import java.util.Scanner;

class ace {
	Scanner scanner = new Scanner(System.in);
	String enter=null;
	String ceat=null;
	public ace() {
		Random rn = new Random();
		int	score = rn.nextInt(11);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		System.out.println();
		System.out.println("                    오늘은 7일차");
		System.out.println("               과제를 검사 받는날 입니다.");
		System.out.println();
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("아무거나 입력해주세요>>");
		enter=scanner.next();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("                   발표를 진행합니다.");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("아무거나 입력해주세요>>");
		ceat=scanner.next();
		if (ceat.equals("190000")) {
			new ending();
		}

		System.out.println();
		Student.homework=Student.homework - score;
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("                     태봉파트장님");
		System.out.println("               	과제의 진행도는 " +Student.homework +" 입니다.");
		System.out.println("                발표준비도는 " +Student.speak +" 입니다.");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("아무거나 입력해주세요>>");
		enter=scanner.next();
		if(Student.homework<=20) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                  개발자가 쉬워보여요??");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework<=50) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                  공부 얼마나 하셨어요?");
			System.out.println("                    질문은 가셨어요?");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework<=70) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                 내일부터 방문 발표하세요");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework<=80 && Student.speak<=20) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                 과제는 열심히 한거같은데");
			System.out.println("                   발표 연습 했어요?");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework<=80 && Student.speak<=60) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                    조금씩 아쉽네");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework<=80 && Student.speak > 60) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("               과제에서 조금 더 욕심내세요");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}
		else if(Student.homework<=90 && Student.speak <= 60) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                  발표도 신경써주세요");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework>90 && Student.speak >= 60) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                 앞으로 그대로만 해주세요 ");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}else if(Student.homework>90 && Student.speak < 60) {
			
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println();
			System.out.println("                     태봉파트장님");
			System.out.println("                  발표도 신경써주세요 ");
			System.out.println();
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.exit(0);
			
		}
		
	}

}
