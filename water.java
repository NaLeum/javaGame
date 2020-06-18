package Four;

import java.util.Random;

public class water implements Runnable{

	@Override
	public void run() {
	while(!Thread.currentThread().isInterrupted()) {
		int n=0;
		Random rn = new Random();
		n = rn.nextInt(3);
		int x=0;
		x = rn.nextInt(3)+1;
		int xx= x*1000;
		if(n==0) {
			//안 보고있음
			System.out.println("                             \n" + 
					"           .,:-..             \n" + 
					"          ;!*****!,           \n" + 
					"        .!*=======*,          \n" + 
					"        !*==$$=$==**          \n" + 
					"       .***$$$==$$==*         \n" + 
					"       -*=====*==$$==.        \n" + 
					"       -*=========$==,        \n" + 
					"       ,**===$=$==$=*.        \n" + 
					"       .**=====$$$==!         \n" + 
					"        ;*===$===$==!         \n" + 
					"        .-**==$$$===!         \n" + 
					"         .;========*-         \n" + 
					"         .-*=======;          \n" + 
					"         ..;==$$$==.          \n" + 
					"         ..-:!**!~,           \n" + 
					"          ..... .,            \n" + 
					"          .    ..-            \n" + 
					"            .-~:~~-           \n" + 
					"         .--~--*=;~-, ");
			oneonealba.children=false;
			
		}else {
			//보고있음
			System.out.println("\n" + 
				
					"    - -               ,       \n" + 
					"   ,    ;,       .,;;;   ,    \n" + 
					"   ;                   ~      \n" + 
					"      ~                   ,   \n" + 
					"      .                 ! -   \n" + 
					"                        ~ -   \n" + 
					"     ;                  , -   \n" + 
					"     .;@$=;      .##@@=       \n" + 
					"   -  .                       \n" + 
					"   ;    -;.              *    \n" + 
					"    ,  !$@@      ,@@!    .    \n" + 
					"    -   .$*       @@.#  .     \n" + 
					"  :..                         \n" + 
					"  -.!                   -     \n" + 
					"  - =                   - ~   \n" + 
					"   .*        .~           ~   \n" + 
					"   -                      .   \n" + 
					"   ,                     *    \n" + 
					"    ~                         \n" + 
					"     .       ~,        ,.     \n" + 
					"     ,      ,  .       -      \n" + 
					"      .     .  ..     .       \n" + 
					"      :       .       ,       \n" + 
					"       ,       :     .        \n" + 
					"        ~           ,         \n" + 
					"         ,        ..          \n" + 
					"           -,   .,            \n" + 
					"                           ");
			oneonealba.children=true;
		}
		
		try {
			  Thread.sleep(xx);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();

			}
		
		
	}
	}

	
	
	
	
}
