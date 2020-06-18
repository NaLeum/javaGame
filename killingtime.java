package Four;

public class killingtime {
	
	public killingtime(){
		
		if(Time.count<12) {
			 System.out.print("Loading");
			  for (int i = 0; i < 30; i++) {
			   System.out.print("▶");
			   try {
				   Thread.sleep(100);
				 } catch (InterruptedException e) {
				   Thread.currentThread().interrupt();
				   throw new AssertionError(e);
				 }
			  }
			  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			Time.count=12;
		}else if(Time.count>=13&&Time.count<18) {
			 System.out.print("Loading");
			  for (int i = 0; i < 30; i++) {
			   System.out.print("▶");
			   try {
				   Thread.sleep(100);
				 } catch (InterruptedException e) {
				   Thread.currentThread().interrupt();
				   throw new AssertionError(e);
				 }
			  }
			  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			Time.count=18;
			
		}else if(Time.count>=19) {
			 
			Time.count=22;
			
		}else {
			System.out.println();
			System.out.println("아직은 할 수 있는일이 남아있습니다.");
			System.out.println();
		}
		
		
		
	}

}
