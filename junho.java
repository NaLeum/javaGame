package Four;
//import java.util.Random;


class junho implements Runnable{
	@Override
	public void run() {
	
		
		System.out.println("                                                   당신의 하브루타 파트너 준호형이 왔습니다.");
		System.out.println("                                                  심적 든든함으로 집중력이 10초간 상승합니다.");
		System.out.println();
		
    	Student.concentration+=1;
	
		
		try {
			  Thread.sleep(10000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();

			}
		
		System.out.println();
		System.out.println("                                                     하브루타 파트너 버프가 끝났습니다.");
		System.out.println();

		Student.concentration-=1;
		samusil.junhothread=true;
		  Thread.currentThread().interrupt();
	
	}
}
