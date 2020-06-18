package Four;

class homework {
	
   public homework(){

	System.out.println("-----------------------------------------------------");
	System.out.println();
	System.out.println("                   과제를 진행합니다.");
	System.out.println();
	System.out.println("-----------------------------------------------------");
	Student.homework = Student.homework+Student.concentration;
	Student.hp-=10;
	Time.count++;
	Student.hungry-=3;  
	if(Student.hungry<=0) {
		 Student.hungry=0;
	  }


	new die();

	   }
   }

class relax{
	
	public relax() {
		    System.out.println("-----------------------------------------------------");
		    System.out.println();
			System.out.println("                  잠시 휴식을 청합니다.");
			System.out.println();
			System.out.println("-----------------------------------------------------");
			Student.hp+=10;
			Time.count++;
			Student.hungry-=3;
			if(Student.hp>=80&&Student.style.equalsIgnoreCase("nohp")) {
				  Student.hp=80;
			  }
			if(Student.hp>=120&&Student.style.equalsIgnoreCase("yeshp")) {
				  Student.hp=120;
			  }
			
			if(Student.hp>=100&&Student.style.equalsIgnoreCase("nomal")) {
				  Student.hp=100;
			  }

			  }
	
}
class die{
	public die() {
		
		if(Student.hp<=0) {
			System.out.println("******* 건강관리를 하지 않아 입원하였습니다. *******");
			System.exit(0);

		}
	}
	
}

