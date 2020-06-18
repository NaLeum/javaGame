package Four;

import java.util.Random;

public class store implements Runnable {
	
	public void run() {
	while(!Thread.currentThread().isInterrupted()) {
		Random rn = new Random();
		int storeevent = rn.nextInt(10);
		if(storeevent==1) {
			
			System.out.println("지금 부터 박카스 1+1 행사를 시작합니다.");
			newstart.bksevent=true;
			
			try {
				  Thread.sleep(3000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();

				}
		
			System.out.println("********* 끝! **********");
			newstart.bksevent=false;
			
		}else if(storeevent==2) {
			System.out.println("지금 부터 파스 1+1 행사를 시작합니다.");
			newstart.passevent=true;
			
			try {
				  Thread.sleep(3000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();

				}
		
			System.out.println("********* 끝! **********");
			newstart.passevent=false;
		}
		

		try {
			  Thread.sleep(10000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();

			}
		
	}
	
	}

}
