package Four;

public class hungrydamage implements Runnable {


	@Override
	public void run() {
	while(!Thread.currentThread().isInterrupted()) {
		if(Student.hungry<=0) {
			hungry.hungrythread=false;
			
			Student.hungry=0;
			Student.hp-=5;
			if(Student.hp<=0) {
				Student.hp=0;
			}
		    System.out.println();
			System.out.println("                                                x           캐릭터가 허기가져 체력이 깍입니다.  현재 " + Student.name + "의 체력은 "+ Student.hp +"/"+Student.maxhp+ " 입니다.     x ");
			
			
			new die();
			try {
				  Thread.sleep(3000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();

				}
		
		 }else {
			 hungry.hungrythread=true;
			  Thread.currentThread().interrupt();
			
		 }
	
	}
	
	}





}
