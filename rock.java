package Four;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class rock {public static String resultString(int n){

	String r = "";

	if(n ==0)

		r= "가위";

	else if(n == 1)

		r= "바위";

	else

		r= "보";

	return r;

}
public rock() {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);



	int user=0;

	int com;



	Random r = new Random();

	com = (r.nextInt() >>>1) % 3 ;//정수의 범위 내에서 임의로 수를 만들어줌


	System.out.println();
    System.out.println("유혹과 가위바위보 게임을 시작합니다.");
    System.out.println("이기시면 유혹에 빠지지 않습니다.");
    System.out.println();
	System.out.print("가위[0], 바위[1], 보[2]를 선택하시오==>");
	loop:while(true) {
		try {
			user = sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("지원하지 않는 기능입니다.");
			System.out.print("가위[0], 바위[1], 보[2]를 선택하시오==>");
			sc = new Scanner(System.in);
		}
 
		if(user<3) {
			break;
		}
	if(user>=3) {
		 System.out.println("지원하지 않는 기능입니다.");
		 System.out.print("가위[0], 바위[1], 보[2]를 선택하시오==>");
		continue loop;
	 	}
	}

	//컴퓨터가 발생한 숫자에 따라 가위,바위, 보 문자열 설정

	//사용자가 입력한 숫자에 따라 가위,바위, 보 문자열 설정

	//이와같이 똑같은 코드를 반복해서 쓰일 경우

	// ==> 그 일처리를 위한 기능을 미리 만들어 두면 

	//          반복코드를 줄일 수 있다. == '메소드' 라고 한다



	System.out.println("유혹 : " + resultString(com));

	System.out.println(Student.name+" : " + resultString(user));



	if(user == com) { //비긴거
		System.out.println();
		System.out.println("비겼습니다. 재대결을 시작합니다.");
		System.out.println();
        new rock();
	}
	else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com ==1))
	{
		//위에 else if 는 사용자가 이기는 컨디션
		System.out.println();
		System.out.println("당신이 이겼습니다.");
		System.out.println("유혹에 빠지지 않고 다시 집중합니다.");
		System.out.println();
		new room();
	}
	else { // 진거
		System.out.println();
		System.out.println("당신이 졌습니다.");
		System.out.println("유혹에 빠져 시간을 허비했습니다.");
		System.out.println();
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
	}
}




	
	
	
	
	

}
