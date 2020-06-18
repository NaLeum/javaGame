package Four;

import java.util.Random;

public class temper implements Runnable {

	
	public void run() {
	while(!Thread.currentThread().isInterrupted()) {
		Random rn = new Random();
			newstart.gion = 25+rn.nextInt(10)+1;
			System.out.println("현재 온도 : " +newstart.gion);
			
			if(newstart.gion>=32) {
				oneonealba.tempercount++;
			}
			try {
				  Thread.sleep(10000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();

				}
		
		 
	
	}
	
	}

}
