package Four;


public class item {

		static int drink=0;
		static int pass=0;
		static int dosirock=0;
		public static boolean dosirock2=false;
		static int dosirockdate;
		static int dosirockmaxdate;
		static int dosirocktime;
		 public static void drink() {
			 
			if(drink>0) {
				drink-=1;
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("     박카스를 마십니다. 꿀꺽 꿀꺽");
				Student.hp+=5;
				if(Student.hp>=Student.maxhp) {
					Student.hp=Student.maxhp;
				}
				Student.hungry+=3;
				if(Student.hungry>=21) {
					Student.hungry=21;
				}
				System.out.println("        현재 남은 체력:"+Student.hp);
				try {
					  Thread.sleep(200);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					  throw new AssertionError(e);
					}
				System.out.println("     박카스를 마십니다. 꿀꺽 꿀꺽");
				Student.hp+=5;
				if(Student.hp>=Student.maxhp) {
					Student.hp=Student.maxhp;
				}
				Student.hungry+=3;
				if(Student.hungry>=21) {
					Student.hungry=21;
				}
				System.out.println("        현재 남은 체력:"+Student.hp);
				System.out.println();
				System.out.println(" ________________________________");
			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("    현재 사용 가능한 아이템이 없습니다. ");
				System.out.println(" ________________________________");
			}

		 
		 }
		 
		 
		 public static void use() {
				if(pass>0) {
					if(newstart.musclethread==false && newstart.bigmusclethread==false) {
						System.out.println(" ________________________________");
						System.out.println();
						System.out.println("    현재 치료할 근육통이 없습니다. ");
						System.out.println(" ________________________________");
					
					}else {
						pass-=1;
						System.out.println(" ________________________________");
						System.out.println();
						System.out.println("          파스를 붙입니다. ");

						System.out.println("          근육통 치료중...");
						try {
							  Thread.sleep(200);
							} catch (InterruptedException e) {
							  Thread.currentThread().interrupt();
							  throw new AssertionError(e);
							}
						System.out.println("         근육통 치료중...");
						Student.hp+=5;
						Student.hungry+=3;
						System.out.println("       다시 힘을 낼 수 있습니다.");
						System.out.println(" ________________________________");
						newstart.musclethread=false;
						
					}
				}else {
					System.out.println(" ________________________________");
					System.out.println();
					System.out.println("    현재 사용 가능한 아이템이 없습니다. ");
					System.out.println(" ________________________________");
				}

			}
		 
		 public static void eat() {
				if(dosirock>0) {
					if(dosirocktime==Time.count&&dosirockdate==Date.count) {
						System.out.println(" ________________________________");
						System.out.println();
						System.out.println("        방금 싼 도시락입니다. ");
						System.out.println("       바로 먹을 수 없습니다. ");
						System.out.println(" ________________________________");
					
				}else {
				Time.count+=1;
				dosirock-=1;
				dosirock2=false;
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("          도시락을 먹습니다. ");
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					  throw new AssertionError(e);
					}
				System.out.println("           쭈압....");
				Student.hp+=15;
				if(Student.hp>=Student.maxhp) {
					Student.hp=Student.maxhp;
				}
				
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					  throw new AssertionError(e);
					}
				System.out.println("           쭈압...");
				Student.hp+=15;
				if(Student.hp>=Student.maxhp) {
					Student.hp=Student.maxhp;
				}
				Student.hungry=21;
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					  throw new AssertionError(e);
					}
				System.out.println("         도시락을 다먹었습니다.");
				System.out.println(" ________________________________");
					
				}

			}else {
				System.out.println(" ________________________________");
				System.out.println();
				System.out.println("    현재 사용 가능한 아이템이 없습니다. ");
				System.out.println(" ________________________________");
			}
	}}
