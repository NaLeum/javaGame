package Four;

import java.util.Random;

public class junhoevent implements Runnable{

	@Override
	public void run() {
		samusil.junhoeventthread=true;
		while(!Thread.currentThread().isInterrupted()) {
			Random rn = new Random();
        	int event = rn.nextInt(5);
			if(event==1) {
		
				System.out.println();
				System.out.println("                                                당신의 하브루타 파트너 준호형이 집중을 합니다.");
				System.out.println("                                                   자극을 받아 집중력이 5초간 상승합니다.");
				System.out.println();

		    	Student.concentration+=1;
				
				try {
					  Thread.sleep(5000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();

					}
				
	
				System.out.println();
				System.out.println("                                                    하브루타 파트너 버프가 끝났습니다.");
				System.out.println();

				Student.concentration-=1;
		
			}else if(event==2) {

				System.out.println();
				System.out.println("                                                당신의 하브루타 파트너 준호형이 신경쓰이게 합니다.");
				System.out.println("                                                       집중력이 5초간 하락합니다.");
				System.out.println();

		    	Student.concentration-=1;
				
				try {
					  Thread.sleep(5000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();

					}
				

				System.out.println();
				System.out.println("                                                    하브루타 파트너 디버프가 끝났습니다.");
				System.out.println();
	
				Student.concentration+=1;
		
			}else{
				
				try {
					  Thread.sleep(5000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();

					}
				
			}
		
		}


		
		
		
		
		
	}

	
	
	
}
