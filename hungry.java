package Four;


class hungry {

	public static boolean hungrythread=true;
	public hungry() {
		
		if(Student.hungry<=21&&Student.hungry>15) {

	
			System.out.println("                 캐릭터는 배가 부릅니다.");
		
			
		}
		if(Student.hungry<=15&&Student.hungry>9) {

		   
			System.out.println("                캐릭터의 허기는 적당합니다.");
		
			
		}
		if(Student.hungry<=9&&Student.hungry>0) {

		  
			System.out.println("                캐릭터는 배고픔을 느낍니다.");
	
			
		}
//		if(Student.hungry<=0) {
//			Student.hungry=0;
//		    System.out.println();
//			System.out.println("              캐릭터가 허기가져 체력이 깍입니다.");
//			System.out.println();
//			System.out.println("-----------------------------------------------------");
//			Student.hp-=5;
//			new die();
//		 }
		if(Student.hungry>21) {
			Student.hungry=21;
		}
		
		
		
		
	}
	
	
}
